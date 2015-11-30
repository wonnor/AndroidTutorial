package writing.cmu.edu.androidtutorial;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void searchBtnPressed(View view) {
        EditText editText = (EditText)findViewById(R.id.searchField);

        String query = editText.getText().toString();

        Intent intent = new Intent(MainActivity.this, TimerActivity.class);
        Bundle b = new Bundle();
        b.putString("query", query);
        intent.putExtras(b);
        startActivity(intent);
        finish();
    }
}
