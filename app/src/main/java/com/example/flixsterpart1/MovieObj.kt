package com.example.flixsterpart1

import com.google.gson.annotations.SerializedName
class MovieObj {
    @JvmField
    @SerializedName("title")
    var title: String? = null

    @SerializedName("overview")
    var description: String? = null

    @SerializedName("poster_path")
    var imageURL: String? = null
}