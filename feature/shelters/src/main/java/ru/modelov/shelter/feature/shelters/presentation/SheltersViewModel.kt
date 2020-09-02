package ru.modelov.shelter.feature.shelters.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.modelov.shelter.core.presentation.BaseViewModel
import ru.modelov.shelter.feature.shelters.entities.ShelterItemEntity
import javax.inject.Inject

class SheltersViewModel @Inject constructor() : BaseViewModel() {

    private val _titleLiveData = MutableLiveData<String>("Привет чмо")
    val titleLiveData: LiveData<String>
        get() = _titleLiveData

    private val _sheltersListLiveData = MutableLiveData<List<ShelterItemEntity>>()
    val sheltersListLiveData: LiveData<List<ShelterItemEntity>>
        get() = _sheltersListLiveData

    private val sheltersList = listOf(
        ShelterItemEntity(
            id = 1,
            title = "Приют 1",
            location = "Новосибирск"
        ),
        ShelterItemEntity(
            id = 4,
            title = "Приют 2",
            location = "Новосибирск"
        ),
        ShelterItemEntity(
            id = 7,
            title = "Приют 3",
            location = "Новосибирск"
        ),
        ShelterItemEntity(
            id = 20,
            title = "Приют 4",
            location = "Новосибирск"
        ),
        ShelterItemEntity(
            id = 1,
            title = "Приют 1",
            location = "Новосибирск"
        ),
        ShelterItemEntity(
            id = 4,
            title = "Приют 2",
            location = "Новосибирск"
        ),
        ShelterItemEntity(
            id = 7,
            title = "Приют 3",
            location = "Новосибирск"
        ),
        ShelterItemEntity(
            id = 20,
            title = "Приют 4",
            location = "Новосибирск"
        ),
        ShelterItemEntity(
            id = 1,
            title = "Приют 1",
            location = "Новосибирск"
        ),
        ShelterItemEntity(
            id = 4,
            title = "Приют 2",
            location = "Новосибирск"
        ),
        ShelterItemEntity(
            id = 7,
            title = "Приют 3",
            location = "Новосибирск"
        ),
        ShelterItemEntity(
            id = 20,
            title = "Приют 4",
            location = "Новосибирск"
        )
    )

    init {
        _sheltersListLiveData.value = sheltersList
    }
}