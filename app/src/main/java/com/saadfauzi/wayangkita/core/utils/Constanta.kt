package com.saadfauzi.wayangkita.core.utils

class Constanta {
    companion object {
        const val API_KEY =  "55e85c5387ee90d2b10aed97c0d3ec76"
        const val ENDPOINT_TRENDING_MOVIE = "https://api.themoviedb.org/3/trending/all/day?api_key=$API_KEY&page=2"
        const val ENDPOINT_POPULAR_MOVIE = "https://api.themoviedb.org/3/movie/popular?api_key=$API_KEY&language=en-US&page="
        const val ENDPOINT_DISCOVER_MOVIE = "https://api.themoviedb.org/3/discover/movie?api_key=$API_KEY&language=en-US&sort_by=popularity.desc&include_adult=false&include_video=false&page=1&with_watch_monetization_types=free"
    }
}