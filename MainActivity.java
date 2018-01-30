package com.example.amichai.mytextapplication;

import android.app.ActionBar;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {
    Button b23;
    ImageView cardImageView;
    TableLayout table;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardImageView = (ImageView) findViewById(R.id.cardImageView);
        cardImageView.setVisibility(View.INVISIBLE);
        table = (TableLayout) findViewById(R.id.tableLayout);

        b23 = (Button) findViewById(R.id.b23);

        b23.setBackgroundColor(Color.TRANSPARENT);

        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cardImageView.getVisibility() == View.VISIBLE) {
                    cardImageView.setVisibility(View.INVISIBLE);
                    table.setBackgroundResource(R.drawable.board);
                }else {
                    cardImageView.setBackgroundResource(R.drawable.park_place);
                    table.setBackgroundResource(R.drawable.board_dark);
                    cardImageView.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
