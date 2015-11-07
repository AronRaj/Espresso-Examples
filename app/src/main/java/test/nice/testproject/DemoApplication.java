package test.nice.testproject;

import android.app.Application;
import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Component;
import test.nice.testproject.dagger.DataFetcherModule;
import test.nice.testproject.dagger.DemoComponent;

public class DemoApplication extends Application {

	@Singleton
	@Component (modules = DataFetcherModule.class)
	public interface ApplicationComponent extends DemoComponent {
	}

	private DemoComponent component;

	@Override
	public void onCreate() {
		super.onCreate();

		setupDependencyInjection();
	}

	private void setupDependencyInjection() {
		component = DaggerDemoApplication_ApplicationComponent
				.builder()
				.dataFetcherModule(new DataFetcherModule())
				.build();
	}

	public void setComponent(DemoComponent component) {
		this.component = component;
	}

	@NonNull
	public DemoComponent getDependencyInjector() {
		return component;
	}

}
