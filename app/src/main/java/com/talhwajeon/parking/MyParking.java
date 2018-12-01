package com.example.nwerl.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MyParking extends Activity {
    int allNum = 30;
    int[] leftNum = new int[2];
    int img_top = 150;
    int img_bot = 100;
    int txt_top = 330;
    TextView[] leftSeat = new TextView[2];
    TextView[] allSeat = new TextView[2];
    ImageButton[] parkingLot = new ImageButton[2];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myparking);
        /*
        final TextView leftSeat = (TextView)findViewById(R.id.leftseat);
        leftSeat.setText(String.valueOf(leftNum));
        final TextView allSeat = (TextView)findViewById(R.id.allseat);
        allSeat.setText("/"+String.valueOf(allNum));
        ImageButton parkA = (ImageButton)findViewById(R.id.parkA);
        parkA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                leftNum = leftNum + 1;
                leftSeat.setText(String.valueOf(leftNum));
            }
        });*/

        final RelativeLayout RL = (RelativeLayout) findViewById(R.id.parkingArea);

        for (int i=0; i < 2; i++) {
            final int index;
            index = i;
            RelativeLayout.LayoutParams params =
                    new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                            RelativeLayout.LayoutParams.WRAP_CONTENT);
            params.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
            params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
            params.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
            params.setMargins(0, img_top, 0, img_bot);

            RelativeLayout.LayoutParams leftseatparams =
                    new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                            RelativeLayout.LayoutParams.WRAP_CONTENT);
            leftseatparams.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
            leftseatparams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
            leftseatparams.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
            leftseatparams.setMargins(390, txt_top, 0, 0);

            RelativeLayout.LayoutParams allseatparams =
                    new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                            RelativeLayout.LayoutParams.WRAP_CONTENT);
            allseatparams.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
            allseatparams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
            allseatparams.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
            allseatparams.setMargins(600, txt_top, 0, 0);


            leftSeat[i] = new TextView(this);
            leftSeat[i].setText(String.valueOf(leftNum[i]));
            leftSeat[i].setGravity(Gravity.CENTER);
            leftSeat[i].setTextSize(26);
            leftSeat[i].setLayoutParams(leftseatparams);

            allSeat[i] = new TextView(this);
            allSeat[i].setText("/" + String.valueOf(allNum));
            allSeat[i].setGravity(Gravity.CENTER);
            allSeat[i].setTextSize(26);
            allSeat[i].setLayoutParams(allseatparams);


            parkingLot[i] = new ImageButton(this);
            parkingLot[i].setImageResource(R.drawable.mypark3);
            parkingLot[i].setBackgroundColor(0);
            parkingLot[i].setLayoutParams(params);

            parkingLot[i].setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    leftNum[index] = leftNum[index] + 1;
                    leftSeat[index].setText(String.valueOf(leftNum[index]));
                    Intent intent = new Intent(
                            MyParking.this,
                            ParkMap.class);
                    startActivity(intent);
                }
            });


            RL.addView(parkingLot[i]);
            RL.addView(allSeat[i]);
            RL.addView(leftSeat[i]);


            img_top = 300 + img_top;
            txt_top = 300 + txt_top;
        }
   }
}
