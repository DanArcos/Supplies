package com.example.supplies;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class PasswordDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public android.app.Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity()) ;

        LayoutInflater inflater = requireActivity().getLayoutInflater();

        //Inflate view
        View mView = inflater.inflate(R.layout.password_input,null);
        builder.setView(mView);

        final EditText pwText = (EditText) mView.findViewById(R.id.edit_text_password);

        builder.setTitle(R.string.pw_required);

        builder.setMessage(R.string.Enter_pw_neebs);

        builder.setPositiveButton(R.string.try_password, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //String by ID yields an integer, mustconvert to string
                String pw = pwText.getText().toString();
                Log.d("Password", pw);
                if (pw.equals(getResources().getString(R.string.unlock_password))){
                    Log.d("Password", "Password Accepted");
                    Intent intent = new Intent(getActivity(), SecondActivity.class);
                    startActivity(intent);
                }
            }
        })
        .setNegativeButton(R.string.i_no_no, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                PasswordDialog.this.getDialog().cancel();
            }
        });
        return builder.create();
    }
}
