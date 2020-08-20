package com.example.navigationarchitecture19.bottomNav

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationarchitecture19.R
import kotlinx.android.synthetic.main.item_linear.view.*

class RvAdapter  : RecyclerView.Adapter<RvAdapter.RVviewHolder>(){
    private val list = arrayListOf<String>()



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVviewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_linear, parent , false)
        return RVviewHolder(view)

    }

    fun addlist(item: String){
       list.add(item)
        notifyItemInserted(1)
    }

    fun update(data: ArrayList<String>){
        list.clear()
        list.addAll(data)
        notifyDataSetChanged()
    }


    override fun getItemCount()  = list.size

    override fun onBindViewHolder(holder: RVviewHolder, position: Int) {
        holder.bind(list[position])
    }

    class  RVviewHolder (v : View) : RecyclerView.ViewHolder (v) {
        fun bind(data : String){
            itemView.Tv.text = data
        }
    }
}
