package com.emlhy.kotlinnews.repository

import androidx.lifecycle.LiveData
import com.emlhy.kotlinnews.data.RedditEntry

interface RedditRepository {

    suspend fun fetchRedditData(): LiveData<RedditEntry>
}