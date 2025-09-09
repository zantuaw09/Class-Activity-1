package edu.temple.classactivity

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val messageTextView = findViewById<TextView>(R.id.messageTextView)
        val nameInputEditText = findViewById<EditText>(R.id.nameInputEditText)
        val submitButton = findViewById<Button>(R.id.submitButton)

        submitButton.setOnClickListener {
            val nameInput = nameInputEditText.text.toString()
            if (nameInput.isEmpty()) {
                messageTextView.text = "Please enter your name and submit :("
                messageTextView.setTextColor(Color.RED)
            } else {
                messageTextView.text = "Hello there, ${nameInput}!! :)"
                messageTextView.setTextColor(Color.BLUE)
                nameInputEditText.setText("")       // turns CharSequence -> Editable
            }
        }
    }
}