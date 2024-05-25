package www.mafj.mylogin.ui.theme

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import www.mafj.mylogin.R


class Agenda : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var addButton: Button
    private lateinit var display: TextView

    private val agenda = mutableListOf<String>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        editText = this.findViewById(R.id.nombre)
        addButton = this.findViewById(R.id.añadir)
        display = this.findViewById(R.id.display)

        addButton.setOnClickListener {
            val newItem = editText.text.toString()
            if (newItem.isNotEmpty()) {
                agenda.add(newItem)
                displayAgenda()
                editText.text.clear()
            }
        }
    }

    private fun displayAgenda() {
        val agendaText = StringBuilder()
        for (item in agenda) {
            agendaText.append("- $item\n")
        }
        display.text = agendaText.toString()
    }
}
