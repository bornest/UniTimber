package com.github.unitimber.core

/**
 * Created by nbv54 on 14-Apr-17.
 */
@Suppress("NOTHING_TO_INLINE")
abstract class AbstractLogger {
    open val VERBOSE: Int = 2
    open val DEBUG: Int = 3
    open val INFO: Int = 4
    open val WARN: Int = 5
    open val ERROR: Int = 6
    open val ASSERT: Int = 7
    open val SUPPRESS: Int
        get() = ASSERT + 1

    open var level : Int = 2
        set(value) {
            if (value in VERBOSE..SUPPRESS) {
                field = value
            } else {
                throw IllegalArgumentException(
                    "Invalid log level! Log level value has to be in range $VERBOSE..$SUPPRESS. Use predefined values.")
            }
        }

    inline fun println(priority: Int, tag: String, msg: String): Int {
        if (priority !in VERBOSE..ASSERT) {
            throw IllegalArgumentException(
                "Invalid log priority! Log priority value has to be in range $VERBOSE..$ASSERT.")
        }

        if (priority >= level) {
            return doPrintln(priority, tag, msg)
        } else {
            return 0
        }
    }
    abstract fun doPrintln(priority: Int, tag: String, msg: String) : Int

    inline fun wtf(tag: String, msg: String): Int {
        if (level <= ASSERT) {
            return doWTF(tag, msg)
        } else {
            return 0
        }
    }
    abstract fun doWTF(tag: String, msg: String) : Int
}