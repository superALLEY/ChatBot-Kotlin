package com.example.projetsession

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiService {

    companion object {

        private val BASE_URL = "https://openrouter.ai/"

        private val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        // New POST method
        fun createMessage(request: Request): Call<Reponse> {
            val api = retrofit.create(ApiInterface :: class.java)
            return api.createMessage(request)

        }

    }


}