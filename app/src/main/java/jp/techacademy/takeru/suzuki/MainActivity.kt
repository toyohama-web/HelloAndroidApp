package jp.techacademy.takeru.suzuki

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myIntroduction = Human("suzuki.takeru", 33, "旅行")
        val jpPrimeMinister = Human("安倍晋三",  65, "ゴルフ")

        myIntroduction.say()
        myIntroduction.think()

        jpPrimeMinister.say()
        jpPrimeMinister.think()
    }
}
