package ru.modelov.shelter.feature.shelters.di

import androidx.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides
import ru.modelov.shelter.core.di.scope.FragmentScope
import ru.modelov.shelter.core.presentation.ViewModelFactory
import ru.modelov.shelter.feature.shelters.SheltersFragment
import ru.modelov.shelter.feature.shelters.SheltersViewModel

@Module
class SheltersFragmentModule {

    @Provides
    @FragmentScope
    fun provideViewModel(
        owner: SheltersFragment
    ): SheltersViewModel = ViewModelFactory {
        SheltersViewModel()
    }.let { viewModelFactory ->
        ViewModelProvider(owner, viewModelFactory)[SheltersViewModel::class.java]
    }
}
