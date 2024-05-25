package www.mafj.mylogin.ui.theme

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import www.mafj.mylogin.R


class SplasScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splas_screen)
        // todo este codigo me sirve para ejecutar tareas o procesos despues de X tiempo
        Handler().postDelayed(Runnable {
            //----------------------------
        //entre estas llaves voy a poner lo que valla arealizar en los segundos que le valla asignar en la parte de abao
            //----------------------------
            //este codigo me sirve para brincar de una a otra
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            //*Finaliza actual Activity.
            finish();
        }, 5000) //5000 millisegundos = 5 segundos.

    }
}