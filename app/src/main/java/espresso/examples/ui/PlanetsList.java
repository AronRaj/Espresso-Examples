package espresso.examples.ui;

import java.util.List;

import espresso.examples.model.Planet;

/**
 * The View and Presenter for the Planet List section of the app.
 */
public interface PlanetsList {

    interface View {

        void displayPlanets(List<Planet> planets);

        void error(String message);

    }

    interface Presenter {

        void getPlanets();


    }

}
