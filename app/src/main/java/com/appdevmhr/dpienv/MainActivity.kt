package com.appdevmhr.dpienv

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.appdevmhr.dpienv.ui.theme.DPIENVTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DPIENVTheme {
                // A surface container using the 'background' color from the theme
                Screen(
                    title = "Department Of Environment",
                    data = "Environmental Technology is one of the most sophisticated engineering in modern era. It is a famous department of the country which provide quality education and research about environmental protection and sustainability. Environmental Technology provide knowledge about air, water and soil quality and pollution, water treatment, wastewater treatment, air pollution control, noise control, soil pollution, solid waste management, water supply, biodiversity protection, environmental law, human health etc.to create better habitat for human and living being.We have modern laboratory and blended classroom to provide students skills, knowledge and social responsibilities. We have strong industry linkage to promote students for choosing better profession.We produce work-ready graduates for government, industry and community."
                )
            }
        }
    }
}

@Composable
fun Screen(
    title: String,
    data: String
) {
    val scr = rememberScrollState()
    Surface(
        modifier = Modifier
            .verticalScroll(scr)
            .fillMaxSize()
            .padding(16.dp),
        color = MaterialTheme.colorScheme.background
    ) {

        Column {
            Text(
                style = TextStyle(
                    fontSize = 30.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.W900
                ),
                text = title,
            )
            Spacer(modifier = Modifier.height(30.dp))
            Image(
                painter = painterResource(id = R.drawable.et),
                contentDescription = "",
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
            Spacer(modifier = Modifier.height(30.dp))
            GreetingDPICST(data = data)
        }

    }
}

@Composable
fun GreetingDPICST(data: String, modifier: Modifier = Modifier) {
    Text(
        style = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.SemiBold
        ),
        textAlign = androidx.compose.ui.text.style.TextAlign.Justify,
        text = data,
        modifier = modifier
    )
}
