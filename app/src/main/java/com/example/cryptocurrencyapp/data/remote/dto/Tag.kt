package com.example.cryptocurrencyapp.data.remote.dto


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Tag(
    @SerializedName("coin_counter")
    val coinCounter: Int,
    @SerializedName("ico_counter")
    val icoCounter: Int,
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String
)