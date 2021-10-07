package pe.edu.upc.moviecompose.data.remote

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET(value = "popular")
    fun fetchMovies(@Query(value = "api_key") apiKey: String):Call<ApiResponse>
}