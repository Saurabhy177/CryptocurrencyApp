package com.example.cryptocurrencyapp.di

import com.example.cryptocurrencyapp.common.Constants
import com.example.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.example.cryptocurrencyapp.data.repository.CoinRepoImpl
import com.example.cryptocurrencyapp.domain.repository.CoinRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * The "InstallIn" annotation specifies for how long the injected dependencies will live.
 * Here, "SingletonComponent" class means all the dependencies live as long as our application.
 * */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    /**
     * The "Singleton" annotation ensures there is only single instance throughout the whole
     * lifetime of our app.
     * */
    @Provides
    @Singleton
    fun providesPaprikaApi(): CoinPaprikaApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaApi::class.java)
    }

    @Provides
    @Singleton
    fun providesCoinRepoImpl(api: CoinPaprikaApi): CoinRepo {
        return CoinRepoImpl(api)
    }
}