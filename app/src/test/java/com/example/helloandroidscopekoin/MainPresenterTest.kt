package com.example.helloandroidscopekoin

import com.example.helloandroidscopekoin.module.appModule
import org.junit.Before
import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.core.qualifier.named
import org.koin.core.scope.ScopeID
import org.koin.test.KoinTest

class MainPresenterTest: KoinTest {

    private val scope  by lazy {
        getKoin().getOrCreateScope(ScopeID(), named<MainActivity>())
    }

    private val scopedPresenter by lazy {
        scope.get<MainPresenter>()
    }

    @Before
    fun before() {
        startKoin {
            modules(appModule)
        }
    }

    @Test
    fun testSayHello() {
        assert(scopedPresenter.sayHello() == "Hello Koin")
    }

}