package com.tom.demotoast

import android.support.v7.app.AppCompatActivity
import android.widget.Toast

open class BaseActivity : AppCompatActivity() {

     fun myToast(text:String,duration:Int = Toast.LENGTH_LONG)  {
        Toast.makeText(this,text,duration).show()
    }

}
