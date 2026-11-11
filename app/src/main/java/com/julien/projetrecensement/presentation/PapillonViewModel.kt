package com.julien.projetrecensement.presentation

import androidx.compose.runtime.getValue
import androidx.lifecycle.ViewModel

import com.julien.projetrecensement.data.model.Papillon
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.viewModelScope
import com.julien.projetrecensement.data.remote.PapillonApi
import kotlinx.coroutines.launch
import kotlin.collections.listOf

class PapillonViewModel(private val papillonApi: PapillonApi): ViewModel() {
    // TODO call repository here
    var papillions: List<Papillon> by mutableStateOf(emptyList<Papillon>())

    // coroutine => asynchronisme
    init {
        viewModelScope.launch {
            papillions = papillonApi.getPapillons()
        }
    }
    // Observable notify view

}

