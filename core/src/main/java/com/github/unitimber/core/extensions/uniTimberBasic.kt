/*
    Copyright 2016 Paul Woitaschek

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

    Modifications copyright (c) 2017 Borislav Nesterov
*/
@file:Suppress("NOTHING_TO_INLINE")

package com.github.unitimber.core.extensions

import com.github.unitimber.core.UniTimber

/*
 * Basic UniTimber Logging Extension functions for more idiomatic use
 */

/** Invokes an action if any trees are planted */
inline fun ifPlanted(action: () -> Unit) {
    if (UniTimber.treeCount() != 0) {
        action()
    }
}

//region UniTimber.e
/** Delegates the provided message to [UniTimber.e] if any trees are planted. */
    inline fun e(message: () -> String) = ifPlanted { UniTimber.e(message()) }

    /** Delegates the provided message to [UniTimber.e] if any trees are planted. */
    inline fun e(throwable: Throwable, message: () -> String) = ifPlanted { UniTimber.e(throwable, message()) }

    /** Delegates the throwable to [UniTimber.e]. Made for convenience when called from java */
    inline fun e(throwable: Throwable): Unit = ifPlanted { UniTimber.e(throwable) }
//endregion

//region UniTimber.w
/** Delegates the provided message to [UniTimber.w] if any trees are planted. */
    inline fun w(message: () -> String) = ifPlanted { UniTimber.w(message()) }

    /** Delegates the provided message to [UniTimber.w] if any trees are planted. */
    inline fun w(throwable: Throwable, message: () -> String) = ifPlanted { UniTimber.w(throwable, message()) }

    /** Delegates the throwable to [UniTimber.w]. Made for convenience when called from java */
    inline fun w(throwable: Throwable): Unit = ifPlanted { UniTimber.w(throwable) }
//endregion

//region UniTimber.i
/** Delegates the provided message to [UniTimber.i] if any trees are planted. */
    inline fun i(message: () -> String) = ifPlanted { UniTimber.i(message()) }

    /** Delegates the provided message to [UniTimber.i] if any trees are planted. */
    inline fun i(throwable: Throwable, message: () -> String) = ifPlanted { UniTimber.i(throwable, message()) }

    /** Delegates the throwable to [UniTimber.i]. Made for convenience when called from java */
    inline fun i(throwable: Throwable): Unit = ifPlanted { UniTimber.i(throwable) }
//endregion

//region UniTimber.d
/** Delegates the provided message to [UniTimber.d] if any trees are planted. */
    inline fun d(message: () -> String) = ifPlanted { UniTimber.d(message()) }

    /** Delegates the provided message to [UniTimber.d] if any trees are planted. */
    inline fun d(throwable: Throwable, message: () -> String) = ifPlanted { UniTimber.d(throwable, message()) }

    /** Delegates the throwable to [UniTimber.d]. Made for convenience when called from java */
    inline fun d(throwable: Throwable): Unit = ifPlanted { UniTimber.d(throwable) }
//endregion

//region UniTimber.v
    /** Delegates the provided message to [UniTimber.v] if any trees are planted. */
    inline fun v(message: () -> String) = ifPlanted { UniTimber.v(message()) }

    /** Delegates the provided message to [UniTimber.v] if any trees are planted. */
    inline fun v(throwable: Throwable, message: () -> String) = ifPlanted { UniTimber.v(throwable, message()) }

    /** Delegates the throwable to [UniTimber.v]. Made for convenience when called from java */
    inline fun v(throwable: Throwable): Unit = ifPlanted { UniTimber.v(throwable) }
//endregion

//region UniTimber.wtf
/** Delegates the provided message to [UniTimber.wtf] if any trees are planted. */
    inline fun wtf(message: () -> String) = ifPlanted { UniTimber.wtf(message()) }

    /** Delegates the provided message to [UniTimber.wtf] if any trees are planted. */
    inline fun wtf(throwable: Throwable, message: () -> String) = ifPlanted { UniTimber.wtf(throwable, message()) }

    /** Delegates the throwable to [UniTimber.wtf]. Made for convenience when called from java */
    inline fun wtf(throwable: Throwable): Unit = ifPlanted { UniTimber.wtf(throwable) }
//endregion

//region UniTimber.log
/** Delegates the provided message to [UniTimber.log] if any trees are planted. */
    inline fun log(priority: Int, t: Throwable, message: () -> String) = ifPlanted { UniTimber.log(priority, t, message()) }

    /** Delegates the provided message to [UniTimber.log] if any trees are planted. */
    inline fun log(priority: Int, message: () -> String) = ifPlanted { UniTimber.log(priority, message()) }

    /** Delegates the throwable to [UniTimber.log]. Made for convenience when called from java */
    inline fun log(priority: Int, throwable: Throwable): Unit = ifPlanted { UniTimber.log(priority, throwable) }
//endregion
