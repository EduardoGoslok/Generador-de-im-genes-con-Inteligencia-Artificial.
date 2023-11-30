package com.example.logogenerator.ui.theme.content

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.logogenerator.ui.theme.component.DataTextField
import com.example.logogenerator.ui.theme.component.TitleText

@Composable
fun DataColum(games: String,
              elements: String,
              onGamesChange: (String) -> Unit,
              onElementsChange: (String) -> Unit){
    Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {

        TitleText("1.Completa los datos")
        
        DataTextField("Videojuego de referencia",games ,onGamesChange )

        DataTextField("Elemento de referencia",elements ,onElementsChange)

    }

}