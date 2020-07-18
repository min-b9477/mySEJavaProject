package sampleRestaurantBookingApplication;

//User entity class
public class User {
    private int userID;
    private String name;
    private String address;
    private String EmailAddress;
    private String paymentInformation;
    private String loginID;
    private String password;

    public User(String name, String address, String emailAddress, String paymentInformation, String loginID, String password){
        this.userID = 1;
        this.name = name;
        this.address = address;
        this.EmailAddress = emailAddress;
        this.paymentInformation = paymentInformation;
        this.loginID = loginID;
        this.password = password;
    }


    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getPaymentInformation() {
        return paymentInformation;
    }

    public void setPaymentInformation(String paymentInformation) {
        this.paymentInformation = paymentInformation;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

