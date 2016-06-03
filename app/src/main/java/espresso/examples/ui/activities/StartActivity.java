package espresso.examples.ui.activities;

import android.app.Activity;
import android.os.Bundle;

import test.nice.testproject.R;

/**
 * The StartActivity is the initial activity of the app.
 */
public class StartActivity extends Activity {

    public static final String TAG = "StartActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }
}
