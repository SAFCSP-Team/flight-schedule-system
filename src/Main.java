import java.util.ArrayList;
public class FlightSchedule {
    private ArrayList<City> cities = new ArrayList<>();
    private int[][] flights = new int[5][5];

    public void addCity(City city) {
        cities.add(city);
    }

    public void addFlight(int from, int to) {
        flights[from][to] = 1;
    }
    public void printFlights() {
        for (int from = 0; from < cities.size(); from++) {
            for (int to = 0; to < cities.size(); to++) {
                if (flights[from][to] == 1) {
                    System.out.println(cities.get(from).name + " -> " + cities.get(to).name);
                }
             } 
        }
    }
}
public class Main {
    public static void main(String[] args) {
        FlightSchedule flightSchedule = new FlightSchedule();

        flightSchedule.addCity(new City("Riyadh"));
        flightSchedule.addCity(new City("Tokyo"));
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
