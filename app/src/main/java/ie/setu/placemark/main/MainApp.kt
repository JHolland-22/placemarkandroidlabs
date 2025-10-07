import android.app.Application
import android.util.Log.i
import com.github.ajalt.timberkt.Timber
import ie.setu.placemark.models.PlacemarkModel
import timber.log.Timber.i

class MainApp : Application() {

    val placemarks = ArrayList<PlacemarkModel>()

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        i("Placemark started")
    }
}
