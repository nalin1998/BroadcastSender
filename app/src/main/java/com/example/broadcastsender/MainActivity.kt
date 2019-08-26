package com.example.broadcastsender

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //we use this app to send broadcast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val intent : Intent = Intent("com.example.implicitcustombroadcastreceiverdemo.CUSTOM_ACTION")
            intent.putExtra("com.example.implicitcustombroadcastreceiverdemo.SAMPLE_KEY" , "Broadcast Received")
            sendBroadcast(intent)
        }

    }
}
