package pe.edu.upc.moviecompose.screens.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Home(
    navController: NavController
){
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Button(
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            onClick = {
            navController.navigate("Popular")
        }) {
            Text(text = "Popular")
        }
        Button(
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            onClick = {
            navController.navigate("Favorites")
        }) {
            Text(text = "Favorites")
        }
    }
}