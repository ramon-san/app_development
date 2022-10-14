package com.ramon_san.ibero_bank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class UserAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_account)

        val account_new_btn = findViewById<Button>(R.id.new_account_btn)
        // val account_modify_btn = findViewById<Button>(R.id.delete_account_btn)

        account_new_btn.setOnClickListener {
            val account_new_intent = Intent(this, UserNewAccountActivity::class.java)
            startActivity(account_new_intent)
        }
    }
}