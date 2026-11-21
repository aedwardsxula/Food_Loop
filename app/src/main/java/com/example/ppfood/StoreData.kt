package com.example.ppfood

data class Store(val name: String,
                 val address: String,
                 val state: String)


val sampleStores = listOf(
    Store("Rouses Market", "701 St Charles Ave, New Orleans", "LA"),
    Store("Walmart Supercenter", "1901 Tchoupitoulas St, New Orleans", "LA"),
    Store("Aldi", "4301 S Carrollton Ave, New Orleans", "LA")
)