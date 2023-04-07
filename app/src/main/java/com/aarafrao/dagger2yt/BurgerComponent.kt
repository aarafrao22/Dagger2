package com.aarafrao.dagger2yt

import dagger.Component


@Component
interface BurgerComponent {
    fun giveMeBurger(): Burger
}