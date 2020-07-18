package bokki_9477_SeProject;

public class Restaurant {

    private int restaurantId;
    private String name;
    private String address;
    private String phoneNumber;
    private String tableInfo;
    private String menuInfo;

    Restaurant(String name, String address, String phoneNumber, String tableInfo) {
        this.restaurantId = 1;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.tableInfo = tableInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTableInfo() {
        return tableInfo;
    }

    public void setTableInfo(String tableInfo) {
        this.tableInfo = tableInfo;
    }

    public void setMenuInfo(String menuInfo) {
        this.menuInfo = menuInfo;
    }

    public String displayTableInfo() {

        String tableInfo;
        tableInfo = "Table info: " + this.tableInfo;

        return (tableInfo);
    }

    public String displayMenuInfo() {
        String menuInfo;
        menuInfo = "Menu info: " + this.menuInfo;

        return menuInfo;
    }

    public String displayRestaurantInfo() {
        String restaurantInfo;
        restaurantInfo = "Restaurant name: " + this.name + "\nRestaurant address: " + this.address + "Restaurant phone number: " + this.phoneNumber;

        return restaurantInfo;
    }
}

