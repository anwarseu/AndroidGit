package me.dotcode.androidgit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import me.dotcode.androidgit.ui.theme.AndroidGitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidGitTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    println("This is first commit")
    println("This is second commit")
    println("=============rebase practice=============")
    println("This is first commit in main")
    println("This is second commit in main")
    println("This is third commit in main")
    println("==========rebase-feature==========")
    println("This is first commit in dev-1002")
    println("This is second commit in dev-1002")
    println("This is third commit in dev-1002")
    println("=============jenkins pipeline practice=============")
    println("Jenkins pipeline successfully working!")
   
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidGitTheme {
        Greeting("Android")
    }
}
