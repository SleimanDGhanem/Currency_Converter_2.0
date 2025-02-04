package com.example.currency_converter_20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    //Declaring variables used in UI
    EditText name;
    ImageView converter_logo;
    boolean name_is_entered;


    //API and database connection with front end




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaring the variables used in UI
        name = (EditText) findViewById(R.id.name);
        converter_logo = (ImageView) findViewById(R.id.converter);
        name_is_entered = false;
        //Adding animation to logo
        converter_logo.setTranslationX(-1000);
        converter_logo.animate().translationXBy(1000).setDuration(2000);


    }

    //Onclick method used on start button
    public void start(View view){


            //Declaring and initializing variables that are being sent to page 2
            String entered_name = name.getText().toString();
            Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
            intent.putExtra("name", entered_name);
            startActivity(intent);
            name_is_entered = true;


            //if condition to ensure that the user has entered his name in order to proceed
            if (name_is_entered){


        }else {
                //Legislative reasons to make it more legitimate
                Toast.makeText(getApplicationContext(),"You must enter your name (legislative reasons)",Toast.LENGTH_LONG).show();
            }
    }
}
