package com.example.navigationarchitecture19.bottomNav

import android.graphics.drawable.AnimatedImageDrawable
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationarchitecture19.R
import kotlinx.android.parcel.Parcelize
import kotlinx.android.synthetic.main.item_linear.view.*

class RvAdapter ( private val listener : IntFaceClickRecycler) : RecyclerView.Adapter<RvAdapter.RVviewHolder>(){
    private val data = arrayListOf<Dataclass>()



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVviewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_linear, parent , false)
        return RVviewHolder(view)

    }

    fun addlist(item: Dataclass){
       data.add(item)
        notifyItemInserted(1)
    }

    fun update(data:  ArrayList<Dataclass>){
        data.clear()
        data.addAll(data)
        notifyDataSetChanged()
    }


    override fun getItemCount()  = data.size

    override fun onBindViewHolder(holder: RVviewHolder, position: Int) {
        holder.bind(data[position], listener)
    }

    class  RVviewHolder (v : View) : RecyclerView.ViewHolder (v) {
        fun bind(data: Dataclass, listener: IntFaceClickRecycler) {
            itemView.setOnClickListener {
                listener.gotoTheDetails(data)  // <- supposed to be only data not data.tCity questio
            }
            itemView.Tv.text = data.tCity
            itemView.Image.setBackgroundResource(data.image)

        }
    }
}
@Parcelize
data class Dataclass(
    val tCity : String,
    val image : Int,
    val description : String

) : Parcelable
