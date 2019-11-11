package com.emlhy.kotlinnews.ui

import android.os.Build
import android.os.Bundle
import android.text.Html
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.emlhy.kotlinnews.R
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.*
import java.lang.Exception

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val bundle: Bundle? = intent.extras
        val title = bundle?.getString("title", "")
        val body = bundle?.getString("body", "")
        val imageUrl = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Html.fromHtml(bundle?.getString("image_url", ""), Html.FROM_HTML_MODE_COMPACT).toString()
        } else {
            Html.fromHtml(bundle?.getString("image_url", "")).toString()
        }

        val actionBar = supportActionBar
        actionBar!!.title = title

        detail_title.text = title
        detail_body.text = body
        if (imageUrl != null && imageUrl.isNotEmpty()) {
            Picasso.get().load(imageUrl).into(detail_image, object: Callback {
                override fun onSuccess() {
                    detail_image.visibility = View.VISIBLE
                }

                override fun onError(e: Exception?) {
                    detail_image.visibility = View.GONE
                }

            } )
        } else
            detail_image.visibility = View.GONE
    }
}