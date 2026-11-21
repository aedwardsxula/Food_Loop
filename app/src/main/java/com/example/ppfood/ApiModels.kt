package com.example.ppfood

import kotlinx.serialization.Serializable

@Serializable
data class ProductsResponse(
    val items: List<PriceProductItem>,
    val page: Int,
    val pages: Int,
    val size: Int,
    val total: Int
)

@Serializable
data class PriceProductItem(
    val id: Int,
    val code: String,
    val product_name: String,
    val brands: String? = null,
    val image_url: String? = null,
    val quantity: String? = null,
    val price_count: Int = 0
)


@Serializable
data class PriceItem(
    val id: Int,
    val product_id: Int,
    val price: Double? = null,
    val currency: String? = null,
    val date: String? = null,
    val product: PriceProductItem? = null
)


@Serializable
data class PricesResponse(
    val items: List<PriceItem>,
    val page: Int,
    val pages: Int,
    val size: Int,
    val total: Int
)
