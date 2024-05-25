package www.mafj.mylogin.ui.theme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import www.mafj.mylogin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*Val = es una variable
        R.id = siempre va a ir de cajon
        lo mas importante de codigo es el main
         */
        val idUser=findViewById<EditText>(R.id.User)
        val idPassword=findViewById<EditText>(R.id.Password)
        val idResultado=findViewById<EditText>(R.id.Resultado)
        val idbutton=findViewById<Button>(R.id.button)
        val idbutton2=findViewById<Button>(R.id.button2)
        val idbutton3=findViewById<Button>(R.id.button3)
        val idbutton4=findViewById<Button>(R.id.button4)
        val idbutton5=findViewById<Button>(R.id.button5)
        //funsion .seOnCLickListener
        idbutton.setOnClickListener {
            // Sentencia para pasar de una actividad a otra "LoginActivity" se sustituye por el nombre de la actividad que vamos a mandar a llamar
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            // ............................................
            idUser.setText("Usuario Invalido")
        }
        idbutton2.setOnClickListener({
            idResultado.setText("SUMA")
        })
        idbutton3.setOnClickListener({
            idResultado.setText("RESTA")
        })
        idbutton4.setOnClickListener({
            idResultado.setText("MULTIPLICACION")
        })
        idbutton5.setOnClickListener({
            idResultado.setText("DIVISION")
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        })
    }
}