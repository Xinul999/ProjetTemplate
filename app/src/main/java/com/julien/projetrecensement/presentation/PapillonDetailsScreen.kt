package com.julien.projetrecensement.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.julien.projetrecensement.data.remote.BASE_URL
import org.koin.androidx.compose.koinViewModel
import org.koin.core.parameter.parametersOf


@Composable
fun PapillonDetailsScreen(
    papillonId: Int,
    papillonDetailsViewModel: PapillonDetailsViewModel = koinViewModel(parameters = {
        parametersOf(
            papillonId
        )
    })
) {
    val papillonDetail = papillonDetailsViewModel.papillon ?: return
    Column() {
        AsyncImage(model= "$BASE_URL/${papillonDetail.image}", contentDescription = "$papillonDetail.nom")
        Text(papillonDetail.nom)
        Spacer(Modifier.height(4.dp))
        Text(papillonDetail.texte)
    }
}