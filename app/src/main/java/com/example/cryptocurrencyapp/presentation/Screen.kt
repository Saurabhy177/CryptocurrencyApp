package com.example.cryptocurrencyapp.presentation

/**
 * Contains the list of all the screens in app
 * */
sealed class Screen(val route: String) {
    object CoinListScreen: Screen("coin_list_screen")
    object CoinDetailScreen: Screen("coin_detail_screen")
}