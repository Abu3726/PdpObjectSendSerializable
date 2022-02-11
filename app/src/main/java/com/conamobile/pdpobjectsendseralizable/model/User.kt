package com.conamobile.pdpobjectsendseralizable.model

import java.io.Serializable

class User(var name:String, var age:String): Serializable {

    override fun toString(): String {
        return "Name: $name\n Age: $age"
    }

}