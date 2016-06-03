package espresso.examples.ui.activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import espresso.examples.EspressoApp;
import espresso.examples.model.Planet;
import espresso.examples.net.services.StarWarsService;
import espresso.examples.ui.PlanetsList;
import espresso.examples.ui.presenters.PlanetsListPresenter;
import test.nice.testproject.R;

/**
 * The StartActivity is the initial activity of the app.
 */
public class PlanetListActivity extends Activity implements PlanetsList.View {

    public static final String TAG = "StartActivity";

    private PlanetsList.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        presenter = new PlanetsListPresenter(this, EspressoApp.getInstance().getRetrofit().create(StarWarsService.class));
        presenter.getPlanets();
    }


    @Override
    public void displayPlanets(List<Planet> planets) {
        for (Planet planet : planets) {
            Log.d(TAG, planet.getName());
        }
    }

    @Override
    public void error(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
