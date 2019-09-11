package com.example.helloandroidscopekoin.module

import com.example.helloandroidscopekoin.MainActivity
import com.example.helloandroidscopekoin.MainPresenter
import com.example.helloandroidscopekoin.model.HelloRepository
import com.example.helloandroidscopekoin.model.HelloRepositoryImpl
import org.koin.core.qualifier.named
import org.koin.dsl.module

val appModule = module {
    // single instance of HelloRepository
    single<HelloRepository> { HelloRepositoryImpl() }

    // scoped MainPresenter instance
    scope(named<MainActivity>()) {
        scoped { MainPresenter(get()) }
    }
}