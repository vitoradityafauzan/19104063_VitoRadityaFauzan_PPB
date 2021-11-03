package id.vitor_19104063.helloittp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class HalamanActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman2)
    }

    fun printState(msg: String){
        Log.d("ActivityState", msg) // Logcat, muncul di Logcat Android Studio
        Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show() //Toast, muncul di UI APP
    }

    override fun onStart() {
        super.onStart()
        printState("Halaman Dua onStart")
    }

    override fun onResume() {
        super.onResume()
        printState("Halaman Dua onResume")
    }

    override fun onPause() {
        super.onPause()
        printState("Halaman Dua onPause")
    }

    override fun onStop() {
        super.onStop()
        printState("Halaman Dua onStop")
    }

    override fun onRestart() {
        super.onRestart()
        printState("Halaman Dua onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        printState("Halaman Dua onDestroy")
    }

}