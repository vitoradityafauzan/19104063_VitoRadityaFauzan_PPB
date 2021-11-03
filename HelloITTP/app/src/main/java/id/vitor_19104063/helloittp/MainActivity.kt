package id.vitor_19104063.helloittp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPage = findViewById<Button>(R.id.btn_page)
        btnPage.setOnClickListener {
            val intent = Intent(this, HalamanActivity2::class.java)
            startActivity(intent)
        }
    }

    fun printState(msg: String){
        Log.d("ActivityState", msg) // Logcat yang muncul di bagian Logcat Android Studio
        Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show() //Toast ang muncul di bagian UI APP
    }

    override fun onStart() {
        super.onStart()
        printState("Halaman Satu onStart")
    }

    override fun onResume() {
        super.onResume()
        printState("Halaman Satu onResume")
    }

    override fun onPause() {
        super.onPause()
        printState("Halaman Satu onPause")
    }

    override fun onStop() {
        super.onStop()
        printState("Halaman Satu onStop")
    }

    override fun onRestart() {
        super.onRestart()
        printState("Halaman Satu onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        printState("Halaman Satu onDestroy")
    }
}