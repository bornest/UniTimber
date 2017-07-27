package com.github.unitimber.core

import android.util.Log

/**
 * Logger that uses android.util.Log
 */
class AndroidLogger : AbstractLogger() {
    override val VERBOSE = Log.VERBOSE
    override val DEBUG = Log.DEBUG
    override val INFO = Log.INFO
    override val WARN = Log.WARN
    override val ERROR = Log.ERROR
    override val ASSERT = Log.ASSERT

    init {
        level = VERBOSE
    }

    override fun doPrintln(priority: Int, tag: String, msg: String)
        = Log.println(priority, tag, msg)

    override fun doWTF(tag: String, msg: String)
        = Log.wtf(tag, msg)
}