package uk.co.belks.fragmentresultregistry

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        val rcs = outState.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS")
        val keys = outState.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS")

        Log.d("MainActivity", "${rcs?.size}: $rcs, $keys")
    }
}
