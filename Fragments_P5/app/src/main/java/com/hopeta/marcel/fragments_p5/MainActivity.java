package com.hopeta.marcel.fragments_p5;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;


public class MainActivity extends Activity implements ChangeMainImage{

    ImageView mainImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainImg = (ImageView)findViewById(R.id.mainimg);

        getFragmentManager()
                .beginTransaction()
                .add(R.id.container1,new Fragment1())
                .commit();

        getFragmentManager()
                .beginTransaction()
                .add(R.id.container2,new Fragment2())
                .commit();

        getFragmentManager()
                .beginTransaction()
                .add(R.id.container3,new Fragment3())
                .commit();

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

    @Override
    public void ChangeImg(int img)
    {
        mainImg.setBackgroundResource(img);
    }
}
