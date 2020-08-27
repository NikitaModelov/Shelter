package ru.modelov.shelter.navigation.shelters.di

import dagger.Binds
import dagger.Module
import ru.modelov.shelter.feature.shelters.SheltersNavCommandProvider
import ru.modelov.shelter.navigation.shelters.SheltersNavCommandProviderImpl

@Module
interface SheltersNavigationModule {

    @Binds
    fun bindSheltersNavigator(impl: SheltersNavCommandProviderImpl): SheltersNavCommandProvider
}