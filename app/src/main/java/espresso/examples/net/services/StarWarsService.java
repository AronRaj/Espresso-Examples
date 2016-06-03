package espresso.examples.net.services;

import espresso.examples.model.Planet;
import espresso.examples.net.responses.StarWarsResponse;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Service to interact with <a href="http://swapi.co">swapi.co</a>
 */
public interface StarWarsService {

    @GET("planets")
    Call<StarWarsResponse<Planet>> getPlanets();

}
