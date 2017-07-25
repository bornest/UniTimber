@file:Suppress("NOTHING_TO_INLINE")

package com.github.unitimber.core.loggable.extensions

import com.github.unitimber.core.UniTimber //for docs
import com.github.unitimber.core.extensions.d
import com.github.unitimber.core.extensions.e
import com.github.unitimber.core.extensions.i
import com.github.unitimber.core.extensions.log
import com.github.unitimber.core.extensions.v
import com.github.unitimber.core.extensions.w
import com.github.unitimber.core.extensions.wtf
import com.github.unitimber.core.loggable.Loggable

/**
 * Created by nbv54 on 01-Jun-17.
 */
/** Delegates the provided message to [UniTimber.v] if any trees are planted. */
inline fun Loggable.v(message: () -> String) = v(loggingEnabled, logTag, message)

/** Delegates the provided message to [UniTimber.v] if any trees are planted. */
inline fun Loggable.v(throwable: Throwable, message: () -> String) = v(loggingEnabled, logTag, throwable, message)

/** Delegates the throwable to [UniTimber.v] if any trees are planted. */
inline fun Loggable.v(throwable: Throwable) = v(loggingEnabled, logTag, throwable)

/** Delegates the provided message to [UniTimber.v] if any trees are planted. */
inline fun Loggable.d(message: () -> String) = d(loggingEnabled, logTag, message)

/** Delegates the provided message to [UniTimber.v] if any trees are planted. */
inline fun Loggable.d(throwable: Throwable, message: () -> String) = d(loggingEnabled, logTag, throwable, message)

/** Delegates the throwable to [UniTimber.v] if any trees are planted. */
inline fun Loggable.d(throwable: Throwable) = d(loggingEnabled, logTag, throwable)

/** Delegates the provided message to [UniTimber.v] if any trees are planted. */
inline fun Loggable.i(message: () -> String) = i(loggingEnabled, logTag, message)

/** Delegates the provided message to [UniTimber.v] if any trees are planted. */
inline fun Loggable.i(throwable: Throwable, message: () -> String) = i(loggingEnabled, logTag, throwable, message)

/** Delegates the throwable to [UniTimber.v] if any trees are planted. */
inline fun Loggable.i(throwable: Throwable) = i(loggingEnabled, logTag, throwable)

/** Delegates the provided message to [UniTimber.v] if any trees are planted. */
inline fun Loggable.w(message: () -> String) = w(loggingEnabled, logTag, message)

/** Delegates the provided message to [UniTimber.v] if any trees are planted. */
inline fun Loggable.w(throwable: Throwable, message: () -> String) = w(loggingEnabled, logTag, throwable, message)

/** Delegates the throwable to [UniTimber.v] if any trees are planted. */
inline fun Loggable.w(throwable: Throwable) = w(loggingEnabled, logTag, throwable)

/** Delegates the provided message to [UniTimber.v] if any trees are planted. */
inline fun Loggable.e(message: () -> String) = e(loggingEnabled, logTag, message)

/** Delegates the provided message to [UniTimber.v] if any trees are planted. */
inline fun Loggable.e(throwable: Throwable, message: () -> String) = e(loggingEnabled, logTag, throwable, message)

/** Delegates the throwable to [UniTimber.v] if any trees are planted. */
inline fun Loggable.e(throwable: Throwable) = e(loggingEnabled, logTag, throwable)

/** Delegates the provided message to [UniTimber.v] if any trees are planted. */
inline fun Loggable.wtf(message: () -> String) = wtf(loggingEnabled, logTag, message)

/** Delegates the provided message to [UniTimber.v] if any trees are planted. */
inline fun Loggable.wtf(throwable: Throwable, message: () -> String) = wtf(loggingEnabled, logTag, throwable, message)

/** Delegates the throwable to [UniTimber.v] if any trees are planted. */
inline fun Loggable.wtf(throwable: Throwable) = wtf(loggingEnabled, logTag, throwable)

/** Delegates the provided message to [UniTimber.v] if any trees are planted. */
inline fun Loggable.log(priority: Int, message: () -> String) = log(loggingEnabled, logTag, priority, message)

/** Delegates the provided message to [UniTimber.v] if any trees are planted. */
inline fun Loggable.log(priority: Int, throwable: Throwable, message: () -> String) = log(loggingEnabled, logTag, priority, throwable, message)

/** Delegates the throwable to [UniTimber.v] if any trees are planted. */
inline fun Loggable.log(priority: Int, throwable: Throwable) = log(loggingEnabled, logTag, priority, throwable)