package com.example.karolblazejewski.coderswag.Model

import android.support.v7.widget.DialogTitle

class Category
{
    var title: String? = null
    var image: String? = null

    constructor( title: String, image: String )
    {
        this.title = title
        this.image = image
    }
}