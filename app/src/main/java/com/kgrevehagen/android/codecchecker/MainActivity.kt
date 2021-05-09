package com.kgrevehagen.android.codecchecker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        for (codecInfo in CodecHelper.getFlacDecodingCapabilities()) {
            println("flac $codecInfo")
        }

        for (codecInfo in CodecHelper.getRawDecodingCapabilities()) {
            println("raw $codecInfo")
        }

        for (codecInfo in CodecHelper.getAC4DecodingCapabilities()) {
            println("ac4 $codecInfo")
        }

    }
}
