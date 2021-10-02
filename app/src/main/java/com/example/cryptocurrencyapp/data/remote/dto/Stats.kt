package com.example.cryptocurrencyapp.data.remote.dto


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Stats(
    @SerializedName("contributors")
    val contributors: Int,
    @SerializedName("followers")
    val followers: Int,
    @SerializedName("stars")
    val stars: Int,
    @SerializedName("subscribers")
    val subscribers: Int
)