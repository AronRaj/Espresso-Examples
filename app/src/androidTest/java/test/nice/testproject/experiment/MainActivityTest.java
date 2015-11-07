package test.nice.testproject.experiment;

import android.app.Instrumentation;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;
import test.nice.testproject.DemoApplication;
import test.nice.testproject.activities.MainActivity;
import test.nice.testproject.dagger.DemoComponent;


@RunWith (AndroidJUnit4.class)
public class MainActivityTest {
	@Inject
	Clock clock;

	@Singleton
	@Component (modules = MockClockModule.class)
	public interface TestComponent extends DemoComponent {
		void inject(MainActivityTest mainActivityTest);
	}

	@Rule
	public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(
			MainActivity.class,
			true,     // initialTouchMode
			false);   // launchActivity. False so we can customize the intent per test method

	@Before
	public void setUp() {
		Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
		DemoApplication app
				= (DemoApplication) instrumentation.getTargetContext().getApplicationContext();
//		TestComponent component = DaggerMainActivityTest_TestComponent.builder()
//				.mockClockModule(new MockClockModule())
//				.build();
//		app.setComponent(component);
//		component.inject(this);
	}

	@Test
	public void today() {
//		Mockito.when(clock.getNow()).thenReturn(new DateTime(2008, 9, 23, 0, 0, 0));
//
//		activityRule.launchActivity(new Intent());
//
//		onView(withId(R.id.date))
//				.check(matches(withText("2008-09-23")));
	}

	@Test
	public void intent() {
//		DateTime dateTime = new DateTime(2014, 10, 15, 0, 0, 0);
//		Intent intent = new Intent();
//		intent.putExtra(MainActivity.KEY_MILLIS, dateTime.getMillis());
//
//		activityRule.launchActivity(intent);
//
//		onView(withId(R.id.date))
//				.check(matches(withText("2014-10-15")));
	}

}