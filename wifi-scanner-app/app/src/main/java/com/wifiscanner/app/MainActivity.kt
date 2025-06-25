package com.wifiscanner.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

/**
 * Main activity for the WiFi Scanner application.
 * Serves as the entry point of the app and manages initial setup.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Show splash screen
        val splashScreen = installSplashScreen()
        
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}