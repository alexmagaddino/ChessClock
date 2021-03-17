package it.alexm.chessclock.clock

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import it.alexm.chessclock.R
import it.alexm.chessclock.databinding.ActivityClockBinding
import it.alexm.chessclock.dialog.SettingsDialog

/**
 * created by alexm on 17/03/2021
 */
class ClockActivity : AppCompatActivity(R.layout.activity_clock) {

    private var binding: ActivityClockBinding? = null
    private val viewModel: ClockViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityClockBinding.inflate(layoutInflater)

        binding?.clock1?.setOnClickListener {
            SettingsDialog().show(supportFragmentManager, "Settings")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}