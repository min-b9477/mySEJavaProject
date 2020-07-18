package bokki_9477_SeProject;

//RestaurantAvailability Entity Class
public class RestaurantAvailability extends Restaurant implements ComputeJob, DisplayTypeConverterJob{

    private String timeAvailability;
    private String dateAvailability;
    private String tableAvailability;

    private int numberOfBookedDates = 0;
    private int numberOfBookedTables = 0;

    RestaurantAvailability(String name, String address, String phoneNumber, String tableInfo) {
        super(name, address, phoneNumber, tableInfo);
    }

    public String getTimeAvailability() {
        return timeAvailability;
    }

    public void setTimeAvailability(String hour, String minute) {
        this.timeAvailability = hour + ":" + minute;
    }

    public String getDateAvailability() {
        return dateAvailability;
    }

    public void setDateAvailability(String month, String date, String year) {
        this.dateAvailability = month + "-" + date + "-" + year;
        numberOfBookedDates += 1;
    }

    public String getTableAvailability() {
        return tableAvailability;
    }

    public void setTableAvailability(String tableAvailability) {
        this.tableAvailability = tableAvailability;
        numberOfBookedTables += 1;

    }

    @Override
    public int computeTotalBookedDate() {
        return this.numberOfBookedDates;
    }

    @Override
    public int computeTotalBookedTable() {
        return this.numberOfBookedTables;
    }

    @Override
    public String DateDisplayTypeConverter(String month, String date, String year) {
    	String formattedDate = date + "-" + month + "-" + year;
        return formattedDate;
    }

    @Override
    public String TimeDisplayTypeConverter(String hour, String minute) {
    	
    	return null;
    }

}

