package com.example.loginjc

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginjc.ui.theme.LoginJCTheme

class MainActivity : ComponentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginJCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var userName by remember { mutableStateOf(TextFieldValue()) }
    var password by remember {mutableStateOf(TextFieldValue(  ))}

    Column(
    modifier= Modifier
        .fillMaxSize()
        .padding(8.dp)
       ,
    verticalArrangement= Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally

) {

    Image(
        painter = painterResource(R.drawable.crying),
        contentDescription = "gato llorando"

    )

    TextField(
        modifier= Modifier
            .width(250.dp)
            .height(50.dp),
        value=userName,
        onValueChange = {userName=it},
        label = { Text("Nombre de usuario: ")}

    )

    TextField(
        modifier= Modifier
            .width(250.dp)
            .height(50.dp),
        value=password,
        onValueChange = {password=it},
        label ={ Text("Contraseña:")},
        visualTransformation = PasswordVisualTransformation(),
        //keyboardOptions = KeyboardOptions(keyboardType=KeyboardType.Password)

    )
        ElevatedButton(
            modifier=Modifier.padding(25.dp),
            onClick = { onClick() }) {

            Text("Go")





        }
}

@Composable
fun botonGo (onClick: () -> Unit) {


    }
}

fun onClick() {

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoginJCTheme {
        Greeting("Android")
    }
}