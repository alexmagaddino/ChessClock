package it.alexm.chessclock.dialog

import android.os.Bundle
import androidx.fragment.app.DialogFragment

/**
 * created by alexm on 3/17/21
 */
class SettingsDialog : DialogFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, android.R.style.Theme_Black_NoTitleBar_Fullscreen)
    }
}