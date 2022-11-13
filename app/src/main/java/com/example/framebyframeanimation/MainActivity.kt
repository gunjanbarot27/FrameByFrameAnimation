package com.example.framebyframeanimation

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ad = AnimationDrawable()
        var f1 = resources.getDrawable(R.drawable.uvpce_logo_1,null)
        var f2 = resources.getDrawable(R.drawable.uvpce_logo_2,null)
        var f3 = resources.getDrawable(R.drawable.uvpce_logo_3,null)
        var f4 = resources.getDrawable(R.drawable.uvpce_logo_4,null)
        var f5 = resources.getDrawable(R.drawable.uvpce_logo_5,null)
        var f6 = resources.getDrawable(R.drawable.uvpce_logo_6,null)
        var f7 = resources.getDrawable(R.drawable.uvpce_logo_7,null)
        var f8 = resources.getDrawable(R.drawable.uvpce_logo,null)

        ad.addFrame(f1,200)
        ad.addFrame(f2,200)
        ad.addFrame(f3,200)
        ad.addFrame(f4,200)
        ad.addFrame(f5,200)
        ad.addFrame(f6,200)
        ad.addFrame(f7,200)
        ad.addFrame(f8,200)

       imageView.background = ad
       button.setOnClickListener{
           ad.start()
       }
       button2.setOnClickListener{
           ad.stop()
       }
    }
}