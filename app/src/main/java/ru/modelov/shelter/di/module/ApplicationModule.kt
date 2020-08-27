package ru.modelov.shelter.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import ru.modelov.shelter.MainActivity
import ru.modelov.shelter.core.di.scope.ActivityScope
import ru.modelov.shelter.di.AppActivityModule
import ru.modelov.shelter.navigation.GlobalHostModule

@Module(
    includes = [
        AndroidSupportInjectionModule::class,
        GlobalHostModule::class,
        SheltersModule::class
    ]
)
interface ApplicationModule {

    @ActivityScope
    @ContributesAndroidInjector(
        modules = [
            AppActivityModule::class
        ]
    )
    fun appActivityInjector(): MainActivity
}