package com.emlhy.kotlinnews.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.emlhy.kotlinnews.R
import com.emlhy.kotlinnews.adapter.RedditEntryAdapter
import com.emlhy.kotlinnews.network.ConnectivityInterceptorImpl
import com.emlhy.kotlinnews.network.NoConnectivityException
import com.emlhy.kotlinnews.network.RedditApiService
import com.emlhy.kotlinnews.repository.RedditRepositoryImpl
import com.emlhy.kotlinnews.viewmodel.RedditViewModel
import com.emlhy.kotlinnews.viewmodel.RedditViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.launch

class MainActivity : ScopedActivity(), RedditEntryAdapter.OnItemClickListener {

    private lateinit var viewModel: RedditViewModel
    private lateinit var viewModelFactory: RedditViewModelFactory
    private lateinit var redditEntryAdapter: RedditEntryAdapter
    private lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiService = RedditApiService(ConnectivityInterceptorImpl(this))
        val redditRepository = RedditRepositoryImpl(apiService)
        viewModelFactory = RedditViewModelFactory(redditRepository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(RedditViewModel::class.java)

        bindUI()
    }

    private fun bindUI() = launch{
        try {
            val redditEntry = viewModel.redditEntry.await()
            redditEntryAdapter = RedditEntryAdapter(this@MainActivity)
            linearLayoutManager = LinearLayoutManager(this@MainActivity)
            reddit_recycler_view.layoutManager = linearLayoutManager

            redditEntry.observe(this@MainActivity, Observer {

                redditEntryAdapter.setChildrenList(it.entryData.children)
                reddit_recycler_view.adapter = redditEntryAdapter

                progressBar.visibility = View.GONE
            })


        } catch (e: NoConnectivityException) {
            progressBar.visibility = View.GONE
            Toast.makeText(this@MainActivity, "No internet connection", Toast.LENGTH_SHORT).show()
        }

    }

    override fun onItemClick(position: Int) {
        val child = redditEntryAdapter.getChildrenList().get(position)
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("title", child.childData.title)
        intent.putExtra("body", child.childData.selftext)
        if (child.childData.thumbnail.isNotEmpty() && !child.childData.thumbnail.equals("self") && child.childData.preview != null)
            intent.putExtra("image_url", child.childData.preview.images[0].source.url)
        startActivity(intent)
    }
}
