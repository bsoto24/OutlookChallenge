package com.sunafil.outlook

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


/**
 * Correo
 *
 * @author Bryam Soto
 * @since 23/12/22
 */
// TODO: Necesitamos que esta clase nos sirva como tabla de Room, agregar las anotaciones correspondientes
data class Correo(
    val id: Int = 0,
    val asunto: String,
    val destinatario: String,
    val contenido: String
)
