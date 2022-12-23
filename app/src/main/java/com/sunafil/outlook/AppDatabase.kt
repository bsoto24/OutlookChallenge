package com.sunafil.outlook

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


/**
 * AppDatabase
 *
 * @author Bryam Soto
 * @since 23/12/22
 */
//TODO: agregar tabla correo
@Database(entities = [], version = 1)
abstract class AppDatabase : RoomDatabase() {

    // TODO: agregar DAO para poder acceder a las operaciones de la tabla correo

    companion object {

        const val DB_NAME = "correos_db"

        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    DB_NAME
                )
                    .allowMainThreadQueries()
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}