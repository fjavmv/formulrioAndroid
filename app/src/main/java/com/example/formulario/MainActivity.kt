package com.example.formulario

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var nombre: EditText
    private lateinit var apellidoP: EditText
    private lateinit var apellidoM: EditText
    private lateinit var numeroTel: EditText
    private lateinit var email: EditText
    private lateinit var buttonGuardar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initControl()

        buttonGuardar.setOnClickListener {
            //:: crea una referencia de miembro o una referencia de la clase.
            val intent =  Intent(this,ShowDataActivity::class.java)
            intent.putExtra("nombre",nombre.text.toString())
            intent.putExtra("apellidoP",apellidoP.text.toString())
            intent.putExtra("apellidoM",apellidoM.text.toString())
            intent.putExtra("telefono",numeroTel.text.toString())
            intent.putExtra("correo",numeroTel.text.toString())
            startActivity(intent)
        }

    }

    private fun initControl(){
        nombre = findViewById(R.id.edt_nombre_usuario)
        apellidoP = findViewById(R.id.edt_apellido_paterno_usuario)
        apellidoM = findViewById(R.id.edt_apellido_materno_usuario)
        numeroTel = findViewById(R.id.edt_numero_telefono_usuario)
        email = findViewById(R.id.edt_correo_usuario)
        buttonGuardar = findViewById(R.id.btn_guardar)
    }
}