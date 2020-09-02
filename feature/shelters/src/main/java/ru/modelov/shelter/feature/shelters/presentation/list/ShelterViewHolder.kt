package ru.modelov.shelter.feature.shelters.presentation.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.modelov.shelter.feature.shelters.databinding.ItemShelterBinding
import ru.modelov.shelter.feature.shelters.entities.ShelterItemEntity
import ru.modelov.shelter.feature.shelters.presentation.SheltersViewModel

class ShelterViewHolder private constructor(private val binding: ItemShelterBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ShelterItemEntity, viewModel: SheltersViewModel) {
        with(binding) {
            this.viewModel = viewModel
            this.item = item
            executePendingBindings()
        }
    }

    companion object {
        fun from(parent: ViewGroup): ShelterViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemShelterBinding.inflate(layoutInflater, parent, false)
            return ShelterViewHolder(binding)
        }
    }
}