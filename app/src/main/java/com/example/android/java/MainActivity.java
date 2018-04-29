package com.example.android.java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.faceIcon);
    }

    public void onButtonClick(View v) {
        Animation grow = AnimationUtils.loadAnimation(this, R.anim.grow);
        final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        final Animation zoom_in = AnimationUtils.loadAnimation(this, R.anim.zoom_in);
        final Animation zoom_out = AnimationUtils.loadAnimation(this, R.anim.zoom_out);
        final Animation fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        final Animation fade_out = AnimationUtils.loadAnimation(this, R.anim.fade_out);

        grow.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                //imageView.setScaleX(2);
                //imageView.setScaleY(2);
                imageView.startAnimation(zoom_out);
                //
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
        blink.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        zoom_in.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.startAnimation(blink);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        zoom_out.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.startAnimation(fade_out);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        fade_in.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.startAnimation(zoom_in);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        fade_out.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.startAnimation(fade_in);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        imageView.startAnimation(grow);

        //
        //
        //
        //
    }

}