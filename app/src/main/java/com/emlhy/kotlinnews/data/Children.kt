package com.emlhy.kotlinnews.data

import com.emlhy.kotlinnews.data.ChildData
import com.google.gson.annotations.SerializedName


data class Children(
    @SerializedName("data")
    val childData: ChildData,
    val kind: String
)