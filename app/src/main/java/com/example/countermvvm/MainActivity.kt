package com.example.countermvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.countermvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel : CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setup()
        setClickers()
    }

    private fun setClickers() {
        with(binding) {
            btIncrement.setOnClickListener {
                viewModel.incrementCount()
            }
            btDecrement.setOnClickListener {
                viewModel.decrementCount()
            }
            btReset.setOnClickListener {
                viewModel.resetCount()
            }
        }
    }

    private fun setup() {

        viewModel.count.observe(this, Observer {
            binding.tvCountResult.text = it.toString()
        })
    }

}