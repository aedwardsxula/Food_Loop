package com.example.ppfood

import android.util.Log
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.Json

val client = HttpClient(CIO) {
    install(ContentNegotiation) {
        json(Json { ignoreUnknownKeys = true })
    }
}

suspend fun searchProducts(query: String): List<PriceProductItem> {
    val response: ProductsResponse =
        client.get("https://prices.openfoodfacts.org/api/v1/products") {
            parameter("product_name__like", query)
        }.body()

    return response.items
}

suspend fun getProductPrices(productId: Int): PricesResponse {
    val response: PricesResponse =
        client.get("https://prices.openfoodfacts.org/api/v1/prices") {
            parameter("product_id", productId)
        }.body()

    return response
}

fun testProductSearch() {
    runBlocking {
        val products = searchProducts("rice")

        Log.d("API_TEST", products.toString())
    }
}

