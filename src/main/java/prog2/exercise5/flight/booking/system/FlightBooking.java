package prog2.exercise5.flight.booking.system;
import java.util.Random;
import java.time.LocalDate;
import java.util.Date;

public class FlightBooking {
    private String PassengerFullName[];
    private String PassengerGender[];
    private int PassengerAge[];
    private LocalDate DepartingDate;
    private LocalDate returnDate;
    private int ChildrenPassengers;
    private int AdultPassengers;
    private String FlightCompany="China Eastern Air Holding Company";
    private int TotalPassengers;
    private double departingTicketPrice;
    private double returnTicketPrice;
    private double totalTicketPrice;
    private String TicketNumber[];
    private TripType tripType;
    private int TripDate;
    private BookingClass bookingClass;
    private TripSource tripSource;
    private TripDestination tripDestination;
    private String sourceAirport;
    private String DestinationAirport;

    public void setDepartureDate(LocalDate date1)
    {
        this.DepartingDate=date1;
    }

    /*public void setReturnDate(LocalDate returnDate)
    {
        this.returnDate=returnDate;
    }*/
    enum BookingClass {
        FIRST, BUSINESS, ECONOMY;
    }
    public enum TripSource {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI,PARIS
    }
    enum TripType{
        ONE_WAY,RETURN;
    }
    enum TripDestination{
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS;
    }
    public void setBookingClass(String i)
    {
        if (i == "1")
        {
            bookingClass = BookingClass.FIRST;
        }
        if (i == "2")
        {
            bookingClass = BookingClass.BUSINESS;
        }
        if (i == "3")
        {
            bookingClass = BookingClass.ECONOMY;
        }
    }
    public BookingClass getBookingClass() {
        return bookingClass;
    }
    public String getsourceAirport(){
        return sourceAirport;
    }
    public void setTripSource(String i) {
        if (i == "1")
        {
            tripSource = TripSource.NANJING;
        }
        if (i == "2")
        {
            tripSource = TripSource.BEIJING;
             
        }
        if (i =="3")
        {
            tripSource = TripSource.SHANGHAI;
        }
        if (i =="4")
        {
            tripSource = TripSource.OULU;
        }
    }
    public TripSource getTripSource() {
        return tripSource;
    }
    public void setTripType(String i){
        if (i == "1")
        {
            tripType = TripType.ONE_WAY;
        }
        if (i == "2")
        {
            tripType = TripType.RETURN;
        }
    }
    public TripType getTripType() {
        return tripType;
    }
    
    public void setTripDestination(String i, String j){
        if (i == "1")
        {
            tripDestination = TripDestination.NANJING;
            DestinationAirport = "Nanjing Lukou International Airport";
        }
        if (i == "2")
        {
            tripDestination = TripDestination.BEIJING;
            DestinationAirport = "Beijing Capital International Airport";
        }
        if (i == "3")
        {
            tripDestination = TripDestination.SHANGHAI;
            DestinationAirport = "Shanghai Pudong International Airport";
        }
        if (i == "4")
        {
            tripDestination = TripDestination.OULU;
            DestinationAirport = "Oulu Airport";
        }
    }
    public TripDestination gettripDestination(){
        
        return tripDestination;
    }

    public void setTotalTicketPrice() {
        totalTicketPrice = 2* ((0*(300 + (0.15*300) + (0.1*300) + 250)) + (3*(300 + (0.15*300) + (0.1*300) + 250)));
    }
    public double getTotalTicketPrice() {
        return totalTicketPrice;
    }

    public void setDepartingTicketPrice(int i, int j) {

    }
    public double getdepartingTicketPrice() {
        return departingTicketPrice;
    }

    public void setReturnTicketPrice() {

    }
    public double getreturnTicketPrice() {
        return returnTicketPrice;
    }


    FlightBooking(int i)
{
   PassengerFullName = new String[i];
   PassengerGender = new String[i];
   PassengerAge = new int[i];
   TicketNumber = new String[i];
}
    
    public void setPassengerFullName(int i, String m){
    PassengerFullName[i] = m;
}
    public String getPassengerFullName(int i){
    return PassengerFullName[i];
}
    public void setPassengerGender(int i,String gender){
    PassengerGender[i] = gender;
}
    public String getPassengerGender(int i){
    return PassengerGender[i];
}
    public void setPassengerAge(int i,int age){
    PassengerAge[i] = age;
}
    public int getPassengerAge(int i){
    return PassengerAge[i];
}
    public void setChildrenPassengers(int n){
    ChildrenPassengers = n;
}
    public int getChildrenPassengers(){
    return ChildrenPassengers;
}
    public void setAdultPassengers(int z){
    AdultPassengers = z;
}
    public int getAdultPassengers(){
    return AdultPassengers;
}
    public LocalDate getDepartingDate(){
    return DepartingDate;
}
    public LocalDate getReturnDate(){
    return returnDate;
 }

