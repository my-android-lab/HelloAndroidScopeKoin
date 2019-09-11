package com.example.helloandroidscopekoin

import com.example.helloandroidscopekoin.model.HelloRepository

class MainPresenter(val repo: HelloRepository) {
    fun sayHello() = repo.giveHello()
}