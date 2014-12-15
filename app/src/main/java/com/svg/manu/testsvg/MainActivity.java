package com.svg.manu.testsvg;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.caverock.androidsvg.SVGImageView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout = (LinearLayout)findViewById(R.id.img);
        SVGImageView svgImageView = new SVGImageView(this);
        svgImageView.setImageAsset("degrade.svg");
        layout.addView(svgImageView,
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));

        LinearLayout layout2 = (LinearLayout)findViewById(R.id.img2);
        SVGImageView svgImageView2 = new SVGImageView(this);
        svgImageView2.setImageAsset("degrade.svg");
        layout2.addView(svgImageView2,
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));

        LinearLayout layout3 = (LinearLayout)findViewById(R.id.img3);
        SVGImageView svgImageView3 = new SVGImageView(this);
        svgImageView3.setImageAsset("degrade.svg");
        layout3.addView(svgImageView3,
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
