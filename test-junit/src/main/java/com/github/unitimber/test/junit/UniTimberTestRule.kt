package com.github.unitimber.test.junit

import com.github.unitimber.core.JavaLogger
import com.github.unitimber.core.UniTimber
import com.github.unitimber.core.extensions.uniTimberPlantDebugTree
import org.junit.rules.ExternalResource

/**
 * Created by nbv54 on 12-May-17.
 */
class UniTimberTestRule : ExternalResource() {
    override fun before() {
        uniTimberPlantDebugTree { JavaLogger() }
        println()
    }
    
    override fun after() {
        UniTimber.uprootAll()
        println()
    }
}