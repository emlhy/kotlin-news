package com.emlhy.kotlinnews.data

import com.emlhy.kotlinnews.data.Children


data class EntryData(
    val after: String,
    val before: Any,
    val children: List<Children>,
    val dist: Int,
    val modhash: String
)