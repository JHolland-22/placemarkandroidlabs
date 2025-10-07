package ie.setu.placemark.activities

import MainApp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ie.setu.placemark.R

class PlacemarkListActivity : AppCompatActivity() {

    lateinit var app: MainApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placemark_list)
        app = application as MainApp
    }
}
