package com.example.navigationarchitecture19.bottomNav

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.navigationarchitecture19.R
import com.example.navigationarchitecture19.base.BaseFragment
import com.example.navigationarchitecture19.bottomNav.FragmCalendars.Fragment_CalendarFirst
import com.example.navigationarchitecture19.bottomNav.FragmCalendars.Fragment_CalendarSecond
import com.example.navigationarchitecture19.bottomNav.FragmCalendars.VPageAdptforCalendar

import kotlinx.android.synthetic.main.fragment_calend.*


class CalendarFragment : BaseFragment() {
    override fun resID() = R.layout.fragment_calend

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPAge()
    }

    private fun setupViewPAge() {
        val adapter = VPageAdptforCalendar(childFragmentManager)
        Vpage2.adapter=adapter
        adapter.addFragment(Fragment_CalendarSecond(),"Чат")
        adapter.addFragment(Fragment_CalendarFirst(),"Контакты")
        Tabloit.setupWithViewPager(Vpage2)
    }
}