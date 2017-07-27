package com.github.unitimber.core.loggable

/**
 * Something that can potentially perform logging
 */
interface Loggable {
    /**
     * True if logging is enabled
     */
    var loggingEnabled : Boolean
    
    /**
     * Tag to be used while logging
     */
    val logTag: String?
}