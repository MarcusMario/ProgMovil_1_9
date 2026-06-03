package mx.unam.http

import mx.unam.model.ModeloDog
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ServiceAPI {

    @GET
    suspend fun getBreedByDogs(@Url url: String): Response<ModeloDog>
}