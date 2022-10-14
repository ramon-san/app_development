package com.ramon_san.ibero_bank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NipActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nip)

        val validate_nip_button = findViewById<Button>(R.id.validate_nip_btn)

        validate_nip_button.setOnClickListener {
            val atm_menu_intent = Intent(this, AtmMenuActivity::class.java)
            startActivity(atm_menu_intent)
        }
    }
}
