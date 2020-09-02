package ru.modelov.shelter.feature.shelters.presentation.list

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import ru.modelov.shelter.feature.shelters.entities.ShelterItemEntity
import ru.modelov.shelter.feature.shelters.presentation.SheltersViewModel

class SheltersAdapter(private val viewModel: SheltersViewModel) :
    ListAdapter<ShelterItemEntity, ShelterViewHolder>(SheltersDiffCallback()) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ShelterViewHolder = ShelterViewHolder.from(parent)

    override fun onBindViewHolder(
        holder: ShelterViewHolder,
        position: Int
    ) {
        holder.bind(getItem(position), viewModel)
    }
}

class SheltersDiffCallback : DiffUtil.ItemCallback<ShelterItemEntity>() {

    override fun areItemsTheSame(oldItem: ShelterItemEntity, newItem: ShelterItemEntity) =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: ShelterItemEntity, newItem: ShelterItemEntity) =
        oldItem == newItem
}