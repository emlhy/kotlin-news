package com.emlhy.kotlinnews.data

import com.emlhy.kotlinnews.data.Image


data class Preview(
    val enabled: Boolean,
    val images: List<Image>
)