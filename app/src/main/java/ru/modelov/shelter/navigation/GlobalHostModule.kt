package ru.modelov.shelter.navigation

import dagger.Module
import dagger.Provides
import ru.modelov.shelter.R
import ru.modelov.shelter.core.navigation.NavHost

@Module
class GlobalHostModule {

    @Provides
    fun provideGlobalHostId(): NavHost = NavHost(R.id.host_global)
}