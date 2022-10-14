package com.ramon_san.ibero_bank.DBHelper

import android.database.sqlite.SQLiteDatabase
import android.util.Log
import com.ramon_san.ibero_bank.Client
import java.lang.String

class DataAccess {
    fun saveClient(myDB: SQLiteDatabase, myClient: Client) {
        var command = "INSERT INTO Clientes VALUES (\'@id\',\'@name\',\'@fatherLast',\'@motherLast\')"
        command = command.replace("@id", String.valueOf(myClient.id))
        command = command.replace("@name", String.valueOf(myClient.name))
        command = command.replace("@fatherLast", String.valueOf(myClient.father_lastname))
        command = command.replace("@motherLast", String.valueOf(myClient.mother_lastname))
        Log.i("Command: ", command)
        myDB.execSQL(command)
    }
}