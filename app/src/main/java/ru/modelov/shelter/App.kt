package ru.modelov.shelter

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import ru.modelov.shelter.di.DaggerApplicationComponent

class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerApplicationComponent.factory().create(this)
}