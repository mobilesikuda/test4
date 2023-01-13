import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    //var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {

        Box(
            contentAlignment = Alignment.Center,
        ) {

            val buttonsList = arrayOf("Задания", "Разгрузки", "Навалы")

            LazyVerticalGrid(
                GridCells.Fixed(2),
                horizontalArrangement = Arrangement.Center,
                verticalArrangement = Arrangement.Center

            ) {
                items(buttonsList.size) { item ->

                    Column(

                    ) {

//                        Image(
//                            ImageVector.vectorResource(R.drawable.ic_launcher_background),
//                            contentDescription = buttonsList[item],
//                            alignment = Alignment.TopCenter
//                        )

                        Text(
                            text = buttonsList[item],
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                            //modifier = Modifier.padding(20.dp)
                        )
                    }
                }
            }

        }
    }
}


fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}

//    ./gradlew run
//    ./gradlew createDistributable
//    ./gradlew runDistributable