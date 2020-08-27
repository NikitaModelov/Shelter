package ru.modelov.shelter.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.modelov.shelter.core.di.scope.FragmentScope
import ru.modelov.shelter.di.module.SheltersModule
import ru.modelov.shelter.feature.shelters.SheltersFragment
import ru.modelov.shelter.feature.shelters.di.SheltersFragmentModule

@Module
interface AppActivityModule {

    @FragmentScope
    @ContributesAndroidInjector(
        modules = [
            SheltersFragmentModule::class,
            SheltersModule::class
        ]
    )
    fun sheltersFragmentInject(): SheltersFragment
}