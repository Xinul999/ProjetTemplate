package com.julien.projetrecensement.data.remote

import com.julien.projetrecensement.data.model.Papillon
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

const val BASE_URL = "https://daviddurand.info/D228/butterfly"

class PapillonApi(val client: HttpClient) {

    suspend fun getPapillons(): List<Papillon> {
        return client.get("$BASE_URL/").body()
    }
}