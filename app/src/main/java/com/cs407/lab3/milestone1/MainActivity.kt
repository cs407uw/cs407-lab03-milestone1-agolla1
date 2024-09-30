package com.cs407.lab3.milestone1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import android.view.MenuItem
import android.view.Menu


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitButton = findViewById<Button>(R.id.submitbutton)
        submitButton.setOnClickListener {
            showDialog()
        }
    }

    private fun showDialog() {
        AlertDialog.Builder(this)
            .setTitle("Dialog Title")
            .setMessage("This is a dialog message.")
            .setPositiveButton("OK") {dialog, _ ->
                dialog.dismiss()
            }
            .create()
            .show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.example_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.item1 -> {
                Toast.makeText(this, "item 1 selected", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.item2 -> {
                Toast.makeText(this, "item 2 selected", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.item3 -> {
                Toast.makeText(this, "item 3 selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.subitem1 -> {
                Toast.makeText(this, "SubItem 1 selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.subitem2 -> {
                Toast.makeText(this, "SubItem 2 selected", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}

