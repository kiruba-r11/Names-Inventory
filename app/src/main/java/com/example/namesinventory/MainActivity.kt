package com.example.namesinventory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.names_list_layout.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val names = arrayListOf<String>()

        names.add("Kiruba R")

        listViewOfNames.adapter = ArrayAdapter<String> (
            this ,
            R.layout.names_list_layout ,
            R.id.nameTextView ,
            names
        )

        listViewOfNames.setOnItemClickListener{ parent , view , position , id ->
            Toast.makeText(this , "Your name is: ${view.nameTextView.text}", Toast.LENGTH_SHORT).show()
        }
    }
}