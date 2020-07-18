package sampleRestaurantBookingApplication;

public interface DisplayTypeConverterJob {

    String DateDisplayTypeConverter(String month, String date, String year);

    String TimeDisplayTypeConverter(String hour, String minute);
	
}
