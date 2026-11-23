package com.julien.projetrecensement.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import org.koin.compose.viewmodel.koinViewModel

@Composable
fun PapillonScreen(papillonViewModel: PapillonViewModel = koinViewModel(), onPapillonClick: (Int) -> (Unit)){
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
        ) {
            items(papillonViewModel.papillions, key = {it.id} ){ papillon->
                ListItem(
                    modifier = Modifier.clickable{onPapillonClick(papillon.id)},
                    headlineContent = {
                    Row() {
                        Text(papillon.nom)
                        Spacer(Modifier.width(4.dp))
                        Text(papillon.texte)
                    }
                })
            }
        }
}
