public class theatre {
    private  IntegerSet seatsRemaining;
    private IntegerSet occupiedSeats;
    private IntegerSet aisleSeats;
    private int totalRows;

    theatre(int totalseats, int[] firstRowAisleSeats, int rows){
        seatsRemaining = new  IntegerSet();
        occupiedSeats = new IntegerSet();
        aisleSeats = new IntegerSet();
        for(int i = 0; i< totalseats;i++){
            seatsRemaining.insert(i + 1);
        }
        for(Integer n : firstRowAisleSeats){
            aisleSeats.insert(n);

        }
        totalRows = rows;

    }
    // Default
    theatre(){
        seatsRemaining = new  IntegerSet();
        occupiedSeats = new IntegerSet();
        aisleSeats = new IntegerSet();
        for(int i = 0; i< 120;i++){
            seatsRemaining.insert(i + 1);
        }
        totalRows = 10;

    }
    //Requires : integer, seat number
    //Modifies; this
    //Effects: if the seat is remaining remove seat from  IntegerSet and  add it to  occuipied
    //integerset. Else do nothing



    public void purchaseSeat(Integer seatNum){

    }
    //Effects: returns the remaining seats in the theatre

    public IntegerSet getSeatsRemaining(){
        return  seatsRemaining;
    }
    //Requires; integer, seatnum
    //Effects; returns  true if seat is on an aisle, else returns false

    public boolean isAisle(Integer seatNum){
        return false;
    }

    //requires: integer, seatnumber
    //effects; returns true if seat is purchased, else return false
    public boolean isPurchased(Integer num){
        return false;
    }
    //effects: returns number of  remaining seats

    public int getSize(){
        return 0;
    }

}

