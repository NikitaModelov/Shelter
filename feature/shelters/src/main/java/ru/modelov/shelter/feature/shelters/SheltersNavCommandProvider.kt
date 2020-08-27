package ru.modelov.shelter.feature.shelters

import ru.modelov.shelter.core.navigation.NavCommand

interface SheltersNavCommandProvider {
    val toDetail: NavCommand
}