package com.example.supplies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int counter = 0;
    public MediaPlayer mediaPlayer;

    public CheckBox checkbox_bison;
    public CheckBox checkbox_sheepy;
    public CheckBox checkbox_bear;
    public CheckBox checkbox_kitters;
    public CheckBox checkbox_chipmunk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked(); //

        int toast_dur = Toast.LENGTH_SHORT;

        switch (view.getId()){
            case R.id.checkbox_bison:
                if (checked) {
                    counter++;
                    Log.d("Main_Activity_Checkbox", "Bison Checked");

                    // Load up audio file
                    mediaPlayer = MediaPlayer.create(this, R.raw.moo);
                    mediaPlayer.start();

                    //Set up toast
                    Toast toast = Toast.makeText(getApplicationContext(), "You saw a bison!", toast_dur);
                    toast.show();

                } else {
                    counter--;
                    Log.d("Main_Activity_Checkbox", "Bison unchecked");
                }
                break;
            case R.id.checkbox_sleepy_sheepy:
                if(checked){
                    counter++;
                    Log.d("Main_Activity_Checkbox", "Sleepy Sheepy Check");

                    // Load up audio file
                    mediaPlayer = MediaPlayer.create(this, R.raw.bahh);
                    mediaPlayer.start();

                    // Set up the toast
                    Toast toast = Toast.makeText(getApplicationContext(), "BAHHHHHHH!", toast_dur);
                    toast.show();
                } else {
                    counter--;
                    Log.d("Main_Activity_Checkbox", "Sleepy Sheepy uncheck");
                }
                break;
            case R.id.checkbox_bear:
                if(checked){
                    counter++;
                    Log.d("Main_Activity_Checkbox", "Bear Checked");

                    // Load up audio file
                    mediaPlayer = MediaPlayer.create(this, R.raw.bear_bear);
                    mediaPlayer.start();

                    Toast toast = Toast.makeText(getApplicationContext(), "You saw a bear bear. Watch out for more bear bears!", toast_dur);
                    toast.show();
                } else {
                    counter--;
                    Log.d("Main_Activity_Checkbox", "Bear uncheck");
                }
                break;
            case R.id.checkbox_chipmunk:
                if(checked){
                    counter++;
                    Log.d("Main_Activity_Checkbox", "Chipmunk Checked");

                    // Load up audio file
                    mediaPlayer = MediaPlayer.create(this, R.raw.carrot);
                    mediaPlayer.start();

                    Toast toast = Toast.makeText(getApplicationContext(), "You saw a chippy chip. Give it a carrot?", toast_dur);
                    toast.show();
                } else {
                    counter--;
                    Log.d("Main_Activity_Checkbox", "Chipmunk uncheck");
                }
                break;
            case R.id.checkbox_kitters:
                if(checked){
                    counter++;
                    Log.d("Main_Activity_Checkbox", "Kitters Checked");

                    // Load up audio file
                    mediaPlayer = MediaPlayer.create(this, R.raw.meow);
                    mediaPlayer.start();

                    Toast toast = Toast.makeText(getApplicationContext(), "You saw a kitters. MEOW MEOW", toast_dur);
                    toast.show();
                } else {
                    counter--;
                    Log.d("Main_Activity_Checkbox", "Kitters uncheck");
                }
                break;
        }

        if (counter == 5) {
            Toast toast = Toast.makeText(getApplicationContext(), "All items are checked!!", toast_dur);
            toast.show();
            openDialog();
        }

    }

    public void openDialog(){
        PasswordDialog passwordDialog = new PasswordDialog();
        passwordDialog.show(getSupportFragmentManager(), "password dialog" );
    }
}