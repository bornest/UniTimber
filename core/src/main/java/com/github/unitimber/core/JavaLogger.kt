package com.github.unitimber.core

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

/**
 * Logger that prints logs with System.out.println
 */
class JavaLogger(
    private val logTimestamps: Boolean = true,
    private val timestampFormat: String = "MM-dd HH:mm:ss.SSS"
) : AbstractLogger() {
    private var dtFormat: DateFormat? = null

    init {
        if (logTimestamps) {
            try {
                dtFormat = SimpleDateFormat(timestampFormat)
            } catch (e: Exception) {
                dtFormat = null
            }
        }
    }

    override fun doPrintln(priority: Int, tag: String, msg: String): Int {
        val label = when (priority) {
            VERBOSE -> "V"
            DEBUG -> "D"
            INFO -> "I"
            WARN -> "W"
            ERROR -> "E"
            else -> ""
        }

        if (logTimestamps && dtFormat != null) {
            val timeStamp = dtFormat?.format(Date(System.currentTimeMillis())) ?: ""
            System.out.println("$timeStamp $label/$tag: $msg")
        } else {
            System.out.println("$label/$tag: $msg")
        }

        return 1
    }

    override fun doWTF(tag: String, msg: String): Int {
        if (logTimestamps && dtFormat != null) {
            val timeStamp = dtFormat?.format(Date(System.currentTimeMillis())) ?: ""
            System.out.println("$timeStamp A/$tag: $msg")
        } else {
            System.out.println("A/$tag: $msg")
        }
        return 1
    }
}

