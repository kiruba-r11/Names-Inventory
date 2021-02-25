package com.example.namesinventory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.names_list_layout.*
import kotlinx.android.synthetic.main.names_list_layout.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name: String
        var arrayList = ArrayList<String>()
        button.setOnClickListener {
            name = editText.text.toString()
            listViewOfNames.adapter = ArrayAdapter<String>(this,
                    R.layout.names_list_layout,
                    R.id.nameTextView,
                    arrayList
            )
            if(name.isNotEmpty())
                arrayList.add(name)
            else
                Toast.makeText(this , "Text is empty", Toast.LENGTH_SHORT).show()
        }
    }
}