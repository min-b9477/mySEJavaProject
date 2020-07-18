package bokki_9477_SeProject;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String userInfo,restaurantInfo, restaurantAvailabilityInfo, tableAvailability;
	    String month, date, year;
	    String hour, minute;
	    
	    //Creating user1 object
        User user1 = new User("Bokki", "123 st", "bmin1@student.douglascollege.ca", "VISA 12312312312", "bmin1", "1234");
        
        //Creating restaurant1 object
        Restaurant restaurant1 = new Restaurant("Sushi Restaurant", "456 St", "232-2323-2323", "7 tables");
        
        //Creating restaurantAvailability object
        RestaurantAvailability restaurant1Availability = new RestaurantAvailability(restaurant1.getName(), restaurant1.getAddress(), restaurant1.getPhoneNumber(), restaurant1.getTableInfo());
        
        //Setup available date
    
        month = "01";
        date = "20";
        year = "2020";
        
        //Setup available time
        hour = "10";
        minute ="30";
        tableAvailability = "Table 1 is available";
        
        
        //RestaurantAvailbility set data
        restaurant1Availability.setDateAvailability(month, date, year);
        restaurant1Availability.setTimeAvailability(hour, minute);
        restaurant1Availability.setTableAvailability(tableAvailability);
        
        //User info string
        userInfo = "User name: " + user1.getName() + "\nUser address: " + user1.getAddress() + "\nUser Email address: " + user1.getEmailAddress();
        
        //Restaurant info string
        restaurantInfo = "\nRestaurant name: " + restaurant1.getName() + "\nRestaurant address: " + restaurant1.getAddress() + "\nRestaurant phone number: " + restaurant1.getPhoneNumber() + "\nRestaurant available table: " + restaurant1.getTableInfo();
        
        //Restaurant Availability info string
        restaurantAvailabilityInfo = "\nRestaurant available Date: " + restaurant1Availability.DateDisplayTypeConverter(month, date, year) + "\nRestaurant available time: " +
        restaurant1Availability.getTimeAvailability() + "\nRestaurant available table: " + restaurant1Availability.getTableAvailability();
        
        //Displaying output
        System.out.println(userInfo);
        System.out.println(restaurantInfo);
        System.out.println(restaurantAvailabilityInfo);

	}

}
