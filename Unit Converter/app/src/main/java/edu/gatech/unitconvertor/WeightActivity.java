package edu.gatech.unitconvertor;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

public class WeightActivity extends Fragment implements OnClickListener {

	TextView textView;
	EditText editText;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.activity_weight, container, false);

		view.findViewById(R.id.btnPounds).setOnClickListener(this);
		view.findViewById(R.id.btnKilograms).setOnClickListener(this);

		// save widgets to use in onClick event
		textView = (TextView) view.findViewById(R.id.txtWeight);
		editText = (EditText) view.findViewById(R.id.editWeight);

		return view;
	}

	public void onClick(View v) {

		try {

			String txtInput = editText.getText().toString();

			if (v.getId() == R.id.btnPounds) {
				//Convert to pounds
				textView.setText(txtInput + "kg = " + 
						UnitConverter.formatDecimal(UnitConverter
								.toPounds(Double.parseDouble(txtInput))) + "lb");
			} else {
				//Convert to kilograms
				textView.setText(txtInput + "lb = " + 
						UnitConverter.formatDecimal(UnitConverter
								.toKilograms(Double.parseDouble(txtInput))) + "kg");		
			}

		} catch (NumberFormatException e) {

			textView.setText("Error, Please enter a value to Convert!");

		}

	}
}
