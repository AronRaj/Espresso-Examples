package test.nice.testproject.dagger;

public class RealDataFetcher implements DataFetcher {

	/** This would return actual server data. For demo purposes we are only pretending to do that. */
	@Override
	public String getResponse() {
		return "'Real' server response";
	}
}
