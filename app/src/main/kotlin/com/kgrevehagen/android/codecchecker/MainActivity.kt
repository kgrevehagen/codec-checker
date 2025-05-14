package com.kgrevehagen.android.codecchecker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DisplayCodecCapabilities()
        }
    }

    @Composable
    fun DisplayCodecCapabilities() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.Center)
        ) {
            for (codecInfo in CodecHelper.getFlacDecodingCapabilities()) {
                CapabilitiesText("flac codec: $codecInfo")
            }
            for (codecInfo in CodecHelper.getRawDecodingCapabilities()) {
                CapabilitiesText("raw codec: $codecInfo")
            }
            for (codecInfo in CodecHelper.getAC4DecodingCapabilities()) {
                CapabilitiesText("ac4 codec: $codecInfo")
            }
        }
    }

    @Composable
    fun CapabilitiesText(text: String) {
        Text(
            modifier = Modifier.padding(16.dp, 8.dp),
            text = text,
            color = Color.LightGray,
            fontSize = 22.sp,
        )
    }
}
