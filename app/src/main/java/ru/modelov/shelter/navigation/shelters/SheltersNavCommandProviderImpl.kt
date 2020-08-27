package ru.modelov.shelter.navigation.shelters

import ru.modelov.shelter.core.navigation.NavCommand
import ru.modelov.shelter.feature.shelters.SheltersNavCommandProvider
import javax.inject.Inject

class SheltersNavCommandProviderImpl @Inject constructor() : SheltersNavCommandProvider {
    override val toDetail: NavCommand =
        NavCommand(ru.modelov.shelter.R.id.action_sheltersFragment_to_detailShelterFragment)
}