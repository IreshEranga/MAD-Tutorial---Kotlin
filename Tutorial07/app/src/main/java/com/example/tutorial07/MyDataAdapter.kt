package com.example.tutorial07

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyDataAdapter(private val data:List<Post>):RecyclerView.Adapter<MyDataVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyDataVH {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)

        val view: View = layoutInflater.inflate(R.layout.list_item_layout,parent,false)
        return MyDataVH(view/*,parent*/)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyDataVH, position: Int) {

        val singleData = data[position]

        var toggle = true

        holder.tvUserName.text = singleData.username
        holder.tvDescription.text = singleData.description
        holder.btnLikes.text = "${singleData.likes}👍"

        holder.btnLikes.setOnClickListener {
            if(toggle){
                holder.btnLikes.text = "${singleData.likes+1}👍"
                toggle = false
            }else{
                toggle = true
            }
        }
    }

}