package com.draper.fathercall;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private BackgroundMusic bgm = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bgm = BackgroundMusic.getInstance(this);
        ImageButton imageBtn1 = (ImageButton) findViewById(R.id.imageBtn1);
        ImageButton imageBtn2 = (ImageButton) findViewById(R.id.imageBtn2);
        ImageButton imageBtn3 = (ImageButton) findViewById(R.id.imageBtn3);
        ImageButton imageBtn4 = (ImageButton) findViewById(R.id.imageBtn4);
        ImageButton imageBtn5 = (ImageButton) findViewById(R.id.imageBtn5);
        ImageButton imageBtn6 = (ImageButton) findViewById(R.id.imageBtn6);
        ImageButton imageBtn7 = (ImageButton) findViewById(R.id.imageBtn7);
        Button btnPlay = (Button) findViewById(R.id.btnPlay);
        Button btnPause = (Button) findViewById(R.id.btnPause);
        Button btnStop = (Button) findViewById(R.id.btnStop);

        imageBtn1.setOnClickListener(new MyClickListener());
        imageBtn2.setOnClickListener(new MyClickListener());
        imageBtn3.setOnClickListener(new MyClickListener());
        imageBtn4.setOnClickListener(new MyClickListener());
        imageBtn5.setOnClickListener(new MyClickListener());
        imageBtn6.setOnClickListener(new MyClickListener());
        imageBtn7.setOnClickListener(new MyClickListener());
        btnPlay.setOnClickListener(new MyClickListener());
        btnPause.setOnClickListener(new MyClickListener());
        btnStop.setOnClickListener(new MyClickListener());

    }

    class MyClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.imageBtn1:
                    call("17797115216");
                    break;
                case R.id.imageBtn2:
                    call("XXXXXXXXXXX");
                    break;
                case R.id.imageBtn3:
                    call("XXXXXXXXXXX");
                    break;
                case R.id.imageBtn4:
                    call("XXXXXXXXXXX");
                    break;
                case R.id.imageBtn5:
                    call("XXXXXXXXXXX");
                    break;
                case R.id.imageBtn6:
                    call("XXXXXXXXXXX");
                    break;
                case R.id.imageBtn7:
                    call("XXXXXXXXXXX");
                    break;
                case R.id.btnPlay:
                    bgm.playBackgroundMusic(R.raw.dreaming_alone,false);
                    break;
                case R.id.btnPause:
                    if(bgm.isBackgroundMusicPlaying()){
                        bgm.pauseBackgroundMusic();
                    } else {
                        bgm.resumeBackgroundMusic();
                    }
                    break;
                case R.id.btnStop:
                    bgm.stopBackgroundMusic();
                    break;
            }
        }
    }

    public void call(String number) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + number));
        startActivity(intent);
    }


    public void callDad(View v) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:17797115216"));
        startActivity(intent);
    }


}

