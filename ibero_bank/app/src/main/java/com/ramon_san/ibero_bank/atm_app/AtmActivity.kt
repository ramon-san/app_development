package com.ramon_san.ibero_bank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AtmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_atm)

        val validate_card_button = findViewById<Button>(R.id.validate_card_btn)

        validate_card_button.setOnClickListener {
            val nip_intent = Intent(this, NipActivity::class.java)
            startActivity(nip_intent)
        }
    }
}