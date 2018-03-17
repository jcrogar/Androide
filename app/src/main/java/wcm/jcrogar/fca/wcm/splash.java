package wcm.jcrogar.fca.wcm;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class splash extends AppCompatActivity {
    private final int DURACION_SPLASH = 10000;
    ConstraintLayout myLayout;
    AnimationDrawable animationDrawable;
    public ProgressBar splash_progressbar;
    public int MAX_VALUE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        myLayout = (ConstraintLayout) findViewById(R.id.myLayout);
        animationDrawable = (AnimationDrawable) myLayout.getBackground();
        animationDrawable.setEnterFadeDuration(3000);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();


        splash_progressbar = (ProgressBar) findViewById(R.id.progressBar);
        splash_progressbar.setMax(100);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            Intent splash = new Intent(splash.this, MainActivity.class);
            startActivity(splash);
            finish();
            }
        }, DURACION_SPLASH);

        new CountDownTimer(10000, 100) {

            int progreso = 1;
            @Override
            public void onTick(long millisUntilFinished) {
                splash_progressbar.setProgress(progreso);
                progreso += (1);
            }

            @Override
            public void onFinish() {
                splash_progressbar.setProgress(MAX_VALUE);
            }
        }.start();

    }
}
