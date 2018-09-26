package Day1.Ex11;

public class Bank {
    int  rateOfInterest = 5;
    String bName = "Default";
    String address = "Online";

    protected String getDetails(){
        return bName + " has ROI "+ rateOfInterest + " and is located at " + address;
    }
}