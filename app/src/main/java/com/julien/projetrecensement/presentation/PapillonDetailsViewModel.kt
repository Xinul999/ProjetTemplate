package com.julien.projetrecensement.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.julien.projetrecensement.data.model.Papillon
import com.julien.projetrecensement.data.remote.PapillonApi
import kotlinx.coroutines.launch

class PapillonDetailsViewModel(papillonId: Int, private val papillonApi: PapillonApi): ViewModel() {
    var papillon by mutableStateOf<Papillon?>(null)

    init {
        viewModelScope.launch {
            papillon = papillonApi.getDetailsPapillon(papillonId)
        }
    }
}