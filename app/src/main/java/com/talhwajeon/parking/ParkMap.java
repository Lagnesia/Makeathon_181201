package com.talhwajeon.parking;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ParkMap extends AppCompatActivity {
    private String msg = "";
    private Handler mHandler;

    private Socket socket;

    private BufferedReader networkReader;

    private String ip = "xxx.xxx.xxx.xxx"; // IP
    private int port = 9999; // PORT번호

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park_map);

     /*   mHandler = new Handler();

        try {
            setSocket(ip, port);
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        checkUpdate.start();*/
    }

       /*

       private Thread checkUpdate = new Thread() {

            public void run() {
                try {
                    Log.w("Thread", "Start Thread");
                    while (true) {
                        msg = networkReader.readLine();
                        mHandler.post(showUpdate);
                    }
                } catch (Exception e) {

                }
            }
        };

        private Runnable showUpdate = new Runnable() {

            public void run() {
                Toast.makeText(ParkMap.this, "Coming word: " + msg, Toast.LENGTH_SHORT).show();
            }

        };

        public void setSocket(String ip, int port) throws IOException {

            try {
                socket = new Socket(ip, port);
                networkReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            } catch (IOException e) {
                System.out.println(e);
                e.printStackTrace();
            }
        }*/
}
