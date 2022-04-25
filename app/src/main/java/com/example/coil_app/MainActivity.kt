package com.example.coil_app

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Surface
import org.w3c.dom.Text
import java.lang.reflect.Modifier

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

@Composable
fun LazyColumnClickable(selectedPerson: (int)->Unit){
    LazyColumn{
        items(8){
            Surface(modifier = Modifier.clickable{ selectedPerson(it+1) }){
                Text(
                    text = "Person ${it + 1}",
                    fontSize = 36.sp,
                    modifier = Modifier.padding(8.dp)
                )
                Divider(color = Color.GRAY, thickness = 1.dp)
            }
        }
    }
}

