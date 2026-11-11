package com.julien.projetrecensement.di

import com.julien.projetrecensement.data.remote.PapillonApi
import com.julien.projetrecensement.data.remote.createHttpClient
import com.julien.projetrecensement.presentation.PapillonViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module


val appModule = module {
    // get => recuperer le paramètre
    viewModel { PapillonViewModel(get()) }
    single { createHttpClient() }
    single { PapillonApi(get()) }
}