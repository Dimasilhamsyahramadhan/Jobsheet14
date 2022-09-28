package com.example.jobsheet14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val to = findViewById<Button>(R.id.to)
        val tpfl = findViewById<Button>(R.id.tpfl)
        val pplg = findViewById<Button>(R.id.pplg)
        val kuliner = findViewById<Button>(R.id.kuliner)
        val busana = findViewById<Button>(R.id.busana)

        to.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, to())
            fragmentTransaction.commit()
        }

        tpfl.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, tpfl())
            fragmentTransaction.commit()
        }

        pplg.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, pplg())
            fragmentTransaction.commit()
        }

        kuliner.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, kuliner())
            fragmentTransaction.commit()
        }

        busana.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, busana())
            fragmentTransaction.commit()
        }
    }
}