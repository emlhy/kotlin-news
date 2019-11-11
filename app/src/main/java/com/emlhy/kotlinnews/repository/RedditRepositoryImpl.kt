package com.emlhy.kotlinnews.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.emlhy.kotlinnews.data.RedditEntry
import com.emlhy.kotlinnews.network.NoConnectivityException
import com.emlhy.kotlinnews.network.RedditApiService

class RedditRepositoryImpl(
    private val redditApiService: RedditApiService
) : RedditRepository {

    private val _downloadedRedditEntry = MutableLiveData<RedditEntry>()
    private val downloadedRedditEntry: LiveData<RedditEntry>
        get() = _downloadedRedditEntry

    @Throws(NoConnectivityException::class)
    override suspend fun fetchRedditData(): LiveData<RedditEntry> {
//        try {
        val fetchedRedditEntry = redditApiService
            .getRedditEntry()
            .await()
        _downloadedRedditEntry.postValue(fetchedRedditEntry)
//        } catch (e: NoConnectivityException) {
//            Log.e("Connectivity", "No internet connection", e)
//        }
        return downloadedRedditEntry
    }
}