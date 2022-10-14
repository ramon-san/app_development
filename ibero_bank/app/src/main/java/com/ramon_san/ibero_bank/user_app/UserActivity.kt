package com.ramon_san.ibero_bank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val clients_btn = findViewById<Button>(R.id.clients_btn)
        val accounts_btn = findViewById<Button>(R.id.accounts_btn)
        val cards_btn = findViewById<Button>(R.id.cards_btn)

        clients_btn.setOnClickListener {
            val clients_intent = Intent(this, UserClientActivity::class.java)
            startActivity(clients_intent)
        }

        accounts_btn.setOnClickListener {
            val accounts_intent = Intent(this, UserAccountActivity::class.java)
            startActivity(accounts_intent)
        }

        cards_btn.setOnClickListener {
            val cards_intent = Intent(this, UserCardActivity::class.java)
            startActivity(cards_intent)
        }
    }
}