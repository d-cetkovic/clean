package com.example.androidcleanarchitecture.presentation

import com.example.androidcleanarchitecture.domain.SomeUseCase

class SomeViewModel(
    // zamisli da je usecase ovde
) {

    // Viewmodel drzi referencu na
    // usecase koji se nalazi u domain modulu.
    // naravno usecase bi trebao da bude injectovan u konstruktoru
    private val someUseCase = SomeUseCase()

    fun doSomethingFancyInThisMethod() {
        // moj ti je savet da sve asinhrone operacije pozivas
        // ovde koristeci viewModelScope.launch
        // ili u fragmentu/aktivitiju koristeci lifecycleScope

        // savetujem ti da koristis runCatching umesto try/catch
        runCatching {
            someUseCase // <- operator funkcija. ovo je isto sto i someUseCase.invoke
        }.onSuccess {
            // obradi success
        }.onFailure {
            //obradi error
        }
    }
}