package com.example.insurancepremiumcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculate.setOnClickListener(){
           txtResult.text = "RM " +getPremium().toString();
        }
        btnReset.setOnClickListener(){
            Age.setSelection(0);
            radioGroup.clearCheck();
            radioGroup2.clearCheck();
            chkSmoke.setChecked(false);
            txtResult.setText("");



        }

    }
    fun getPremium():Double{
        return when(Age.selectedItemPosition){
            0 -> 60.00
            1 -> 70.00 +
                    (if(radMale.isChecked) 50.00 else 0.0) +
                    (if(chkSmoke.isChecked) 100.00 else 0.0)
            2 -> 90.00 +
                    (if(radMale.isChecked) 100.00 else 0.0) +
                    (if(chkSmoke.isChecked) 150.00 else 0.0)
            3 -> 120.00+
                    (if(radMale.isChecked) 150.00 else 0.0) +
                    (if(chkSmoke.isChecked) 200.00 else 0.0)
            4 -> 150.00+
                    (if(radMale.isChecked) 200.00 else 0.0) +
                    (if(chkSmoke.isChecked) 250.00 else 0.0)
            else -> 150.00 +
                    (if(radMale.isChecked) 200.00 else 0.0) +
                    (if(chkSmoke.isChecked) 300.00 else 0.0)

        }



    }
}
