package edu.simmons.cs330sp14.cs330_calc;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

	
/**Code for the calculator**/
	
	/** Called when the user clicks the a button */
	public void putText(View view){
		//put string on button into text field
		Button b = (Button)view;
	    String buttonText = b.getText().toString();
		TextView t=new TextView(this);
	    t=(TextView)findViewById(R.id.display_calc); 
	    t.setText(t.getText().toString()+buttonText);
	}
	
	public void clear(View view) {
	    // Do something in response to button
	    TextView t=new TextView(this); 
	    t=(TextView)findViewById(R.id.display_calc); 
	    t.setText("");
	}
	
	public void add (View view){
		
		
		TextView t=new TextView(this); 
	    t=(TextView)findViewById(R.id.display_calc);
	    String viewText= t.getText().toString();
	    float num1=(Float.valueOf(viewText).floatValue());
	    t.setText("");
	    String viewText2= t.getText().toString();
	    float num2=(Float.valueOf(viewText2)).floatValue();
	    float answer= num1+num2;
	    t.setText(String.valueOf(answer));
	    
	    
	    
	    
		
		
	
	}

}
