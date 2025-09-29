# Tarea2 - Activities: EL RINCON DEL ATLETA

##  Objetivo del Proyecto

Esta aplicación Android fue desarrollada para demostrar una **navegación de usuario inmersiva y temática**, cumpliendo con la estructura de tres niveles de jerarquía requerida. El diseño prioriza las **transiciones creativas** y la coherencia visual para llevar al usuario a un viaje desde la selección de un deporte hasta el análisis de un momento histórico de un atleta.

---

## Estructura de la Aplicación

La aplicación se compone de tres Activities principales, cada una representando un nivel jerárquico:

### Nivel 1: Selección de Deporte (`SportSelectionActivity`)

Esta es la pantalla de inicio, diseñada con un **fondo oscuro y dinámico** (`background_dark_gradient.xml`) para evocar velocidad y energía. Los **botones de deporte** (Fútbol, Baloncesto) actúan como los puntos de interés principales.

* **Experiencia Visual:** Botones grandes y coloridos sobre un fondo profundo.
* **Punto de Interés / Fragment:** Un botón de información lanza el **`WelcomeFragment`** (`DialogFragment`) con una animación de **deslizamiento desde abajo (`SLIDE-UP`)**, dando instrucciones de uso de manera elegante.
* **Transición ($\to$ Nivel 2):** Al tocar un deporte, se ejecuta una **Shared Element Transition (Zoom)**. El botón seleccionado se agranda y se expande rápidamente para llenar la pantalla, simulando una entrada o inmersión al mundo de ese deporte.

### Nivel 2: Lista de Atletas (`AthleteListActivity`)

La atmósfera cambia al ingresar al deporte. El fondo es una **imagen oscura o borrosa de un estadio** (`background_stadium_blur`), enfocando la atención en el contenido. La información se presenta en un `RecyclerView` que contiene **tarjetas de atletas** oscuras con fotos de acción.

* **Puntos de Interés:** Cada tarjeta individual es un punto de interés interactivo.
* **Transición Creativa ($\to$ Nivel 3):** Al seleccionar un atleta, se ejecuta una **Shared Element Transition** avanzada. La **imagen del atleta** y su **nombre** se animan fluidamente, viajando desde la tarjeta en la lista hasta la parte superior de la pantalla de detalle del Nivel 3, creando un efecto de zoom profesional y enfocado.

### Nivel 3: Detalle del Momento Clave (`MomentDetailActivity`)

Esta es la capa de inmersión final, dedicada a la narrativa del logro del atleta. La pantalla es **dominada por la imagen** (recibida de la transición del Nivel 2), y se presenta el nombre del atleta y el título del momento.

* **Punto de Interés y Fragment:** El botón **"VER ESTADÍSTICAS"** (`btn_show_stats_fragment`) es el punto de interés final. Al presionarlo, lanza el **`StatsFragment`** (`DialogFragment`).
* **Transición del Fragment:** El `StatsFragment` aparece con la misma animación de **deslizamiento desde abajo (`SLIDE-UP`)** usada en el Nivel 1, proporcionando los datos clave y récords del atleta sin romper el flujo de la Activity.

---

## Capturas de Pantalla

| Nivel 1: Selección de Deporte | Nivel 2: Lista de Atletas | Nivel 3: Detalle del Momento |
| :--- | :--- | :--- |
| [Captura de pantalla de la vista principal con botones de deporte] | [Captura de pantalla de la lista de atletas con tarjetas] | [Captura de pantalla de la vista de detalle con la imagen ampliada y el botón de estadísticas]

---