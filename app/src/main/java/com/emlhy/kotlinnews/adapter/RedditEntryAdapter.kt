package com.emlhy.kotlinnews.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.emlhy.kotlinnews.R
import com.emlhy.kotlinnews.data.Children
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import java.lang.Exception

class RedditEntryAdapter(private val onItemClickListener: OnItemClickListener) : RecyclerView.Adapter<RedditEntryAdapter.ViewHolder>() {
    private val childrenList = ArrayList<Children>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RedditEntryAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_entry, parent, false)
        return ViewHolder(view, onItemClickListener)
    }

    override fun getItemCount(): Int {
        return childrenList.size
    }

    override fun onBindViewHolder(holder: RedditEntryAdapter.ViewHolder, position: Int) {
        val title = childrenList[position].childData.title;
        val thumbnailUrl = childrenList[position].childData.thumbnail;
        if (thumbnailUrl.isNotEmpty()) {
            Picasso.get().load(thumbnailUrl).into(holder.thumbnail, object: Callback{
                override fun onSuccess() {
                    holder.thumbnail.visibility = View.VISIBLE
                }

                override fun onError(e: Exception?) {
                    holder.thumbnail.visibility = View.GONE
                }

            } )
        } else
            holder.thumbnail.visibility = View.GONE
        holder.title.text = title
    }

    class ViewHolder(itemView: View, onItemClickListener: OnItemClickListener) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        var thumbnail: ImageView = itemView.findViewById(R.id.thumbnail)
        var title: TextView = itemView.findViewById(R.id.title)
        private var onItemClickListener: OnItemClickListener = onItemClickListener

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            onItemClickListener.onItemClick(adapterPosition)
        }
    }

    fun setChildrenList(childrenList: List<Children>) {
        this.childrenList.clear()
        this.childrenList.addAll(childrenList)
    }

    fun getChildrenList() : List<Children> {
        return this.childrenList
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}