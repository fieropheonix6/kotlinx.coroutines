/*
 * Copyright 2016-2023 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

package kotlinx.coroutines.internal

import kotlinx.coroutines.*

internal actual fun propagateExceptionFinalResort(exception: Throwable) {
    // log exception
    console.error(exception.toString())
}