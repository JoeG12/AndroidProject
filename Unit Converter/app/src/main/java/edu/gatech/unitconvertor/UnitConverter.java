package edu.gatech.unitconvertor;

import java.text.DecimalFormat;

public class UnitConverter {

	public static Double toCelisus(Double dbl) {

		return (dbl - 32.0f) * (5.0f / 9.0f);

	}

	public static Double toFahrenheit(Double dbl) {

		return (dbl * (9.0f / 5.0f)) + 32.0f;

	}

	public static Double toPounds(Double dbl) {

		return (dbl / 2.2046);

	}

	public static Double toKilograms(Double dbl) {

		return (dbl * 2.2046);

	}

	public static Double toMiles(Double dbl) {

		return (dbl * 0.62137);

	}

	public static Double toKilometers(Double dbl) {

		return (dbl / 0.62137);

	}

	public static String formatDecimal(Double dbl) {

		return Double.valueOf(new DecimalFormat("#.##").format(dbl)).toString();

	}

}
