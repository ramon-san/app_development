package com.ramon_san.ibero_bank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AtmMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_atm_menu)

        val transactions_btn = findViewById<Button>(R.id.transactions_btn)
        val change_nip_btn = findViewById<Button>(R.id.change_nip_btn)
        val check_transactions_btn = findViewById<Button>(R.id.check_transactions)

        transactions_btn.setOnClickListener {
            val transactions_intent = Intent(this, AtmTransactionsActivity::class.java)
            startActivity(transactions_intent)
        }
        change_nip_btn.setOnClickListener {
            val change_nip_intent = Intent(this, AtmChangeNipActivity::class.java)
            startActivity(change_nip_intent)
        }
        check_transactions_btn.setOnClickListener {
            val check_transactions_intent = Intent(this, AtmCheckTransactionsActivity::class.java)
            startActivity(check_transactions_intent)
        }
    }
}