package com.ssafy.comp_08.app2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_1).setOnClickListener{
            var intent = Intent(this, ViewStubActivity::class.java);
            startActivity(intent)
        }

        findViewById<Button>(R.id.button_2).setOnClickListener{
            var intent = Intent(this, IncludeActivity::class.java);
            startActivity(intent)
        }

        findViewById<Button>(R.id.button_3).setOnClickListener{
            var intent = Intent(this, RequestFocusActivity::class.java);
            startActivity(intent)
        }

        findViewById<Button>(R.id.button_4).setOnClickListener{
            var intent = Intent(this, IncludeDrawerActivity::class.java);
            startActivity(intent)
        }

        findViewById<Button>(R.id.button_5).setOnClickListener{
            var intent = Intent(this, IncludeDrawerActivity2::class.java);
            startActivity(intent)
        }
    }
}