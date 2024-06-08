package com.ncthuong.lab8_ph31749

import com.ncthuong.lab8_ph31749.model.Movie
import com.ncthuong.lab8_ph31749.response.MovieResponse

fun MovieResponse.toMovie(): Movie {
    return Movie(
        id = this.filmId,
        title = this.filmName,
        duration = this.duration,
        releaseDate = this.releaseDate,
        genre = this.genre,
        national = national,
        shotDescription = this.description,
        posterUrl = this.image
    )
}