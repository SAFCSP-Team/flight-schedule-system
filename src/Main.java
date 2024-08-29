class Main {
    public static void main(String args[]){
        FlightSchedule flightSchedule = new FlightSchedule();

        flightSchedule.addCity(new City("Riyadh"));
        flightSchedule.addCity(new City("Toktyo"));
        flightSchedule.addCity(new City("Boston"));
        flightSchedule.addCity(new City("Kyoto"));
        flightSchedule.addCity(new City("Jeddah"));

        flightSchedule.addFlight(0, 1);
        flightSchedule.addFlight(0, 2);
        flightSchedule.addFlight(1, 3);
        flightSchedule.addFlight(1, 4);
        flightSchedule.addFlight(2, 3);
        flightSchedule.addFlight(3, 4);

        flightSchedule.printFlights();
    }

}