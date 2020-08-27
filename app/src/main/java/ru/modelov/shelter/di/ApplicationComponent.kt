package ru.modelov.shelter.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import ru.modelov.shelter.App
import ru.modelov.shelter.core.di.scope.ApplicationScope
import ru.modelov.shelter.di.module.ApplicationModule

@ApplicationScope
@Component(
    modules = [
        ApplicationModule::class
    ]
)
interface ApplicationComponent : AndroidInjector<App> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance appContext: Context): ApplicationComponent
    }
}