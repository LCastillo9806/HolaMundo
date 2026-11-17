package com.example.holamundo

// Bundle permite manejar información relacionada con el estado de la Activity.
import android.os.Bundle

// ComponentActivity es la clase base de nuestra pantalla principal.
import androidx.activity.ComponentActivity

// Permite utilizar Jetpack Compose dentro de la Activity.
import androidx.activity.compose.setContent

// Permite que la aplicación aproveche toda la pantalla del dispositivo.
import androidx.activity.enableEdgeToEdge

// Herramientas para organizar y ajustar los elementos de la interfaz.
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding

// Componentes visuales de Material Design.
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text

// @Composable permite crear elementos de interfaz con Jetpack Compose.
import androidx.compose.runtime.Composable

// Modifier permite cambiar tamaño, posición, espaciado, etc.
import androidx.compose.ui.Modifier

// Permite visualizar la interfaz en Android Studio sin ejecutar la aplicación.
import androidx.compose.ui.tooling.preview.Preview

// Importamos el tema creado automáticamente para nuestro proyecto.
import com.example.holamundo.ui.theme.HolaMundoTheme


// ==========================================================
// 1. PANTALLA PRINCIPAL DE LA APLICACIÓN
// ==========================================================

// MainActivity es el punto de entrada principal de nuestra aplicación.
class MainActivity : ComponentActivity() {

    // onCreate() se ejecuta cuando Android abre esta pantalla.
    override fun onCreate(savedInstanceState: Bundle?) {

        // Ejecutamos primero el comportamiento normal de Android.
        super.onCreate(savedInstanceState)

        // Permitimos que la interfaz aproveche toda la pantalla.
        enableEdgeToEdge()

        // A partir de aquí definimos qué aparecerá en la pantalla.
        setContent {

            // Aplicamos el diseño y colores del tema HolaMundo.
            HolaMundoTheme {

                // Scaffold proporciona una estructura básica para la pantalla.
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    // Mostramos nuestro componente Greeting.
                    Greeting(
                        name = "Android",

                        // Evita que el contenido quede debajo de las
                        // barras superiores o inferiores del teléfono.
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


// ==========================================================
// 2. COMPONENTE QUE MUESTRA EL TEXTO
// ==========================================================

// @Composable indica que esta función genera una parte de la interfaz.
@Composable
fun Greeting(
    name: String,
    modifier: Modifier = Modifier
) {

    // Text es un componente de Jetpack Compose para mostrar texto.
    Text(
        text = "Hola Mundo",
        modifier = modifier
    )
}


// ==========================================================
// 3. VISTA PREVIA EN ANDROID STUDIO
// ==========================================================

// Preview permite ver el resultado en Android Studio
// sin tener que instalar la aplicación en el celular.
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

    // Aplicamos nuevamente nuestro tema.
    HolaMundoTheme {

        // Simulamos el componente que aparecerá en el teléfono.
        Greeting(name = "Android")
    }
}