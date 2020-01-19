package com.danny.placeholderanimation;

import android.support.constraint.ConstraintLayout;
import android.support.constraint.Placeholder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Placeholder placeholder;
    private ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        placeholder = findViewById(R.id.placeholder);
        layout = findViewById(R.id.layout);

    }
    public void swapView(View v){
        TransitionManager.beginDelayedTransition(layout);
        placeholder.setContentId(v.getId());

    }
}
