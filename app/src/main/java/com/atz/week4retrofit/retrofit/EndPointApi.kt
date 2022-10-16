package com.atz.week4retrofit.retrofit

import com.atz.week4retrofit.model.MovieDetails
import com.atz.week4retrofit.model.NowPlaying
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface EndPointApi {

    @GET("movie/now_playing")
    suspend fun getNowPlaying(
        @Query("api_key") apiKey:String,
        @Query("language") language:String,
        @Query("page") page:Int,


        ): Response<NowPlaying>

    @GET("movie/{movieId}")
    suspend fun GetMovieDetail(
        @Path("movieId") movieId:Int,
        @Query("api_key") apiKey: String
        ): Response<MovieDetails>
}