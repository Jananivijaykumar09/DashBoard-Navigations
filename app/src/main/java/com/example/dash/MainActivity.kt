package com.example.dash

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.ViewFlipper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    // on below line we are creating variables
    // for view flipper and our buttons
    lateinit var viewFlipper: ViewFlipper
    lateinit var prevBtn: Button
    lateinit var nextBtn: Button
    lateinit var visitCourseBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the ImageView and TextViews
        val bookmarkImageView: ImageView = findViewById(R.id.imageView1)
        val searchImageView: ImageView = findViewById(R.id.imageView2)
        val libraryImageView: ImageView = findViewById(R.id.imageView7)
        val profileImageView: ImageView = findViewById(R.id.imageView8)

        val bookmarkTextView: TextView = findViewById(R.id.textView)
        val searchTextView: TextView = findViewById(R.id.textView4)
        val libraryTextView: TextView = findViewById(R.id.textView5)
        val profileTextView: TextView = findViewById(R.id.textView7)



        // Set OnClickListener for profile action
        profileImageView.setOnClickListener {
            // Add your profile action here
            // For example, open the profile activity
            // Replace "YourProfileActivity::class.java" with your actual profile activity
            val intent = Intent(this,profile::class.java)
            startActivity(intent)
        }
        profileTextView.setOnClickListener {
            // Add your profile action here
            // For example, open the profile activity
            // Replace "YourProfileActivity::class.java" with your actual profile activity
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }





        // initializing variables of view flipper
        // and button with their ids.
        viewFlipper = findViewById(R.id.idViewFlipper)
        prevBtn = findViewById(R.id.idBtnPrev)
        nextBtn = findViewById(R.id.idBtnNext)
        visitCourseBtn = findViewById(R.id.idBtnViewCourse)

        // on below line adding on click listener
        // for our visit course button.
        visitCourseBtn.setOnClickListener {
            // on below line we are creating intent
            // for opening a new course in chrome tab.
            val openCourse = Intent(android.content.Intent.ACTION_VIEW)
            // on below line we are setting the
            // url which we have to open.
            openCourse.data = Uri.parse("https://www.india.gov.in/topics/law-justice/")
            // on below line we are calling start
            // activity to start a new activity.
            startActivity(openCourse)
        }
        // adding on click listener
        // for our previous button.
        prevBtn.setOnClickListener {
            // on below line we are simply calling
            // view flipper to show previous screen.
            viewFlipper.showPrevious()
        }

        // adding on click listener
        // for our next button.
        nextBtn.setOnClickListener {
            // on below line we are simply calling
            // view flipper to show next screen.
            viewFlipper.showNext()
        }
    }
}
