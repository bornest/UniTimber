@file:Suppress("NOTHING_TO_INLINE")

package com.github.unitimber.core.extensions

import com.github.unitimber.core.AbstractLogger
import com.github.unitimber.core.UniTimber


/*
 * Advanced UniTimber Logging Extension functions for more idiomatic use
 */

/**
 * Plant UniTimber Debug tree with specified logger
 *
 * @param T type of logger
 * @param loggerFactory function that returns a logger of type T
 */
inline fun <T : AbstractLogger> uniTimberPlantDebugTree(loggerFactory: () -> T)
    = loggerFactory().also { UniTimber.plant(UniTimber.DebugTree(it)) }

//region Custom Tag and logCondition support

    //region UniTimber.v
        /** Delegates the provided message to [UniTimber.v] if any trees are planted. */
        inline fun v(tag: String, message: () -> String) = ifPlanted { UniTimber.tag(tag).v(message()) }

        /** Delegates the provided message to [UniTimber.v] if any trees are planted. */
        inline fun v(tag: String, throwable: Throwable, message: () -> String) = ifPlanted { UniTimber.tag(tag).v(throwable, message()) }

        /** Delegates the throwable to [UniTimber.v] if any trees are planted. */
        inline fun v(tag: String, throwable: Throwable) = ifPlanted { UniTimber.tag(tag).v(throwable) }

        /** Delegates the provided message to [UniTimber.v] if any trees are planted. */
        inline fun v(logCondition: Boolean = true, tag: String? = null, message: () -> String) {
            if (logCondition) {
                if (tag != null) {
                    v(tag, message)
                } else {
                    v(message)
                }
            }
        }

        /** Delegates the provided message to [UniTimber.v] if any trees are planted. */
        inline fun v(logCondition: Boolean = true, tag: String? = null, throwable: Throwable, message: () -> String)
        {
            if (logCondition)
            {
                if (tag != null)
                {
                    v(tag, throwable, message)
                }
                else
                {
                    v(throwable, message)
                }
            }
        }

        /** Delegates the throwable to [UniTimber.v] if any trees are planted. */
        inline fun v(logCondition: Boolean = true, tag: String? = null, throwable: Throwable)
        {
            if (logCondition)
            {
                if (tag != null)
                {
                    v(tag, throwable)
                }
                else
                {
                    v(throwable)
                }
            }
        }

//endregion

    //region UniTimber.d
        /** Delegates the provided message to [UniTimber.d] if any trees are planted. */
        inline fun d(tag: String, message: () -> String) = ifPlanted { UniTimber.tag(tag).d(message()) }

        /** Delegates the provided message to [UniTimber.d] if any trees are planted. */
        inline fun d(tag: String, throwable: Throwable, message: () -> String) = ifPlanted { UniTimber.tag(tag).d(throwable, message()) }

        /** Delegates the throwable to [UniTimber.d] if any trees are planted. */
        inline fun d(tag: String, throwable: Throwable) = ifPlanted { UniTimber.tag(tag).d(throwable) }

        /** Delegates the provided message to [UniTimber.d] if any trees are planted. */
        inline fun d(logCondition: Boolean = true, tag: String? = null, message: () -> String)
        {
            if (logCondition)
            {
                if (tag != null)
                {
                    d(tag, message)
                }
                else
                {
                    d(message)
                }
            }
        }

        /** Delegates the provided message to [UniTimber.d] if any trees are planted. */
        inline fun d(logCondition: Boolean = true, tag: String? = null, throwable: Throwable, message: () -> String)
        {
            if (logCondition)
            {
                if (tag != null)
                {
                    d(tag, throwable, message)
                }
                else
                {
                    d(throwable, message)
                }
            }
        }

        /** Delegates the throwable to [UniTimber.d] if any trees are planted. */
        inline fun d(logCondition: Boolean = true, tag: String? = null, throwable: Throwable)
        {
            if (logCondition)
            {
                if (tag != null)
                {
                    d(tag, throwable)
                }
                else
                {
                    d(throwable)
                }
            }
        }

