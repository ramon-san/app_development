package com.ramon_san.ibero_bank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class UserClientActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_client)

        val client_new_btn = findViewById<Button>(R.id.new_client_btn)
        val client_modify_btn = findViewById<Button>(R.id.modify_client_btn)

        client_new_btn.setOnClickListener {
            val client_new_intent = Intent(this, UserNewClientActivity::class.java)
            startActivity(client_new_intent)
        }

        client_modify_btn.setOnClickListener {
            val client_modify_intent = Intent(this, UserModifyClientActivity::class.java)
            startActivity(client_modify_intent)
        }
    }
}