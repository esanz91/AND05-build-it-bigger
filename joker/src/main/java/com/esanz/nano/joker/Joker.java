package com.esanz.nano.joker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Joker extends AppCompatActivity {

    public static final String EXTRA_JOKE = "joke";

    public static Intent createIntent(Context context, String joke) {
        Intent intent = new Intent(context, Joker.class);
        intent.putExtra(EXTRA_JOKE, joke);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joker);

        if (null != getIntent()) {
            String joke = getIntent().getStringExtra(EXTRA_JOKE);
            ((TextView) findViewById(R.id.joke)).setText(joke);
        }
    }
}
