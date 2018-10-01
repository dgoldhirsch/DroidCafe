package org.cornmuffin.droidcafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        String order = getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE);
        String displayableMessage = getString(R.string.Order) + order;
        TextView textView = findViewById(R.id.order_textview);
        textView.setText(displayableMessage);
    }
}
