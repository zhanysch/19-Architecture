package com.example.navigationarchitecture19.bottomNav

import android.os.Bundle
import android.view.View
import com.example.navigationarchitecture19.R
import com.example.navigationarchitecture19.base.BaseFragment
import kotlinx.android.synthetic.main.alarm_fragment.*

class AlarmFragment : BaseFragment() {
    override fun resID() = R.layout.alarm_fragment

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listArr()
    }

    private fun listArr() {
        val adapter = RvAdapter()
        recyclerview.adapter = adapter
        adapter.addlist("New Yourk")
        adapter.addlist("Vancuover")
        adapter.addlist("Berlin")
        adapter.addlist("Hamburg")
        adapter.addlist("Oslo")
        adapter.addlist("Cabo-werde")

    }


}