package com.ramon_san.ibero_bank

class Card {
    var card_number: Int = 0
    var cvv: Int = 0
    var exp_date: String ?= null
    var account_id: Int = 0

    constructor()

    constructor(card_number: Int, cvv: Int, exp_date: String, account_id: Int) {
        this.card_number = card_number
        this.cvv = cvv
        this.exp_date = exp_date
        this.account_id = account_id
    }
}