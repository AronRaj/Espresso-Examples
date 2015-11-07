package test.nice.testproject.dagger;

/**
 * This will be used to imitate server response
 */
public class MockDataFetcher implements DataFetcher {

	public static final String MOCK_RESPONSE = "This is Mock Response";

	@Override
	public String getResponse() {
		return MOCK_RESPONSE;
	}
}
