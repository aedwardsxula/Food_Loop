package com.example.ppfood

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() { // all placeholder info
    val savedMeals = 0
    val mealsMade = 0

    Column (Modifier.padding(8.dp)) {
        Card(Modifier.fillMaxWidth().padding(8.dp)) {
            Column(Modifier.padding(16.dp)) {
                Text("Welcome back, {Name}!")
                Text("Ready to find some cheap food?")
            }
        }
        Row(Modifier.fillMaxWidth().height(200.dp)) {
            Card(Modifier.fillMaxHeight().padding(8.dp)) {
                Column(Modifier.padding(16.dp)) {
                    Text("My Plan")
                    Spacer(Modifier.height(8.dp))
                    Text("Saved meals: $savedMeals")
                    Text("Meals made: $mealsMade")
                }
            }
            Card(Modifier.fillMaxHeight().padding(8.dp)) {
                Column(Modifier.padding(16.dp)) {
                    Text("Plan Meals")
                    Spacer(Modifier.height(8.dp))
                    Box(Modifier.fillMaxWidth().height(80.dp), Alignment.Center) {
                        Icon(
                            painterResource(R.drawable.food),
                            null,
                            Modifier.fillMaxSize()
                        )
                    }
                    Spacer(Modifier.height(8.dp))
                    Text("Chicken and Rice")
                }
            }
        }
        Card(Modifier.fillMaxWidth().padding(8.dp)) {
            Column(Modifier.padding(16.dp)) {
                Text("Resources")
                Text("Supermarket: 2.3 miles away")
                Text("111-222-3333")
            }
        }
    }
}

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