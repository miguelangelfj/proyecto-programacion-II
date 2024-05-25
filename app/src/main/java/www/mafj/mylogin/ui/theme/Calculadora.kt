package www.mafj.mylogin.ui.theme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import www.mafj.mylogin.R

class Calculadora : AppCompatActivity() {
    lateinit var valor1 :EditText
    lateinit var valor2 :EditText
    lateinit var imageButton3 :Button
    lateinit var Resultado : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        valor1 = findViewById(R.id.valor1)
        valor2 = findViewById(R.id.valor2)

    }
}