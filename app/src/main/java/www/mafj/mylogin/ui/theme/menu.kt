package www.mafj.mylogin.ui.theme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import www.mafj.mylogin.R

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val Calculadora_botton = findViewById<Button>(R.id.button6)
        val Agenda_botton = findViewById<Button>(R.id.button7)
        Calculadora_botton.setOnClickListener({
            //cambio de pagina a calculadora
            val intent = Intent(this, Calculadora::class.java)
            startActivity(intent)

        })
        //cambio de pagina agenda
        Agenda_botton.setOnClickListener ({

            val intent = Intent(this, Agenda::class.java)
            startActivity(intent)

        })
    }

    }
