package com.ramon_san.ibero_bank

class Account {
    var id: Int = 0
    var client_id: Int = 0

    constructor()

    constructor(id: Int, client_id: Int) {
        this.id = id
        this.client_id = client_id
    }
}