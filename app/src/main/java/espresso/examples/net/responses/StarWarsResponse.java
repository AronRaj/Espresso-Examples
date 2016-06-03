package espresso.examples.net.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Class representing the response from <a href="http://swapi.co">swapi.co</a>
 */
public class StarWarsResponse<T> {

    @SerializedName("count")
    private int count;

    @SerializedName("next")
    private String next;

    @SerializedName("previous")
    private String previous;

    @SerializedName("results")
    private List<T> results;

    public int getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public String getPrevious() {
        return previous;
    }

    public List<T> getResults() {
        return results;
    }

}
