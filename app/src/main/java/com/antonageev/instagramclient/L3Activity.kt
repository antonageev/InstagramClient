package com.antonageev.instagramclient

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import com.antonageev.instagramclient.settings.SettingsActivity

class L3Activity : AppCompatActivity() {

    companion object{
        fun start(context : Context) = Intent(context, L3Activity::class.java).apply {
            context.startActivity(this)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_l3)
        setSupportActionBar(findViewById(R.id.toolbar_buttons))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        android.R.id.home -> {
            Log.d("Lesson3 Activity", "onOptionsItemSelected: backpressed() invoked")
            onBackPressed().let { true }
        }
        else -> super.onOptionsItemSelected(item)
    }
}