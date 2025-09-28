package ie.setu.placemark.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import ie.setu.placemark.databinding.ActivityPlacemarkBinding
import ie.setu.placemark.models.PlacemarkModel
import timber.log.Timber
import timber.log.Timber.i

class PlacemarkActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlacemarkBinding
    private val placemarks = ArrayList<PlacemarkModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlacemarkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Timber.plant(Timber.DebugTree())
        i("Placemark Activity started...")

        binding.btnAdd.setOnClickListener {
            val title = binding.placemarkTitle.text.toString()
            val description = binding.placemarkDescription.text.toString()

            if (title.isNotEmpty()) {
                val newPlacemark = PlacemarkModel(title, description)
                placemarks.add(newPlacemark)
                i("New Placemark Added: $newPlacemark")
                i("All Placemarks: $placemarks")
            } else {
                Snackbar.make(it, "Please Enter a title", Snackbar.LENGTH_LONG).show()
            }
        }
    }
}
