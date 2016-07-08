package edu.gatech.unitconvertor;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class TemperatureActivity extends Fragment implements OnClickListener {

	TextView textView;
	EditText editText;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.activity_temperature, container, false);

		view.findViewById(R.id.btnCelisus).setOnClickListener(this);
		view.findViewById(R.id.btnFarenheit).setOnClickListener(this);

		//save widgets to use in onClick event 
		textView = (TextView) view.findViewById(R.id.txtTemperature);
		editText = (EditText) view.findViewById(R.id.editTemperature);

		return view;
	}

	public void onClick(View v) {

		try {
			
			String txtInput = editText.getText().toString();
			if (v.getId() == R.id.btnCelisus) {
				//Convert to celisus
				textView.setText(txtInput + (char)186 + "F = " + 
						UnitConverter.formatDecimal(UnitConverter
								.toCelisus(Double.parseDouble(txtInput))) + (char)186 + "C");
			} else {
				//Convert to fahrenheit
				textView.setText(txtInput + (char)186 + "C = " + 
						UnitConverter.formatDecimal(UnitConverter
								.toFahrenheit(Double.parseDouble(txtInput))) + (char)186 + "F");		
			}

		} catch (NumberFormatException e) {

			textView.setText("Error, Please enter a value to Convert!");

		}

	}

}
