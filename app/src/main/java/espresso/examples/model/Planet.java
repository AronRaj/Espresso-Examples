package espresso.examples.model;

import com.google.gson.annotations.SerializedName;

/**
 * Class representing a planet in the Star Wars universe
 */
public class Planet {

    @SerializedName("name")
    private String name;

    @SerializedName("climate")
    private String climate;

    @SerializedName("gravity")
    private String gravity;

    @SerializedName("terrain")
    private String terrain;

    @SerializedName("surface_water")
    private String surfaceWater;

    @SerializedName("population")
    private long population;

    public String getName() {
        return name;
    }

    public String getClimate() {
        return climate;
    }

    public String getGravity() {
        return gravity;
    }

    public String getTerrain() {
        return terrain;
    }

    public String getSurfaceWater() {
        return surfaceWater;
    }

    public long getPopulation() {
        return population;
    }



}
