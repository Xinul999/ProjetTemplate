package com.julien.projetrecensement

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.julien.projetrecensement.navigation.AppNavigation
import com.julien.projetrecensement.ui.theme.ProjetTemplateTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // Un seul theme dans android
            ProjetTemplateTheme {
                AppNavigation()
            }
        }
    }
}



