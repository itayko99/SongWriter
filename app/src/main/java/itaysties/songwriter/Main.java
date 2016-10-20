package itaysties.songwriter;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

/**
 * Created by USer on 2016-10-20.
 */

public class Main extends ActionBarActivity implements View.OnClickListener{

    Button button3;
    Toolbar toolbar2;

    @Override
    public void onClick(View v) {

        //Connect toolbar2 to toolBar2 in activity main
        toolbar2 = (Toolbar) findViewById(R.id.toolbar2);

        //Connect button3 to button3 inactivity main
        button3 = (Button) findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click button code goes here
                toolbar2.setVisibility(View.INVISIBLE);
            }
        });


    }
}
