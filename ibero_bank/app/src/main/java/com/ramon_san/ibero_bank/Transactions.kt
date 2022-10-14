package com.ramon_san.ibero_bank

class Transactions {
    var id: Int = 0
    var amount: Int = 0
    var account_id: Int = 0

    constructor()

    constructor(id: Int, account_id: Int, amount: Int) {
        this.id = id
        this.account_id = account_id
        this.amount = amount
    }
}