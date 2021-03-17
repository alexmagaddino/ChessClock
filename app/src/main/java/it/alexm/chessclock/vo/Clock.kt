package it.alexm.chessclock.vo

/**
 * created by alexm on 3/17/21
 */
data class Clock(
    val startTime: Long,
    var currentTime: Long,
    val increment: Long
)