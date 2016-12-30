package itaysties.songwriter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Switch;

import static itaysties.songwriter.R.layout.activity_project;

public class Project extends AppCompatActivity {

    Switch switch2 = (Switch) findViewById(R.id.switch2);
    GridLayout grid = (GridLayout) findViewById(R.id.grid);
    //grid.setVisibility(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_project);

        getActionBar().setHomeButtonEnabled(true);

        switch2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (grid.getVisibility() == View.VISIBLE) {
                    grid.setVisibility(View.GONE);
                }

                else {
                    grid.setVisibility(View.VISIBLE);
                }
            }

        });
    }

    /**
     * Let's the user tap the activity icon to go 'home'.
     * Requires setHomeButtonEnabled() in onCreate().

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                startActivityAfterCleanup(MainActivity.class);
                return true;
        }
        return (super.onOptionsItemSelected(menuItem));
    }

    private void startActivityAfterCleanup(Class<?> cls) {
        if (Project.class != null) (Project.class).close();
        Intent intent = new Intent(getApplicationContext(), cls);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }*/

}
