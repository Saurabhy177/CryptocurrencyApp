package com.example.cryptocurrencyapp.data.remote

import com.example.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.example.cryptocurrencyapp.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    /**
     * 1) URL for getting all coins list:
     *      https://api.coinpaprika.com/v1/coins
     * 2) URL for getting specific coin detail:
     *      https://api.coinpaprika.com/v1/coins/btc-bitcoin
     * */

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto
}