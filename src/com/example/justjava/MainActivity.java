package com.example.justjava;

import java.text.NumberFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	// should increase or decrease automatically
	// should not decrease beyond 0
	//should show a thank you message 
	
	int quantity = 1;
	int coffeePrice = 17;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void submitOrder(View view) {
		displayQuantity(quantity); 
		int calculate =  quantity * coffeePrice;
		displayPrice("total:$ " ,  calculate);

	}
	
	public void displayQuantity( int number) {
		TextView quantityTextView = (TextView) findViewById(
				R.id.quantity_text_view);
		quantityTextView.setText(""+ number);
	}
	

	public void displayPrice(String str, int number) {
		TextView priceTextView = (TextView)findViewById(
				R.id.price_text_view);
		priceTextView.setText(str + number);
		//priceTextView.setText("thank you");
	}
	
	public void increment(View view) {
		quantity += 1;
		displayQuantity(quantity);
		  
	}
	
	public void decrement(View view) {
		quantity -= 1;
		displayQuantity(quantity);
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
}
