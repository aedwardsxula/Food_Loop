package com.example.ppfood

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun HomeScreen() = EmptyScreen("Home")

@Composable
fun PlanMealsScreen() = EmptyScreen("Plan meals")

@Composable
fun MyPlanScreen() = EmptyScreen("My Plan")

@Composable
fun ResourcesScreen() = EmptyScreen("Resources")

@Composable
private fun EmptyScreen(title: String) {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(title)
    }
}

@Composable
fun AppNavHost(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController, startDestination = Destination.HOME.route, modifier = modifier) {
        composable(Destination.HOME.route) { HomeScreen() }
        composable(Destination.PLAN_MEALS.route) { PlanMealsScreen() }
        composable(Destination.MY_PLAN.route) { MyPlanScreen() }
        composable(Destination.RESOURCES.route) { ResourcesScreen() }
    }
}