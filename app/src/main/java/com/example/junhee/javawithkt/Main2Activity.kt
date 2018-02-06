package com.example.junhee.javawithkt

import android.os.Bundle

import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity(), Main2View {

    override var presenter: Main2Presenter = Main2Presenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { v ->
            presenter.start()
        }
    }

    override fun showHi() {
        Toast.makeText(this, "hi!", Toast.LENGTH_SHORT).show()
    }
}
