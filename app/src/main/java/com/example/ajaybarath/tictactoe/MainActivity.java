package com.example.ajaybarath.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int ActivePlayer = 0;
    int gameState[]={2,2,2,2,2,2,2,2,2};
    public void imageTapped(View view){
        ImageView imgTapped = (ImageView) view;
        int temp = Integer.parseInt(imgTapped.getTag().toString());
        if (ActivePlayer == 0 && gameState[temp] == 2)
        {
            imgTapped.setImageResource(R.drawable.cross);
            gameState[temp] = ActivePlayer;
            ActivePlayer = 1;
        }
        else if (ActivePlayer == 1 && gameState[temp] == 2)
        {
            imgTapped.setImageResource(R.drawable.circle);
            gameState[temp] = ActivePlayer;
            ActivePlayer = 0;
        }
    }

    public void  resetTapped(View view)
    {
        for (int i=0;i<gameState.length;i++)
        {
            gameState[i] = 2;
        }
        ActivePlayer = 0;

        TableRow tableRow = (TableRow) findViewById(R.id.row1);

        for (int i=0;i<tableRow.getChildCount();i++)
        {
            ((ImageView)tableRow.getChildAt(i)).setImageResource(R.mipmap.ic_launcher);
        }

        TableRow tableRow2 = (TableRow) findViewById(R.id.row2);

        for (int i=0;i<tableRow2.getChildCount();i++)
        {
            ((ImageView)tableRow2.getChildAt(i)).setImageResource(R.mipmap.ic_launcher);
        }

        TableRow tableRow3 = (TableRow) findViewById(R.id.row3);

        for (int i=0;i<tableRow3.getChildCount();i++)
        {
            ((ImageView)tableRow3.getChildAt(i)).setImageResource(R.mipmap.ic_launcher);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
