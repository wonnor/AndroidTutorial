package writing.cmu.edu.androidtutorial;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class TimerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        final TextView timerText = (TextView)findViewById(R.id.timerText);
        new CountDownTimer(3000, 1000) {
            public void onTick(long millisUntilFinished) {
                timerText.setText("" + (millisUntilFinished / 1000));
            }

            public void onFinish() {
                Intent intent = new Intent(TimerActivity.this, SearchActivity.class);
                intent.putExtras(getIntent().getExtras());
                startActivity(intent);
                finish();
            }
        }.start();

    }

}
