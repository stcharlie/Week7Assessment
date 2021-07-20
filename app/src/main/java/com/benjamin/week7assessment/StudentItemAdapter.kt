package com.benjamin.week7assessment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.benjamin.week7assessment.databinding.StudentItemsBinding

class StudentItemAdapter(var list2:List<Items>)
    :RecyclerView.Adapter<StudentItemAdapter.StudentItemViewHolder>(){

    class StudentItemViewHolder (val binding: StudentItemsBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(item:Items){
            binding.textView.text = item.id.toString()
            binding.textView2.text = item.name
            binding.textView3.text = item.price.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentItemViewHolder {
        val binding = StudentItemsBinding.inflate(LayoutInflater.from(parent.context))
        return StudentItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StudentItemViewHolder, position: Int) {
        val singleItem =  list2.get(position)
        holder.bind(singleItem)
    }

    override fun getItemCount(): Int {
        return list2.size
    }
}