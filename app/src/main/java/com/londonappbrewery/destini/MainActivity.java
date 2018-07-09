package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
private  Button bottom_button;
private Button upper_button;
private TextView story_text;
private int mindex=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



bottom_button=findViewById(R.id.buttonBottom);
upper_button=findViewById(R.id.buttonTop);
story_text=findViewById(R.id.storyTextView);



bottom_button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast mtoast1=Toast.makeText(getApplicationContext(),"Lower button is pressed",Toast.LENGTH_SHORT);
mtoast1.show();
if(mindex==1)
        {
        story_text.setText(R.string.T2_Story);
        upper_button.setText(R.string.T2_Ans1);
        bottom_button.setText(R.string.T2_Ans2);
        mindex=2;
        }
else if(mindex==2)
        {
            story_text.setText(R.string.T4_End);
            upper_button.setVisibility(View.GONE);
            bottom_button.setVisibility(View.GONE);
        }
 else if (mindex==3)
{
    story_text.setText(R.string.T5_End);
    upper_button.setVisibility(View.GONE);
    bottom_button.setVisibility(View.GONE);
}
else if (mindex==6)
{
    story_text.setText(R.string.T5_End);
    upper_button.setVisibility(View.GONE);
    bottom_button.setVisibility(View.GONE);
}


    }
});

upper_button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast mtoast=Toast.makeText(getApplicationContext(),"upper botton is being pressed",Toast.LENGTH_SHORT);
mtoast.show();  { if(mindex==1)
                                {
                                story_text.setText(R.string.T3_Story);
                                upper_button.setText(R.string.T3_Ans1);
                                bottom_button.setText(R.string.T3_Ans2);
                                mindex=3;
                                }
                   else if(mindex==3)
        {
            story_text.setText(R.string.T6_End);
            upper_button.setVisibility(View.GONE);
            bottom_button.setVisibility(View.GONE);
        }
                else if (mindex==2)
        {
            story_text.setText(R.string.T3_Story);
            upper_button.setText(R.string.T3_Ans1);
            bottom_button.setText(R.string.T3_Ans2);
            mindex=6;
        }
        else if (mindex==6)
        {
            story_text.setText(R.string.T6_End);
            upper_button.setVisibility(View.GONE);
            bottom_button.setVisibility(View.GONE);
        }


        }
    }

});




    }


}
