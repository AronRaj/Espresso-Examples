package espresso.examples;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * The Application class
 */
public class EspressoApp extends Application {

    private static EspressoApp instance;

    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        retrofit = new Retrofit.Builder()
                .baseUrl("http://swapi.co/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }

    public static EspressoApp getInstance() {
        return instance;
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }
}
