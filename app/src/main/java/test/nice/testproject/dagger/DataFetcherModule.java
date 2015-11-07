package test.nice.testproject.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Single Responsibility:
 *
 * This component would return an actual object fetching data from server. For purposes of demo we will return
 * 'pretend data'
 */
@Module
public class DataFetcherModule {

	@Provides
	@Singleton
	public DataFetcher providesRealDataFetcher() {
		return new RealDataFetcher();
	}

}
