package sg.edu.rp.c346.eventful;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements Home.OnFragmentInteractionListener, All.OnFragmentInteractionListener, Recommended.OnFragmentInteractionListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //replace the activity_main with Home(fragment) layout
        Home home = new Home();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(
                R.id.activity_main,
                home,
                home.getTag()
        ).commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
