package com.kgrevehagen.android.codecchecker

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil
import com.google.android.exoplayer2.util.MimeTypes
import java.util.Collections

object CodecHelper {

    fun hasAC4DecodingCapabilities() =
        MediaCodecUtil.getDecoderInfos(MimeTypes.AUDIO_AC4, false, false)
            .isNotEmpty()

    fun hasFlacDecodingCapabilities() =
        MediaCodecUtil.getDecoderInfos(MimeTypes.AUDIO_FLAC, false, false)
            .isNotEmpty()

    fun hasRawDecodingCapabilities() =
        MediaCodecUtil.getDecoderInfos(MimeTypes.AUDIO_RAW, false, false)
            .isNotEmpty()

    fun getAC4DecodingCapabilities() =
        MediaCodecUtil.getDecoderInfos(MimeTypes.AUDIO_AC4, false, false)

    fun getFlacDecodingCapabilities() =
        MediaCodecUtil.getDecoderInfos(MimeTypes.AUDIO_FLAC, false, false)

    fun getRawDecodingCapabilities() =
        MediaCodecUtil.getDecoderInfos(MimeTypes.AUDIO_RAW, false, false)


//    fun yo(mimeType: String, secure: Boolean, tunneling: Boolean){
//            val key = CodecKey(mimeType, secure, tunneling)
//            var mediaCodecList = if (Util.SDK_INT >= 21)
//                MediaCodecListCompatV21(secure, tunneling)
//            else
//                MediaCodecListCompatV16()
//            var decoderInfos = getDecoderInfosInternal(key, mediaCodecList)
//            if (secure && decoderInfos.isEmpty() && 21 <= Util.SDK_INT && Util.SDK_INT <= 23) {
//                // Some devices don't list secure decoders on API level 21 [Internal: b/18678462]. Try the
//                // legacy path. We also try this path on API levels 22 and 23 as a defensive measure.
//                mediaCodecList = MediaCodecListCompatV16()
//                decoderInfos = getDecoderInfosInternal(key, mediaCodecList)
//                if (!decoderInfos.isEmpty()) {
//                    Log.w(
//                        TAG, "MediaCodecList API didn't list secure decoder for: " + mimeType
//                                + ". Assuming: " + decoderInfos.get(0).name
//                    )
//                }
//            }
//            applyWorkarounds(mimeType, decoderInfos)
//            val unmodifiableDecoderInfos =
//                Collections.unmodifiableList<MediaCodecInfo>(decoderInfos)
//            decoderInfosCache.put(key, unmodifiableDecoderInfos)
//            return unmodifiableDecoderInfos
//    }
}
