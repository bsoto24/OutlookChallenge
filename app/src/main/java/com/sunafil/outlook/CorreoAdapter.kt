package com.sunafil.outlook

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.sunafil.outlook.databinding.ItemCorreoBinding


/**
 * CorreoAdapter
 *
 * @author Bryam Soto
 * @since 23/12/22
 */
class CorreoAdapter : RecyclerView.Adapter<CorreoAdapter.CorreoVH>() {

    private val items: ArrayList<Correo> = arrayListOf()

    fun mostrarCorreos(correos: List<Correo>) {
        items.clear()
        items.addAll(correos)
        // TODO: Falta ejecutar un metodo para indicarle al RecyclerView que actualice la pantalla
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CorreoVH {
        return CorreoVH(
            ItemCorreoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CorreoVH, position: Int) {
        // TODO: Obten el correo utilizando items y position
        // val correo = ???
        // holder.bind(correo)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class CorreoVH(val binding: ItemCorreoBinding) : ViewHolder(binding.root) {

        //Aca inyectamos la información del correo al item (la vista)
        fun bind(correo: Correo) {
            binding.tvAsunto.text = correo.asunto
            //TODO: Agrega el resto de información a la vista (destinatario y estado)
        }

    }

}