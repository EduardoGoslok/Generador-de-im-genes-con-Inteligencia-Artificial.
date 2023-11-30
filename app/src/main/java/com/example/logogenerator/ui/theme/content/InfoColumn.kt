package com.example.logogenerator.ui.theme.content

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Compress
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import com.example.logogenerator.LogoGeneratorViewModel
import com.example.logogenerator.ui.theme.LogoGeneratorTheme
import com.example.logogenerator.ui.theme.component.ActionButton
import com.example.logogenerator.ui.theme.component.TitleText

@Composable
fun InfoColumn(context: Context, viewModel: LogoGeneratorViewModel){

    Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
        
        TitleText("2. Introduce información adicional")
        
        ActionButton(
            if (viewModel.recording) "Detener grabación" else "Iniciar grabación",
            Icons.Filled.Mic,
            "Grabación de audio") {
            viewModel.recordAudio(context)
            //Click
        }

        if(viewModel.info.isNotEmpty()) {

            ActionButton("Resumir", Icons.Filled.Compress, "Resume la grabación") {
                //Click
                viewModel.createInfoSummary()
            }
            Text(viewModel.info)
        }
    }
}