package com.ramon_san.ibero_bank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class UserCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_card)

        val card_new_btn = findViewById<Button>(R.id.new_card_btn)
        // val card_modify_btn = findViewById<Button>(R.id.delete_card_btn)

        card_new_btn.setOnClickListener {
            val card_new_intent = Intent(this, UserNewCardActivity::class.java)
            startActivity(card_new_intent)
        }
    }
}