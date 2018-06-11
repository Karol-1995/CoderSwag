package com.example.karolblazejewski.coderswag.Model

class Product
{
    var title: String? = null
    var price: String? = null
    var image: String? = null

    constructor( title: String, price: String, image: String )
    {
        this.title = title
        this.price = price
        this.image = image
    }
}