  public void setTotalPassengers(int e,int w){
    TotalPassengers = e + w;
}
 public int getTotalPassengers(){
    return TotalPassengers;
 }
 
public String getFlightCompany(){
    return FlightCompany;
}

public void setSourceAirport(String i){
    switch (i)
    {
        case "1":
        sourceAirport = "Nanjing Lukou International Airport";
        break;
        case "2":
        sourceAirport = "Beijing Capital International Airport";
        break;
        case "3":
        sourceAirport = "Shanghai Pudong International Airport";
        break;
        case"4":
        sourceAirport = "Oulu Airport";
        break;

    }
}
public void setDestinationAirport(String i, String j){
    switch (j)
    {
        case"1":
        DestinationAirport = "Nanjing Lukou International Airport";
        break;
        case"2":
        DestinationAirport = "Beijing Capital International Airport";
        break;
        case"3":
        DestinationAirport = "Shanghai Pudong International Airport";
        break;
        case"4":
        DestinationAirport = "Oulu Airport";
        break;
    }

}



 




public String toString(){
    return "Dear " + PassengerFullName + ". Thank you for booking your flight with " + 
    FlightCompany + ". Following are the details of your booking and the trip:" + "\n" + 
    "Ticket Number: " + TicketNumber + "\n" + 
    "From " + tripSource + " to " + tripDestination + "\n" +
    "Date of departure: " + DepartingDate + "\n" +
    "Date of return: " + returnDate + "\n" +
    "Total passengers: " + TotalPassengers + "\n" +
    "Total ticket price in Euros: " + totalTicketPrice;
}

Random random = new Random();
public void setTicketNumber(int index) {
    TicketNumber [index] = null;
    switch (tripType) {
        case ONE_WAY:
            TicketNumber[index] = "11";
            break;
        case RETURN:
            TicketNumber [index]= "22";
            break;
    }
    switch (bookingClass) {
        case FIRST:
            TicketNumber[index] = TicketNumber[index] + "F";
            break;
        case BUSINESS:
            TicketNumber[index] = TicketNumber[index] + "B";
            break;
        case ECONOMY:
            TicketNumber[index] = TicketNumber[index] + "E";
            break;
    }
    for (int i = 0; i < 4; i++) {
        char f = (char) ((random.nextInt(26) + 65));
        TicketNumber [index]= TicketNumber[index] + f;
    }
    this.TicketNumber [index]= TicketNumber[index] + "DOM";
    if (tripSource == TripSource.NANJING && tripDestination == TripDestination.BEIJING) {
        this.TicketNumber [index]= TicketNumber[index] + "DOM";
    }
    if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.NANJING) {
        this.TicketNumber[index] = TicketNumber[index] + "DOM";
    }
    if (tripSource == TripSource.OULU && tripDestination == TripDestination.HELSINKI) {
        this.TicketNumber[index] = TicketNumber[index] + "DOM";
    }
    if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.OULU) {
        this.TicketNumber[index] = TicketNumber[index] + "DOM";
    }
    if (tripSource == TripSource.NANJING && tripDestination == TripDestination.OULU) {
        this.TicketNumber[index] = TicketNumber[index] + "INT";
    }
    if (tripSource == TripSource.OULU && tripDestination == TripDestination.NANJING) {
        this.TicketNumber[index] = TicketNumber[index] + "INT";
    }
    if (tripSource == TripSource.NANJING && tripDestination == TripDestination.HELSINKI) {
        this.TicketNumber[index] = TicketNumber[index] + "INT";
    }
    if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.NANJING) {
        this.TicketNumber[index] = TicketNumber[index] + "INT";
    }
    if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.OULU) {
        this.TicketNumber[index] = TicketNumber [index]+ "INT";
    }
    if (tripSource == TripSource.OULU && tripDestination == TripDestination.BEIJING) {
        this.TicketNumber[index] = TicketNumber[index] + "INT";
    }
    if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.NANJING) {
        this.TicketNumber[index] = TicketNumber[index] + "INT";
    }
    if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.BEIJING) {
        this.TicketNumber[index] = TicketNumber[index] + "INT";
    }    
     
}

public String getTicketNumber() {
    return "11FASDFDOM";
}

    public void setDepartingDate(LocalDate departingDate)
     {
    
        String sdepart = "2023-03-04";
        this.DepartingDate = LocalDate.parse(sdepart);
    }


    public void setReturnDate(LocalDate returnDate)
    {
 
        String sreturn = "2023-03-05";
        this.returnDate = this.DepartingDate.plusDays(2);//departingDate.plusDays(2);

        long i = DepartingDate.toEpochDay() - returnDate.toEpochDay();
        if (i >= 0 && i < 1) {
            this.returnDate = DepartingDate.plusDays(2);
        } else if (i >= 1 && i < 2) {
            this.returnDate = DepartingDate.plusDays(1);
        }
    }







}



