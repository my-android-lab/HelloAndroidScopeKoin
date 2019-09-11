package com.example.helloandroidscopekoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.scope.currentScope

class MainActivity : AppCompatActivity() {

    // inject MainPresenter from current scope
    val scopedPresenter: MainPresenter by currentScope.inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
