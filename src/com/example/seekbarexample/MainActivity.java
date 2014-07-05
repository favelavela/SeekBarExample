package com.example.seekbarexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends Activity implements SeekBar.OnSeekBarChangeListener {

    SeekBar seekBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        seekBar = (SeekBar)findViewById(R.id.seekbar);
        textView = (TextView)findViewById(R.id.textview);

        seekBar.setOnSeekBarChangeListener(this);
  
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        textView.setText(textView.getText()+"\n"+"SeekBar now at the value of:"+progress);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        textView.setText(textView.getText()+"\n"+"SeekBar Touch Started");
    }
 
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        textView.setText(textView.getText()+"\n"+"SeekBar Touch Stopped");

    }

}
