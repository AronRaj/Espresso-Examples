package test.nice.testproject.dagger;

/**
 * Interfaces for objects that will fetch data from servers. However, for testing purposes testing with real server
 * would 1) take too slow, 2) be too flaky due to connectvitiy issues, 3) would not isolate us from changes on the
 * server side. For this reason is a better practice to test with mock responses. They will be provided by implementing
 * this interface.
 */
public interface DataFetcher {

	String getResponse();
}
