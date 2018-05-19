package com.example.lubuntupc.passingdatabackintent

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var data = intent.extras
        var name = data.get("DataToReceive")

        if (data != null) {
            Toast.makeText(this, name.toString() , Toast.LENGTH_SHORT).show()
        }

        //back button
        btn2.setOnClickListener {
            var returnIntent = this.intent
            returnIntent.putExtra("return", "Hello from sec act")
            setResult(Activity.RESULT_OK, returnIntent)
            finish()
        }
    }
}
