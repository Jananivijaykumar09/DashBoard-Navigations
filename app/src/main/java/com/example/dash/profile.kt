package com.example.dash

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class profile : AppCompatActivity()  {

    private val PICK_IMAGE_REQUEST = 1

    private lateinit var darkModeSwitch: Switch
    private lateinit var mainLayout: RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Initialize views
        darkModeSwitch = findViewById(R.id.darkModeSwitch)
        mainLayout = findViewById(R.id.hello) // Assuming your RelativeLayout has an id of mainLayout

        // Set switch listener
        darkModeSwitch.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // Switch is checked, set dark mode
                mainLayout.setBackgroundColor(resources.getColor(R.color.dark_blue))
            } else {
                // Switch is unchecked, revert to default color or any other color you prefer
                mainLayout.setBackgroundResource(R.drawable.profile_default)
            }
        }

        val backArrowImageView: ImageView = findViewById(R.id.backArrow)

        // Set click listener for the ImageView
        backArrowImageView.setOnClickListener {
            // Start MainActivity when ImageView is clicked
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
