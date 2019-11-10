package com.emlhy.kotlinnews.data

import com.emlhy.kotlinnews.data.EntryData
import com.google.gson.annotations.SerializedName


data class RedditEntry(
    @SerializedName("data")
    val entryData: EntryData,
    val kind: String
)