package br.edu.utfpr.trocatela

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LancamentoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lancamento)
    }

    fun btConfimarOnClick(view: View) {

        val etCod : EditText = findViewById( R.id.etCod )
        val etQtd : EditText = findViewById( R.id.etQtd )
        val etValor : EditText = findViewById( R.id.etValor )

        val intent = Intent( this, ConfirmarActivity::class.java )

        intent.putExtra( "cod", etCod.text.toString().toInt() )
        intent.putExtra( "qtd", etQtd.text.toString().toDouble() )
        intent.putExtra( "valor", etValor.text.toString().toDouble() )

        startActivity( intent )


    }
    fun btListarOnClick(view: View) {

    }
}