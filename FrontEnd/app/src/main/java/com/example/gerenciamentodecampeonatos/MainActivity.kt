package com.example.gerenciamentodecampeonatos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var edSenha: EditText
    private lateinit var edEmail: EditText
    private lateinit var btRegistrar: Button
    private lateinit var btLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()

        splashScreen.setKeepOnScreenCondition {
            Thread.sleep(1000)
            false
        }
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        edSenha = findViewById(R.id.edSenha)
        edEmail = findViewById(R.id.edEmail)
        btRegistrar = findViewById(R.id.btRegistrar)
        btLogin = findViewById(R.id.btLogin)

        btRegistrar.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)

        }

        btLogin.setOnClickListener {

        }





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}