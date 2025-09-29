package com.tarea.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat

class SportSelectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sport_selection)

        // Enlazar los botones (Puntos de Interés)
        val btnFutbol: Button = findViewById(R.id.btn_futbol)
        val btnBaloncesto: Button = findViewById(R.id.btn_baloncesto)
        val btnTenis: Button = findViewById(R.id.btn_tenis)
        val btnInfo: ImageButton = findViewById(R.id.button_info)

        // 1. Configurar los clics para la navegación y transición
        btnFutbol.setOnClickListener { navigateToAthleteList("Fútbol", it) }
        btnBaloncesto.setOnClickListener { navigateToAthleteList("Baloncesto", it) }
        btnTenis.setOnClickListener { navigateToAthleteList("Tenis", it) }

        // 2. Configurar el clic para mostrar el Fragment de Bienvenida
        btnInfo.setOnClickListener {
            // Muestra el Fragmento de Bienvenida como un DialogFragment
            WelcomeFragment().show(supportFragmentManager, "WelcomeFragmentTag")
        }
    }

    /**
     * Navega a la Activity de la lista de atletas con una Transición Creativa de Shared Element Transition.
     * @param sportName El deporte seleccionado.
     * @param sharedElement El botón que se usará como elemento compartido en la transición.
     */
    private fun navigateToAthleteList(sportName: String, sharedElement: View) {
        val intent = Intent(this, AthleteListActivity::class.java).apply {
            putExtra("EXTRA_SPORT_NAME", sportName) // Pasa el dato
        }

        // Usaremos el mismo nombre de transición definido en activity_sport_selection.xml
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this,
            sharedElement,
            sharedElement.transitionName // Obtenemos el nombre "sport_transition" directamente de la vista
        )

        startActivity(intent, options.toBundle())
    }
}