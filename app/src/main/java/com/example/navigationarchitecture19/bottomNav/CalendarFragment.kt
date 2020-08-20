package com.example.navigationarchitecture19.bottomNav

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.navigationarchitecture19.R
import com.example.navigationarchitecture19.base.BaseFragment

class CalendarFragment : BaseFragment() {
    override fun resID() = R.layout.calendar_fragment

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        findNavController().navigate(R.id.action_calendarFragment_to_fragment_CalendarFirst)


    }
}