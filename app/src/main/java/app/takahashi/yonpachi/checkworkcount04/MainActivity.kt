package app.takahashi.yonpachi.checkworkcount04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.takahashi.yonpachi.checkworkcount04.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(this.root)
        }
        var number: Int = 0

        binding.countText.text = number.toString()

        binding.plusButton.setOnClickListener {
            number += 1
            if (number%15 == 0) {
                binding.countText.text = "FizzBuzz"
            } else if (number%3 == 0) {
                binding.countText.text = "Fizz"
            } else if (number%5 == 0) {
                binding.countText.text = "Buzz"
            } else {
                binding.countText.text = number.toString()
            }
        }
    }
}