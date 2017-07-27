package com.github.unitimber.test.junit

import com.github.unitimber.core.JavaLogger
import com.github.unitimber.core.UniTimber
import com.github.unitimber.core.extensions.uniTimberPlantDebugTree
import org.junit.rules.ExternalResource

/**
 * JUnit Test Rule that enables UniTimber logging in Unit Tests
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