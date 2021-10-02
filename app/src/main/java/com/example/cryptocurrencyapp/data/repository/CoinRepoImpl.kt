package com.example.cryptocurrencyapp.data.repository

import com.example.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.example.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.example.cryptocurrencyapp.data.remote.dto.CoinDto
import com.example.cryptocurrencyapp.domain.repository.CoinRepo
import javax.inject.Inject

class CoinRepoImpl @Inject constructor(
    private val coinPaprikaApi: CoinPaprikaApi
): CoinRepo {

    override suspend fun getCoins(): List<CoinDto> {
        return coinPaprikaApi.getCoins()
    }

    override suspend fun getCoinDetail(coinId: String): CoinDetailDto {
        return coinPaprikaApi.getCoinById(coinId)
    }
}