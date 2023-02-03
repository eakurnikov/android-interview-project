package biz.filmeroo.premier.api

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface FilmService {

    @GET("movie/top_rated")
    fun topRated(): Single<ApiFilmListResponse>

    @GET("movie/{movie_id}")
    fun movie(@Path("movie_id") movieId: Long): Single<ApiFilm>

    @GET("search/movie")
    fun search(@Query("query") query: String): Single<ApiFilmListResponse>

    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/"
        const val API_KEY_PARAM = "api_key"

        fun buildImageUrl(path: String) = "https://image.tmdb.org/t/p/w500$path"
    }
}