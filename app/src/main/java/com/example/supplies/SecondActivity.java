package com.example.supplies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    public TextView mSwitcher;
    public ImageView mImgView;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mImgView = (ImageView) findViewById(R.id.img_view);

        mSwitcher = (TextView) findViewById(R.id.activity2_textview);

        counter = 1;
        update_text(counter);

        /*
        mSwitcher.setText(R.string.a_Congratulations);

        final Animation in = new AlphaAnimation(0.0f, 1.0f);
        in.setDuration(3000);

        final Animation out = new AlphaAnimation(1.0f, 0.0f);
        out.setDuration(3000);

        AnimationSet as = new AnimationSet(true);
        as.addAnimation(in);
        out.setStartOffset(4000);
        as.addAnimation(out);

        mSwitcher.startAnimation(as);
        */
        //mSwitcher.setText("This is the second text");
    }

    public void count_up(View view) {
        counter++;
        update_text(counter);
        /*String current_text = mSwitcher.getText().toString();
        String message_1 = getResources().getString(R.string.a_Congratulations);
        String message_2 = getResources().getString(R.string.b_you_made_it);
        String message_3 = getResources().getString(R.string.c_i_hope_this_was_fun_for_you);
        String message_4 = getResources().getString(R.string.d_message);
        String message_5 = getResources().getString(R.string.e_message);

        if(current_text.equals(message_1)){
            mSwitcher.setText(message_2);
        } else if (current_text.equals(message_2)){
            mSwitcher.setText(message_3);
        } else if (current_text.equals(message_3)){
            mSwitcher.setText(message_4);
            mImgView.setImageResource(R.drawable.artboard_1);
        }  else if (current_text.equals(message_4)){
            mSwitcher.setText(message_5);
            mImgView.setImageResource(R.drawable.artboard_2);
        } */
    }

    public void update_text(int counter) {
        String current_text = mSwitcher.getText().toString();
        String message_1 = getResources().getString(R.string.a_Congratulations);
        String message_2 = getResources().getString(R.string.b_you_made_it);
        String message_3 = getResources().getString(R.string.c_i_hope_this_was_fun_for_you);
        String message_4 = getResources().getString(R.string.d_message);
        String message_5 = getResources().getString(R.string.e_message);

        if(counter == 1) {
            mSwitcher.setText(message_1);
            mImgView.setVisibility(View.INVISIBLE);
            mImgView.setImageResource(R.drawable.artboard_1);
        } else if (counter == 2){
            mSwitcher.setText(message_2);
            mImgView.setVisibility(View.INVISIBLE);
        } else if (counter == 3){
            mSwitcher.setText(message_3);
            mImgView.setVisibility(View.VISIBLE);
            mImgView.setImageResource(R.drawable.artboard_1);
        }  else if (counter == 4){
            mSwitcher.setText(message_4);
            //mImgView.setImageResource(R.drawable.artboard_1);
        } else if (counter == 5){
            mSwitcher.setText(message_5);
            mImgView.setImageResource(R.drawable.artboard_2);
        }
    }
}