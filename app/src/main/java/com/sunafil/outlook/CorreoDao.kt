package com.sunafil.outlook

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


/**
 * CorreoDao
 *
 * @author Bryam Soto
 * @since 23/12/22
 */
@Dao
interface CorreoDao {

    // TODO: Agregar las anotaciones correspondientes para que obtenerCorreos y guardarCorreo puedan funcionar

    fun obtenerCorreos(): List<Correo>

    fun guardarCorreo(correo: Correo)

}