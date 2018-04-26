package com.ogoons.dagger2sample

import dagger.Component

/**
 * Created by charles on 2018. 4. 26..
 */


@Component(modules = arrayOf(CoffeeMakerModule::class))
interface CoffeeComponent {
    fun make(): CoffeeMaker

    fun inject(coffeeMaker: CoffeeMaker)
}