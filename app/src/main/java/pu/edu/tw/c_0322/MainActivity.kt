package pu.edu.tw.c_0322

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Add(v: View) {
        if (v == btn1) {
            counter++
        } else {
            counter += 2
        }
        txv.text = counter.toString()
    }
}z