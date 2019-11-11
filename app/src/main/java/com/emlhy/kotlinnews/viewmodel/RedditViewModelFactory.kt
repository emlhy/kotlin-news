package com.emlhy.kotlinnews.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.emlhy.kotlinnews.repository.RedditRepository

class RedditViewModelFactory(
    private val redditRepository: RedditRepository
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return RedditViewModel(redditRepository) as T
    }
}