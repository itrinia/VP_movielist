package com.atz.week4retrofit.repository

import com.atz.week4retrofit.retrofit.EndPointApi
import javax.inject.Inject

class NowPlayingRepository @Inject constructor(private val api: EndPointApi){
    suspend fun getNowPlayingData(apiKey: String, language: String,
                                  page: Int) = api.getNowPlaying(apiKey, language, page)

    suspend fun getMovieDetailResults(movieId: Int, apiKey: String) =
        api.GetMovieDetail(movieId, apiKey)
}