package com.julien.projetrecensement.data.model

import kotlinx.serialization.Serializable


@Serializable
data class Papillon(
    val id : Int,
    val nom: String,
    val image: String,
    val texte: String
)