//endregion

    //region UniTimber.i
        /** Delegates the provided message to [UniTimber.i] if any trees are planted. */
        inline fun i(tag: String, message: () -> String) = ifPlanted { UniTimber.tag(tag).i(message()) }

        /** Delegates the provided message to [UniTimber.i] if any trees are planted. */
        inline fun i(tag: String, throwable: Throwable, message: () -> String) = ifPlanted { UniTimber.tag(tag).i(throwable, message()) }

        /** Delegates the throwable to [UniTimber.i] if any trees are planted. */
        inline fun i(tag: String, throwable: Throwable) = ifPlanted { UniTimber.tag(tag).i(throwable) }

        /** Delegates the provided message to [UniTimber.i] if any trees are planted. */
        inline fun i(logCondition: Boolean = true, tag: String? = null, message: () -> String)
        {
            if (logCondition)
            {
                if (tag != null)
                {
                    i(tag, message)
                }
                else
                {
                    i(message)
                }
            }
        }

        /** Delegates the provided message to [UniTimber.i] if any trees are planted. */
        inline fun i(logCondition: Boolean = true, tag: String? = null, throwable: Throwable, message: () -> String)
        {
            if (logCondition)
            {
                if (tag != null)
                {
                    i(tag, throwable, message)
                }
                else
                {
                    i(throwable, message)
                }
            }
        }

        /** Delegates the throwable to [UniTimber.i] if any trees are planted. */
        inline fun i(logCondition: Boolean = true, tag: String? = null, throwable: Throwable)
        {
            if (logCondition)
            {
                if (tag != null)
                {
                    i(tag, throwable)
                }
                else
                {
                    i(throwable)
                }
            }
        }

//endregion

    //region UniTimber.w
        /** Delegates the provided message to [UniTimber.w] if any trees are planted. */
        inline fun w(tag: String, message: () -> String) = ifPlanted { UniTimber.tag(tag).w(message()) }

        /** Delegates the provided message to [UniTimber.w] if any trees are planted. */
        inline fun w(tag: String, throwable: Throwable, message: () -> String) = ifPlanted { UniTimber.tag(tag).w(throwable, message()) }

        /** Delegates the throwable to [UniTimber.w] if any trees are planted. */
        inline fun w(tag: String, throwable: Throwable) = ifPlanted { UniTimber.tag(tag).w(throwable) }

        /** Delegates the provided message to [UniTimber.w] if any trees are planted. */
        inline fun w(logCondition: Boolean = true, tag: String? = null, message: () -> String)
        {
            if (logCondition)
            {
                if (tag != null)
                {
                    w(tag, message)
                }
                else
                {
                    w(message)
                }
            }
        }

        /** Delegates the provided message to [UniTimber.w] if any trees are planted. */
        inline fun w(logCondition: Boolean = true, tag: String? = null, throwable: Throwable, message: () -> String)
        {
            if (logCondition)
            {
                if (tag != null)
                {
                    w(tag, throwable, message)
                }
                else
                {
                    w(throwable, message)
                }
            }
        }

        /** Delegates the throwable to [UniTimber.w] if any trees are planted. */
        inline fun w(logCondition: Boolean = true, tag: String? = null, throwable: Throwable)
        {
            if (logCondition)
            {
                if (tag != null)
                {
                    w(tag, throwable)
                }
                else
                {
                    w(throwable)
                }
            }
        }

//endregion

    //region UniTimber.e
        /** Delegates the provided message to [UniTimber.e] if any trees are planted. */
        inline fun e(tag: String, message: () -> String) = ifPlanted { UniTimber.tag(tag).e(message()) }

        /** Delegates the provided message to [UniTimber.e] if any trees are planted. */
        inline fun e(tag: String, throwable: Throwable, message: () -> String) = ifPlanted { UniTimber.tag(tag).e(throwable, message()) }

        /** Delegates the throwable to [UniTimber.e] if any trees are planted. */
        inline fun e(tag: String, throwable: Throwable) = ifPlanted { UniTimber.tag(tag).e(throwable) }

        /** Delegates the provided message to [UniTimber.e] if any trees are planted. */
        inline fun e(logCondition: Boolean = true, tag: String? = null, message: () -> String)
        {
            if (logCondition)
            {
                if (tag != null)
                {
                    e(tag, message)
                }
                else
                {
                    e(message)
                }
            }
        }

        /** Delegates the provided message to [UniTimber.e] if any trees are planted. */
        inline fun e(logCondition: Boolean = true, tag: String? = null, throwable: Throwable, message: () -> String)
        {
            if (logCondition)
            {
                if (tag != null)
                {
                    e(tag, throwable, message)
                }
                else
                {
                    e(throwable, message)
                }
            }
        }

        /** Delegates the throwable to [UniTimber.e] if any trees are planted. */
        inline fun e(logCondition: Boolean = true, tag: String? = null, throwable: Throwable)
        {
            if (logCondition)
            {
                if (tag != null)
                {
                    e(tag, throwable)
                }
                else
                {
                    e(throwable)
                }
            }
        }

