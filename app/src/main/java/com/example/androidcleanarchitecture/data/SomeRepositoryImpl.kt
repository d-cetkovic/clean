package com.example.androidcleanarchitecture.data

import com.example.androidcleanarchitecture.data.local.LocalStorage
import com.example.androidcleanarchitecture.data.remote.RemoteService
import com.example.androidcleanarchitecture.domain.SomeRepository

class SomeRepositoryImpl(
    val localStorage: LocalStorage,
    val remoteService: RemoteService
) : SomeRepository {

    override fun doSomething() {
        localStorage.saveToDatabase()
        remoteService.sendToServer()
    }
}