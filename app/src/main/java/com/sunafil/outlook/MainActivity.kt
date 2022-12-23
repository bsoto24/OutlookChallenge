package com.sunafil.outlook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.sunafil.outlook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // TODO: Pero para que AndroidStudio nos pueda generar el ActivityMainBinding falta agregar una etiqueta en el activity_main.xml
    private lateinit var binding: ActivityMainBinding

    private lateinit var adapter: CorreoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Capturamos el evento de click en el boton
        binding.btnEnviar.setOnClickListener {

            // TODO: conectate con la base de datos y guarda la información del correo


            adapter.mostrarCorreos(obtenerCorreos()) // luego de guardar el correo refrescamos la pantalla

            Snackbar.make(
                binding.root,
                "Se envió el correo satisfactoriamente",
                Snackbar.LENGTH_SHORT
            ).show()
        }

        adapter = CorreoAdapter()
        binding.rvCorreos.adapter = adapter

        adapter.mostrarCorreos(obtenerCorreos())
    }

    fun obtenerCorreos(): List<Correo> {
        var correos = listOf<Correo>()
        //TODO conectate con la BD Room para obtener los correos y guardarlos en correos
        return correos
    }

    fun guardarCorreo(correo: Correo) {
        // TODO: conectate con la BD Room para guardar los correos
    }


}