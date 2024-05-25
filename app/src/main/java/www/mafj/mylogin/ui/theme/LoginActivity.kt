package www.mafj.mylogin.ui.theme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import www.mafj.mylogin.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val usr= findViewById<EditText>(R.id.editTextText)
        val psw= findViewById<EditText>(R.id.editTextText2)
        val iniciar= findViewById<Button>(R.id.buttonl)


        iniciar.setOnClickListener {
            //verificar si estan bien los datos preguardados

            if (usr.text.toString().equals("MIGUEL") && psw.text.toString().equals("1234")) {
                Toast.makeText(this, "ES CORRECTO", Toast.LENGTH_SHORT).show()
             //cambio de pagina menu
                val intent = Intent(this, menu::class.java)
                startActivity(intent)
                //*Finaliza para no poder regresar a la pantalla siguiente.
                finish();
            } else {
                Toast.makeText(this, "ES INCORRECTO", Toast.LENGTH_SHORT)
                    .show()

            }
        }


        /*val idlistas=findViewById<EditText>(R.id.Listas)
        val listas=""
        for (30)
            idlistas=idlistas+" "+i
        idlistas.setText(listas)*/
    }
}

private operator fun Boolean.invoke(value: Any) {

}
