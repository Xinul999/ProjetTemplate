package com.julien.projetrecensement.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.julien.projetrecensement.presentation.PapillonScreen
import kotlinx.serialization.Serializable


@Serializable
object PapillonsListRoute {}

@Serializable
data class PapillonDetailRoute(val id: Int) {}


@Composable
fun AppNavigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = PapillonsListRoute,
        modifier = modifier,
    ) {
        composable<PapillonsListRoute> {
            PapillonScreen(
                //onButterflyClick = { id -> navController.navigate(PapillonDetailRoute(id)) },
            )
        }
        composable<PapillonDetailRoute> { entry ->
            val route = entry.toRoute<PapillonDetailRoute>()
            // PapillonDetailScreen(butterflyId = route.id)
        }
    }
}

