package com.example.cryptocurrencyapp.domain.repository

import com.example.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.example.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepo {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinDetail(coinId: String): CoinDetailDto
}