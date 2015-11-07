package test.nice.testproject.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import test.nice.testproject.DemoApplication;
import test.nice.testproject.R;

/**
 * Single Responsibility:
 *
 * Activity that will bes tested with Dagger 2
 */
public class DaggerActivity extends AppCompatActivity {

	@Inject
	DataFetcher dataFetcher;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dagger);

		setTextView();
	}

	private void setTextView() {

		((DemoApplication) getApplication()).getDependencyInjector().inject(this);

		TextView textView = (TextView) findViewById(R.id.server_response_placeholder);

		String response = dataFetcher.getResponse();
		textView.setText(response);

	}
}
