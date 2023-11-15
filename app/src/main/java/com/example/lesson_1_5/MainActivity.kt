package com.example.lesson_1_5

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lesson_1_5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = Injector.getPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initClickers()
    }

    private fun initClickers() {
        with(binding){
            btnPlus.setOnClickListener{
                presenter.increment()
            }
            btnMinus.setOnClickListener{
                presenter.decrement()
            }
        }
    }

    override fun showChangeCount(count: Int) {
        binding.countTv.text = count.toString()
    }

    override fun showToast() {
        Toast.makeText(this, "Поздравляем", Toast.LENGTH_SHORT).show()
    }

    override fun greenTextColor() {
        binding.countTv.setTextColor(Color.GREEN)
    }

    override fun blackTextColor() {
        binding.countTv.setTextColor(Color.BLACK)
    }
}