package com.emlhy.kotlinnews.viewmodel

import androidx.lifecycle.ViewModel
import com.emlhy.kotlinnews.repository.RedditRepository

class RedditViewModel(
    private val redditRepository: RedditRepository
) : ViewModel(){
    val redditEntry by lazyDeferred {
        redditRepository.fetchRedditData()
    }
}