package com.example.lubuntupc.passingdatabackintent

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQUEST_CODE = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            var intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("DataToReceive", "Marta")

            startActivityForResult(intent, REQUEST_CODE)

        }

    }

    //do wyciagniecia wynikow z 2 activity
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE)  {
            if (resultCode == Activity.RESULT_OK) {
                var result = data!!.extras.get("return")

                Toast.makeText(this, result.toString(), Toast.LENGTH_SHORT).show()

            }
        }
    }
}
