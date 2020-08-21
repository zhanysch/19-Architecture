package com.example.navigationarchitecture19.bottomNav.citysAlarm

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.navigationarchitecture19.R
import com.example.navigationarchitecture19.base.BaseFragment
import kotlinx.android.synthetic.main.cityalarm_fraggment.*

class CitysFragment : BaseFragment() {

    override fun resID() = R.layout.cityalarm_fraggment

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = CitysFragmentArgs.fromBundle(requireArguments())
        descript.text = bundle.details?.tCity
        if (bundle.details?.image != null)
            city.setImageResource(bundle.details.image)
        val bundleTwo = CitysFragmentArgs.fromBundle(requireArguments())
        descripTwo.text = bundle.details?.description
    }
}
