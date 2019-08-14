package com.stunnningcoder.notificationdemo

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build

/**
 * Created by Jatin on 8/13/19.
 */

const val CHANNEL_1 = "proxyChannel1"
const val CHANNEL_2 = "proxyChannel2"

class ProxyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
     if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
         val notificationChannel1 =  NotificationChannel(CHANNEL_1, "Channel First", NotificationManager.IMPORTANCE_HIGH)
         val notificationChannel2 =  NotificationChannel(CHANNEL_2, "Channel Second", NotificationManager.IMPORTANCE_DEFAULT)
         val notificationManager = getSystemService(NotificationManager::class.java)
         notificationManager.createNotificationChannels(mutableListOf(notificationChannel1, notificationChannel2))
        } else {
            TODO("VERSION.SDK_INT < O")
        }
    }
}