package com.stunnningcoder.notificationdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.databinding.DataBindingUtil
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<com.stunnningcoder.notificationdemo.databinding.ActivityMainBinding>(this, R.layout.activity_main)
        binding.buttonFirst.setOnClickListener{
            val notification = NotificationCompat.Builder(this, CHANNEL_1)
            notification.setContentTitle(binding.title.text)
            notification.setContentText(binding.description.text)
            notification.setSmallIcon(android.R.drawable.ic_dialog_alert)
            NotificationManagerCompat.from(this).notify(Random.nextInt(), notification.build())
        }

        binding.buttonSecond.setOnClickListener({
            val notification = NotificationCompat.Builder(this, CHANNEL_2)
            notification.setContentTitle(binding.title.text)
            notification.setContentText(binding.description.text)
            notification.setSmallIcon(android.R.drawable.ic_dialog_map)
            NotificationManagerCompat.from(this).notify(Random.nextInt(), notification.build())
        })
    }
}
