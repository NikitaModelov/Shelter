package ru.modelov.shelter.feature.shelters.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.observe
import ru.modelov.shelter.core.navigation.NavHost
import ru.modelov.shelter.core.navigation.navigate
import ru.modelov.shelter.core.presentation.BaseFragment
import ru.modelov.shelter.feature.shelters.R
import ru.modelov.shelter.feature.shelters.SheltersNavCommandProvider
import ru.modelov.shelter.feature.shelters.databinding.FragmentSheltersBinding
import ru.modelov.shelter.feature.shelters.presentation.list.ShelterItemDecoration
import ru.modelov.shelter.feature.shelters.presentation.list.SheltersAdapter
import javax.inject.Inject

class SheltersFragment : BaseFragment<FragmentSheltersBinding>(R.layout.fragment_shelters),
    SheltersViewModel.EventsListener {

    @Inject
    lateinit var viewModel: SheltersViewModel

    @Inject
    lateinit var navCommandProvider: SheltersNavCommandProvider

    @Inject
    lateinit var navHost: NavHost

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        binding.viewModel = viewModel
        viewModel.eventsDispatcher.bind(viewLifecycleOwner, this)
        return view
    }

    private fun initRv() {
        val adapter = SheltersAdapter(viewModel)
        val space = 20
        binding.rvShelters.adapter = adapter
        binding.rvShelters.addItemDecoration(ShelterItemDecoration(space))
        viewModel.sheltersListLiveData.observe(viewLifecycleOwner) {
            Log.d("init rv", it.toString())
            adapter.submitList(it)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRv()
    }

    override fun navigateToDetail(idShelter: Int) {
        navigate(navCommandProvider.toDetail, navHost.id)
    }
}