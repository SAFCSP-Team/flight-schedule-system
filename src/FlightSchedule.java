import java.util.ArrayList;

public class FlightSchedule {
    
    public ArrayList<City> cities = new ArrayList<>();

    public int[][] flights = new int[5][5];

    public void addCity(City city) {
        cities.add(city);
    }

    public void addFlight(int from, int to) {
        flights[from][to] = 1;
    }

    public void printFlights() {
        for (int i = 0; i < flights.length; i++) {
            for (int j = 0; j < flights[i].length; j++) {
                if (flights[i][j] == 1) {
                    System.out.println(cities.get(i).name + " -> " + cities.get(j).name);
                }
            }
        }
    }

}
