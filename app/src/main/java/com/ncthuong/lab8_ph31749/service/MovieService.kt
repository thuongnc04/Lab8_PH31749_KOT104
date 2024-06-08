package com.ncthuong.lab8_ph31749.service

import com.ncthuong.lab8_ph31749.response.MovieResponse
import retrofit2.Response
import retrofit2.http.GET

interface MovieService {
    @GET("Movies")
    suspend fun getListFilms(): Response<List<MovieResponse>>
}