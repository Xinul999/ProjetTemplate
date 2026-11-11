package com.julien.projetrecensement.presentation

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import org.koin.compose.viewmodel.koinViewModel

@Composable
fun PapillonScreen(papillonViewModel: PapillonViewModel = koinViewModel()){
    Scaffold { padding ->

        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(padding)
        ) {
            items(papillonViewModel.papillions, key = {it.id} ){
                ListItem(headlineContent = {
                    Row() {
                        Text(it.nom)
                        Spacer(Modifier.width(4.dp))
                        Text(it.texte)
                    }
                })
            }
        }

    }

}
