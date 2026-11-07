package com.example.gerenciamentodecampeonatos.network

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @POST("pessoas")
    suspend fun cadastrarPessoa(@Body pessoa: Pessoa): Response<Pessoa>

    @GET("pessoas")
    suspend fun listarPessoas(): Response<List<Pessoa>>
}
