package com.example.spinner2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpSimpleSpinner()
    }

    private fun setUpSimpleSpinner() {
        // you need to find reference to our id using find view by id
        val spinner = findViewById<Spinner>(R.id.spinner)
        // set adapter, and call it from Resource
        val adapter = ArrayAdapter.createFromResource(this@MainActivity,R.array.Currency,android.R.layout.simple_spinner_item)
        // set adapter to spinner
        spinner.adapter =adapter
// setting up item selected listener on the spinner
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                // p0= parent view and AdapterView itself,p1 = spinner, the spinner itself, p2, is the position
                // of the spinner
                val selectedItem = p0!!.getItemAtPosition(p2)
                Toast.makeText(this@MainActivity,"$selectedItem",Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                Toast.makeText(this@MainActivity,"no item is selected",Toast.LENGTH_LONG).show()
            }

        }

        }


    }
