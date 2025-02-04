package com.kgrevehagen.android.codecchecker

import androidx.annotation.OptIn
import androidx.media3.common.MimeTypes
import androidx.media3.common.util.UnstableApi
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil

@OptIn(UnstableApi::class)
object CodecHelper {

    fun getAC4DecodingCapabilities() =
        MediaCodecUtil.getDecoderInfos(MimeTypes.AUDIO_AC4, false, false)

    fun getFlacDecodingCapabilities() =
        MediaCodecUtil.getDecoderInfos(MimeTypes.AUDIO_FLAC, false, false)

    fun getRawDecodingCapabilities() =
        MediaCodecUtil.getDecoderInfos(MimeTypes.AUDIO_RAW, false, false)
}
