package Day1.Ex11;

public class BOI extends Bank {
    Bank k = new Bank();
    int rateOfInterest = 5;
    String bName = "Bank Of India";
    String address = "Delhi";

    @Override
    protected String getDetails() {
        return bName + " has ROI " + rateOfInterest + " and is located at " + address;
    }

}