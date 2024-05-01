package com.sebastiaovinicius.cartaodevisita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sebastiaovinicius.cartaodevisita.ui.theme.CartaoDeVisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaoDeVisitaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrantApp()
                }
            }
        }
    }
}


@Composable
fun ComposeQuadrantApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            ComposableCenterCard()
        }
        Row(Modifier.weight(1f)) {
            ComposableInfoCardBotton()
        }
    }


}



@Composable
fun ComposableCenterCard() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
        ,
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        val image = painterResource(R.drawable.android_logo)
        Image(painter = image,
            contentDescription = null,
            Modifier
                .size(100.dp)
                .background(Color.Black))
        Text(
            text = stringResource(R.string.nome),
            modifier = Modifier.padding(top = 4.dp, bottom = 2.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp
        )
        Text(
            text = stringResource(R.string.funcao),
            fontSize = 10.sp
        )

    }
}
@Composable
private fun ComposableInfoCardBotton(){
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(5.dp),

        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Row(Modifier.padding(0.03.dp)) {
            GetIcon(id = R.drawable.baseline_phone_black_24dp)
            GetString(id = R.string.string_phoneNumber)


        }
        Row() {
            GetIcon(id =
            R.drawable.baseline_attach_money_black_24dp)
            GetString(id = R.string.string_pix)
        }
        Row() {

            GetString(id = R.string.string_instagram)
        }
        Row() {

            GetString(id = R.string.string_group)
        }

    }
}

@Composable
private fun GetIcon(id: Int){
    val image = painterResource(id)
    Image(painter = image,
        contentDescription = null,
        Modifier
            .size(20.dp)
            .background(Color.White))
}
@Composable
private fun GetString(id: Int){
    Text(
        text = stringResource(id),
        fontSize = 10.sp
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CartaoDeVisitaTheme {
        ComposeQuadrantApp()
    }
}