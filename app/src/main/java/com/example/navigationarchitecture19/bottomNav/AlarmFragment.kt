package com.example.navigationarchitecture19.bottomNav

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.navigationarchitecture19.R
import com.example.navigationarchitecture19.base.BaseFragment
import kotlinx.android.synthetic.main.alarm_fragment.*

class AlarmFragment : BaseFragment(), IntFaceClickRecycler {
    override fun resID() = R.layout.alarm_fragment

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listArr()
    }

    private fun listArr() {
        val adapter = RvAdapter(this)
        recyclerview.adapter = adapter
        adapter.addlist(Dataclass("New York ", R.drawable.newyourk, getString(R.string.city)))
        adapter.addlist(Dataclass("Vancouver",R.drawable.vancouver , getString(R.string.city2)))
        adapter.addlist(Dataclass("Berlin", R.drawable.berlin,getString(R.string.city3)))
        adapter.addlist(Dataclass("Hanover",R.drawable.hanover,getString(R.string.cityFour)))
        adapter.addlist(Dataclass("Oslo",R.drawable.oslo, getString(R.string.cityfive)))
        adapter.addlist(Dataclass("Cabo-Werde" ,R.drawable.cabowerde, getString(R.string.city7) ))
    }

    override fun gotoTheDetails(data: Dataclass) {

        val dest = AlarmFragmentDirections.actionAlarmFragmentToCitysFragment(data)
        findNavController().navigate(dest)
    }
}