package com.example.androidcleanarchitecture.domain

class SomeUseCase(
    val someRepository: SomeRepository
) {
    operator fun invoke() = someRepository.doSomething()
}

