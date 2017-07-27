package com.github.unitimber.core

@Suppress("NOTHING_TO_INLINE")

/**
 * Abstract logger that can perform logging on different levels
 */
abstract class AbstractLogger {
    /**
     * Code of VERBOSE log level
     */
    open val VERBOSE: Int = 2
    
    /**
     * Code of DEBUG log level
     */
    open val DEBUG: Int = 3
    
    /**
     * Code of INFO log level
     */
    open val INFO: Int = 4
    
    /**
     * Code of WARN log level
     */
    open val WARN: Int = 5
    
    /**
     * Code of ERROR log level
     */
    open val ERROR: Int = 6
    
    /**
     * Code of ASSERT log level
     */
    open val ASSERT: Int = 7
    
    /**
     * Code that corresponds to level that's higher than any existing log level
     */
    open val SUPPRESS: Int
        get() = ASSERT + 1
    
    /**
     * Current log level of this logger
     */
    open var level : Int = 2
        set(value) {
            if (value in VERBOSE..SUPPRESS) {
                field = value
            } else {
                throw IllegalArgumentException(
                    "Invalid log level! Log level value has to be in range $VERBOSE..$SUPPRESS. Use predefined values.")
            }
        }
    
    /**
     * Log message with specified tag on specified level
     *
     * @param priority log level on which the logging will be performed
     * @param tag log tag to use
     * @param msg log message
     */
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