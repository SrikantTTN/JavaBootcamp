package Ex11;

public class SBI extends Bank {
    int  rateOfInterest = 7;
    String bName = "State Bank Of India";
    String address = "Bangalore";

    @Override
    protected String getDetails(){
        return bName + " has ROI "+ rateOfInterest + " and is located at " + address;
    }

}