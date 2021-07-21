package com.benjamin.week7assessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.benjamin.week7assessment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var studentItemAdapter: StudentItemAdapter
    private lateinit var viewModel: MainViewModel   

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        studentItemAdapter = StudentItemAdapter(listOf())
        binding.rView.adapter = studentItemAdapter


        viewModel = ViewModelProvider(this)[MainViewModel::class.java]


        viewModel.apply {
            getAllItems()
            y.observe(this@MainActivity, { itemX ->
                studentItemAdapter.list2 = itemX
                studentItemAdapter.notifyDataSetChanged()
            })
            binding.button.setOnClickListener {
                viewModel.apply {
                    addStudentList()
                }
            }

        }
    }


    }










