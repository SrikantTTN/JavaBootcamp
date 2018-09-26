package Day1.Ex11;

public class ICICI extends Bank {
    int  rateOfInterest = 6;
    String bName = "ICICI";
    String address = "Mumbai";

    @Override
    protected String getDetails(){
        return bName + " has ROI "+ rateOfInterest + " and is located at " + address;
    }

}
