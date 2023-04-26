package com.example.formulario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ShowDataActivity : AppCompatActivity() {
    private lateinit var txtNombre: TextView
    private lateinit var txtApellidoP: TextView
    private lateinit var txtApellidoM: TextView
    private lateinit var txtTelefono: TextView
    private lateinit var txtEmail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_data)
        initControl()

        txtNombre.text = getDataUser().nombre
        txtApellidoP.text = getDataUser().apellidoPaterno
        txtApellidoM.text = getDataUser().apellidoMaterno
        txtTelefono.text = getDataTelefono().telefono
        txtEmail.text = getDataEmail().correo
    }

    private fun getDataUser() : Usuario{
        val bundle = intent.extras
        val data1  =  bundle?.getString("nombre")
        val data2  = bundle?.getString("apellidoP")
        val data3  = bundle?.getString("apellidoM")
        return Usuario(data1.toString(),data2.toString(),data3.toString())
    }

    private fun getDataEmail() : Correo{
        val bundle = intent.extras
        val data5  = bundle?.getString("correo")
        return Correo(data5.toString())
    }

    private fun getDataTelefono() : Telefono {
        val bundle = intent.extras
        val data5  = bundle?.getString("telefono")
        return Telefono(data5.toString())
    }


    private fun initControl(){
        txtNombre = findViewById(R.id.txt1)
        txtApellidoP = findViewById(R.id.txt2)
        txtApellidoM = findViewById(R.id.txt3)
        txtTelefono = findViewById(R.id.txt4)
        txtEmail = findViewById(R.id.txt5)
    }


}