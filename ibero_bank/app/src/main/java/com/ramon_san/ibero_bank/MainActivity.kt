package com.ramon_san.ibero_bank

import android.content.Intent
import android.database.sqlite.SQLiteOpenHelper
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ramon_san.ibero_bank.DBHelper.DBHelper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dbHelper: SQLiteOpenHelper = DBHelper(this)
        val miBaseSQLite = dbHelper.readableDatabase // Executes onCreate().

        if (miBaseSQLite != null) {
            Toast.makeText(this, "DB created!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show()
        }

        val atm_button = findViewById<Button>(R.id.atm_btn)
        val user_button = findViewById<Button>(R.id.user_btn)

        atm_button.setOnClickListener {
            val atm_intent = Intent(this, AtmActivity::class.java)
            startActivity(atm_intent)
        }

        user_button.setOnClickListener{
            val button_intent = Intent(this, UserActivity::class.java)
            startActivity(button_intent)
        }
    }
}