package com.example.stujob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * @author Daniel Moradi
 * Här skrivs javakoden för logiken.
 */

public class MainActivity extends AppCompatActivity {

    private EditText editTxtFirstName;
    private EditText editTxtLastName;
    private RadioButton rbtnEmployer;
    private RadioButton rbtnStudent;
    private Button btnCreate;
    private String firstName;
    private String lastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        findLayoutViews(); //för att hitta och initiera alla views från activity_register
        setupButtonClickListener();
    }



    /**
     * Alla xml-views får id och blir kopplade till instansvariabler
     */
    public void findLayoutViews(){
        editTxtFirstName = findViewById(R.id.edit_text_first_name);
        editTxtLastName = findViewById(R.id.edit_text_last_name);
        rbtnEmployer = findViewById(R.id.radio_button_employer);
        rbtnStudent = findViewById(R.id.radio_button_student);
        btnCreate = findViewById(R.id.button_create);
    }


    /**
     * Funktion skapa listener för button Create
     */
    public void setupButtonClickListener() {
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Skapa en alert som poppar upp
                Toast.makeText(MainActivity.this, "Grattis, nytt konto skapat!", Toast.LENGTH_LONG).show();
                captureValueFromLayoutViews(); //spara ner det användaren skrev in
                setContentView(R.layout.activity_login); //komma till longin-sidan
            }
        });
    }

    /**
     * hämta inpu från användare, behöver utökas
     */
    public void captureValueFromLayoutViews(){
        firstName = editTxtFirstName.getText().toString();
        lastName = editTxtLastName.getText().toString();

    }
}