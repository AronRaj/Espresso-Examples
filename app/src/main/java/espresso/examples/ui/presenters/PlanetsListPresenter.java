package espresso.examples.ui.presenters;

import espresso.examples.model.Planet;
import espresso.examples.net.responses.StarWarsResponse;
import espresso.examples.net.services.StarWarsService;
import espresso.examples.ui.PlanetsList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A Presenter for the Planet List section
 */
public class PlanetsListPresenter implements PlanetsList.Presenter {

    private StarWarsService service;

    private PlanetsList.View view;

    public PlanetsListPresenter(PlanetsList.View view, StarWarsService service) {
        this.service = service;
        this.view = view;
    }

    @Override
    public void getPlanets() {
        Call<StarWarsResponse<Planet>> planetsCall = service.getPlanets();

        planetsCall.enqueue(new Callback<StarWarsResponse<Planet>>() {
            @Override
            public void onResponse(Call<StarWarsResponse<Planet>> call, Response<StarWarsResponse<Planet>> response) {
                if(response.body().getResults() != null) {
                    view.displayPlanets(response.body().getResults());
                }
            }

            @Override
            public void onFailure(Call<StarWarsResponse<Planet>> call, Throwable t) {
                view.error(t.getMessage());
            }
        });
    }
}
