package ru.myitschool.mysettings;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {
    int hourOfDay;
    String helloText;
    String[] a = {"Do not ask again"};
    boolean[] value = {false};

    TextView hello;
    Button accept, decline;
    alertDialogFragment fragment = new alertDialogFragment();
    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.fragment_appear, R.anim.fragment_appear)
                .add(R.id.container, fragment).commit();

//        hello = (TextView) findViewById(R.id.helloText);
//
//        hourOfDay = Calendar.HOUR + 12 * Calendar.PM;
//        if (hourOfDay >=  0 && hourOfDay < 7)
//            helloText = getResources().getString(R.string.gN);
//        if (hourOfDay > 6 && hourOfDay < 13)
//            helloText = getResources().getString(R.string.gM);
//        if (hourOfDay > 12 && hourOfDay < 19)
//            helloText = getResources().getString(R.string.gA);
//        if (hourOfDay > 18 && hourOfDay < 24)
//            helloText = getResources().getString(R.string.gE);
//        hello.setText(String.valueOf(helloText));

//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//
//        LayoutInflater inflater = getLayoutInflater();
//        View dialogView = inflater.inflate(R.layout.alert_dialog_fragment,null);
//
//        // Set the custom layout as alert dialog view
//        builder.setView(dialogView);
//
//        // Get the custom alert dialog view widgets reference
//        Button btn_positive = (Button) dialogView.findViewById(R.id.alert_button_ok);
//        // Create the alert dialog
//        final AlertDialog dialog = builder.create();
//
//        // Set positive/yes button click listener
//        btn_positive.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            }
//        });
//
//        // Display the custom alert dialog on interface
//        dialog.show();
    }
}