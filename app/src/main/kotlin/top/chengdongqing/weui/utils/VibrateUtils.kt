package top.chengdongqing.weui.utils

import android.content.Context
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager

fun Context.vibrateShort() {
    vibrate(15)
}

fun Context.vibrateLong() {
    vibrate(400)
}

fun Context.vibrate(milliseconds: Long) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
        val vibrator = getSystemService(
            Context.VIBRATOR_MANAGER_SERVICE
        ) as VibratorManager
        vibrator.defaultVibrator.vibrate(
            VibrationEffect.createOneShot(
                milliseconds,
                VibrationEffect.DEFAULT_AMPLITUDE
            )
        )
    } else {
        @Suppress("DEPRECATION")
        val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        @Suppress("DEPRECATION")
        vibrator.vibrate(milliseconds)
    }
}