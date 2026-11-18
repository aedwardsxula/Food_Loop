package com.example.ppfood
import androidx.compose.runtime.mutableStateListOf

data class Meal(
    val id: String,
    val name: String,
    val cost: Double,
    val category: String,
    val servings: Int,
    val ingredients: List<String>
)

const val PLAN_BUDGET = 50.00

val savedMeals = mutableStateListOf(
    Meal("1", "Red Beans & Rice with Sausage", 5.50, "Dinner", 4,
        listOf("Red Beans", "White Rice", "Andouille Sausage", "Onion", "Bell Pepper", "Celery")),
    Meal("2", "Chicken & Sausage Gumbo", 8.25, "Dinner", 6,
        listOf("Chicken Thighs", "Smoked Sausage", "Roux Mix", "Okra", "Rice", "Cajun Seasoning")),
    Meal("3", "Tuna Salad Sandwiches", 3.20, "Lunch", 2,
        listOf("Canned Tuna", "Mayonnaise", "Whole Wheat Bread", "Sweet Relish")),
    Meal("4", "Oatmeal with Honey & Bananas", 1.80, "Breakfast", 1,
        listOf("Rolled Oats", "Milk", "Bananas", "Honey"))
)