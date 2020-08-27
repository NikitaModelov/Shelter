package ru.modelov.shelter.di.module

import dagger.Module
import ru.modelov.shelter.navigation.shelters.di.SheltersNavigationModule

@Module(includes = [SheltersNavigationModule::class])
interface SheltersModule