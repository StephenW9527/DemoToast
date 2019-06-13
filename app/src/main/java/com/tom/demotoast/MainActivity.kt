package com.tom.demotoast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_show.setOnClickListener {
            Toast.makeText(this,"哈囉!!!",Toast.LENGTH_LONG).show()
        }

    }
}
