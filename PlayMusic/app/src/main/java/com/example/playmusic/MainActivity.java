package com.example.playmusic;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RemoteViews;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.marinasatti);
        final Button button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button b = (Button) v;
                String buttonText = b.getText().toString();


                if (buttonText.contains("PLAY")) {
                    player.start();
                    //button.setBackgroundResource(R.drawable.ic_pause);
                    button.setText("PAUSE");

                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, "PLAY PUSHED", Toast.LENGTH_SHORT);
                    toast.show();

                }

                if(buttonText.contains("PAUSE")){
                    player.pause();
                    //button.setBackgroundResource(R.drawable.ic_play);
                    button.setText("PLAY");

                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, "PAUSE PUSHED", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }

        });
    }
}
