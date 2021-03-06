package com.man.food.database

import com.mongodb.client.MongoClient
import org.litote.kmongo.KMongo
import org.springframework.stereotype.Component

@Component
class DatabaseComponent {

    val databaseURL = System.getenv("DATABASE_URL")
    val  database : MongoClient = KMongo.createClient(databaseURL)

}