package ru.modelov.shelter.feature.shelters

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragment_shelters.*
import ru.modelov.shelter.core.navigation.NavHost
import ru.modelov.shelter.core.navigation.navigate
import ru.modelov.shelter.core.presentation.BaseFragment
import javax.inject.Inject

class SheltersFragment : BaseFragment(R.layout.fragment_shelters) {

    @Inject
    lateinit var viewModel: SheltersViewModel

    @Inject
    lateinit var navCommandProvider: SheltersNavCommandProvider

    @Inject
    lateinit var navHost: NavHost

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_to_details.setOnClickListener {
            navigate(navCommandProvider.toDetail, navHost.id)
        }
    }
}