package test.nice.testproject.dagger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.runner.RunWith;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;

/**
 * Examples how to use dependency injection with Dagger 2 in testing.
 */
@RunWith (AndroidJUnit4.class)
public class DaggerTests {

	@Singleton //todo not sure if this has to be Singleton
	@Component (modules = MockModule.class)
	public interface TestComponent extends DemoComponent {
		void inject(DaggerTests mainActivityTest);
	}

	@Inject DataFetcher response;

	@Rule
	public ActivityTestRule<DaggerActivity> activityRule = new ActivityTestRule<>(
			DaggerActivity.class,
			true,     // initialTouchMode
			false);   // launchActivity. False so we can customize the intent per test method

	@Before
	public void setup() {
//		TestComponent component = Dagger
	}





}
