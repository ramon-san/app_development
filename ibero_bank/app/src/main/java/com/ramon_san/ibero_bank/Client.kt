package com.ramon_san.ibero_bank

class Client {
    var id: Int = 0
    var name: String ?= null
    var father_lastname: String ?= null
    var mother_lastname: String ?= null

    constructor()

    constructor(id: Int, name: String, father_lastname: String, mother_lastname: String) {
        this.id = id
        this.name = name
        this.father_lastname = father_lastname
        this.mother_lastname = mother_lastname
    }
}