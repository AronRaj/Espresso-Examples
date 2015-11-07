package test.nice.testproject.dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class MockModule {

	@Provides
	public DataFetcher providesMockDataFetcher() {
		return new MockDataFetcher();
	}
}
