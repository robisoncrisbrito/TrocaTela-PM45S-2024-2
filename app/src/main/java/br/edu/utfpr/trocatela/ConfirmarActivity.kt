package br.edu.utfpr.trocatela

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ConfirmarActivity : AppCompatActivity() {

    private lateinit var tvCod : TextView
    private lateinit var tvQtd : TextView
    private lateinit var tvValor : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmar)

        tvCod = findViewById( R.id.tvCod )
        tvQtd = findViewById( R.id.tvQtd )
        tvValor = findViewById( R.id.tvValor )


        val cod = intent.getIntExtra( "cod", 0 )
        val qtd = intent.getDoubleExtra( "qtd", 0.0 )
        val valor = intent.getDoubleExtra( "valor", 0.0 )

        tvCod.text = cod.toString()
        tvQtd.text = qtd.toString()
        tvValor.text = valor.toString()

    }

    fun btConfimarOnClick(view: View) {

    }
}