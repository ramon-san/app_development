package com.ramon_san.ibero_bank.DBHelper

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VER) {
    override fun onCreate(myDB: SQLiteDatabase) {
        myDB.execSQL("CREATE TABLE Clients(id INT, name VARCHAR(25), father_lastname VARCHAR(25), mother_lastname VARCHAR(25), PRIMARY KEY(id));")
        myDB.execSQL("CREATE TABLE Cards(number INT, cvv INT, exp_date VARCHAR(5), account_id INT, PRIMARY KEY(number), FOREIGN KEY(account_id) REFERENCES Accounts(id));")
        myDB.execSQL("CREATE TABLE Accounts(id INT, client_id INT, PRIMARY KEY(id), FOREIGN KEY(client_id) REFERENCES Clients(id));")
        myDB.execSQL("CREATE TABLE Transactions(id INT, card_id INT, amount INT, PRIMARY KEY(id), FOREIGN KEY(card_id) REFERENCES Cards(id));")
    }

    override fun onUpgrade(myDB: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        myDB!!.execSQL("DROP TABLE Clients")
        myDB!!.execSQL("DROP TABLE Cards")
        myDB!!.execSQL("DROP TABLE Accounts")
        myDB!!.execSQL("DROP TABLE Transactions")
        onCreate(myDB!!)
    }

    companion object {
        private val DATABASE_VER = 1
        private val DATABASE_NAME = "ibero_bank.db"
    }
}