package nanodegree.damian.fundisplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FunActivity extends AppCompatActivity {

    public static final String JOKE_KEY = "joke";
    public static final String FALLBACK_VALUE = "The user is no fun! :(";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun);

        TextView mainTextView = findViewById(R.id.tv_fun_holder);

        if (!getIntent().hasExtra(JOKE_KEY)) {
            mainTextView.setText(FALLBACK_VALUE);
            return ;
        }

        mainTextView.setText(getIntent().getStringExtra(JOKE_KEY));
    }
}