//endregion

    //region UniTimber.wtf
        /** Delegates the provided message to [UniTimber.w] if any trees are planted. */
        inline fun wtf(tag: String, message: () -> String) = ifPlanted { UniTimber.tag(tag).wtf(message()) }

        /** Delegates the provided message to [UniTimber.w] if any trees are planted. */
        inline fun wtf(tag: String, throwable: Throwable, message: () -> String) = ifPlanted { UniTimber.tag(tag).wtf(throwable, message()) }

        /** Delegates the throwable to [UniTimber.w] if any trees are planted. */
        inline fun wtf(tag: String, throwable: Throwable) = ifPlanted { UniTimber.tag(tag).wtf(throwable) }

        /** Delegates the provided message to [UniTimber.w] if any trees are planted. */
        inline fun wtf(logCondition: Boolean = true, tag: String? = null, message: () -> String)
        {
            if (logCondition)
            {
                if (tag != null)
                {
                    wtf(tag, message)
                }
                else
                {
                    wtf(message)
                }
            }
        }

        /** Delegates the provided message to [UniTimber.w] if any trees are planted. */
        inline fun wtf(logCondition: Boolean = true, tag: String? = null, throwable: Throwable, message: () -> String)
        {
            if (logCondition)
            {
                if (tag != null)
                {
                    wtf(tag, throwable, message)
                }
                else
                {
                    wtf(throwable, message)
                }
            }
        }

        /** Delegates the throwable to [UniTimber.w] if any trees are planted. */
        inline fun wtf(logCondition: Boolean = true, tag: String? = null, throwable: Throwable)
        {
            if (logCondition)
            {
                if (tag != null)
                {
                    wtf(tag, throwable)
                }
                else
                {
                    wtf(throwable)
                }
            }
        }

//endregion

    //region UniTimber.log
    /** Delegates the provided message to [UniTimber.log] if any trees are planted. */
        inline fun log(tag: String, priority: Int, t: Throwable, message: () -> String) = ifPlanted { UniTimber.tag(tag).log(priority, t, message()) }

        /** Delegates the provided message to [UniTimber.log] if any trees are planted. */
        inline fun log(tag: String, priority: Int, message: () -> String) = ifPlanted { UniTimber.tag(tag).log(priority, message()) }

        /** Delegates the throwable to [UniTimber.log]. Made for convenience when called from java */
        inline fun log(tag: String, priority: Int, throwable: Throwable): Unit = ifPlanted { UniTimber.tag(tag).log(priority, throwable) }


        /** Delegates the provided message to [UniTimber.log] if any trees are planted. */
        inline fun log(logCondition: Boolean = true, tag: String? = null, priority: Int, t: Throwable, message: () -> String)
        {
            if (logCondition)
            {
                if (tag != null)
                {
                    log(tag, priority, t, message)
                }
                else
                {
                    log(priority, t, message)
                }
            }
        }

        /** Delegates the provided message to [UniTimber.log] if any trees are planted. */
        inline fun log(logCondition: Boolean = true, tag: String? = null, priority: Int, message: () -> String)
        {
            if (logCondition)
            {
                if (tag != null)
                {
                    log(tag, priority, message)
                }
                else
                {
                    log(priority, message)
                }
            }
        }

        /** Delegates the throwable to [UniTimber.log]. Made for convenience when called from java */
        inline fun log(logCondition: Boolean = true, tag: String? = null, priority: Int, throwable: Throwable): Unit
        {
            if (logCondition)
            {
                if (tag != null)
                {
                    log(tag, priority, throwable)
                }
                else
                {
                    log(priority, throwable)
                }
            }
        }

//endregion

//endregion











