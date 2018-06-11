package com.example.karolblazejewski.coderswag.Model

import android.support.v7.widget.DialogTitle

class Category
{
    var title: String
    var image: String

    constructor( title: String, image: String )
    {
        this.title = title
        this.image = image
    }

    override fun toString() : String
    {
        return title
    }
}