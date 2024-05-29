package com.example.tutorial06_intents

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts

class HomeActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val button: Button = findViewById(R.id.button)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)

        imageView = findViewById(R.id.imageView)

        val thumbnailLauncer = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) {
            if (it.resultCode == RESULT_OK) {
                val data = it.data
                val imageBitmap = data?.extras?.get("data") as? Bitmap
                imageView.setImageBitmap(imageBitmap)
            }
        }

        button.setOnClickListener {
            // Explicit Intent
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            ////implicit intent to open the dialler with a number
            val number = "+94718003516"
            val uri = Uri.parse(String.format("tel:$number"))
            val intent = Intent()
            intent.action = Intent.ACTION_DIAL
            intent.data = uri
            startActivity(intent)
        }
        button3.setOnClickListener {
            //implicit intent to send sms
            val number = "+94718003516"
            val smsText = "Welcome to MAD project"
            val uri = Uri.parse(String.format("smsto:$number"))
            val intent = Intent()
            intent.action = Intent.ACTION_SENDTO
            intent.data = uri
            intent.putExtra("sms_body", smsText)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val url = "https://www.sliit.lk/"
            val uri = Uri.parse(url)
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = uri
            startActivity(intent)
        }
        button5.setOnClickListener {
            val mailTo = arrayOf("abc@gmail.com")
            val subject = "test Email"
            val mailBody = "This is body"

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.type = "message/rfc822"
            intent.putExtra(Intent.EXTRA_EMAIL, mailTo)
            intent.putExtra(Intent.EXTRA_SUBJECT, subject)
            intent.putExtra(Intent.EXTRA_TEXT, mailBody)
            startActivity(intent)

        }
        button6.setOnClickListener {
            val intent = Intent()
            intent.action = MediaStore.ACTION_IMAGE_CAPTURE
            thumbnailLauncer.launch(intent)
        }
    }
}