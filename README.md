# Flight Schedule System

### Objective
The purpose of this project is to verify the concept of the **Graph data structure**.


### Problem
An Airport company needs a system to manage the flight schedule. The system should be able to **store the cities** and **the relationship between cities** flight departures, and destinations. Finally, the system must be able to represent the flight schedule departure and destination.


### Test Case
``` java
class Main {
    public static void main(String args[]){
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
```
#### Output
```
Riyadh -> Tokyo
Riyadh -> Boston
Tokyo -> Kyoto
Tokyo -> Jeddah
Boston -> Kyoto
Kyoto -> Jeddah
```


### Implementation

1. Create the `City` class.
   * Create an attribute `name` of type `String`
   * Implement a constructor to initialize the `name`.

2. Create the `FlightSchedule` class.
   - **Attributes:**
       * Create an attribute `cities` of type `ArrayList<City>`, then initialize it with `new ArrayList<>();`
       * Create an attribute `flights` which is a two-dimensional array of type integer, then initialize it with the dimension of 5*5.
   - **Methods:**
       * Create a method `addCity` that adds a city to the `cities` list.
       * Create a method `addFlight` which takes two parameters (**from**, and **to**) of type integer, then assign the `flights` 2D Array [from][to] value to **1**.
       * Create a method `displayFlightSchedule` which prints out the `flights`.
    


### Note
> * All the methods in the `FlightSchedule` class are void.
> * The `FlightSchedule` class is actually a `graph` data structure, and the `City` is the vertex of the graph.
> * You're required to `import java.util.ArrayList` to store the cities.



### Qualification to pass
- [ ] The code should run successfully.
- [ ] Completely define the `City` class.
- [ ] Completely define the `FlightSchedule` class.
- [ ] Write all required functions correctly `addCity()` `addFlight()`, and `displayFlightSchedule()`.
- [ ] The output should match the **test case**.
- [ ] Use the **Graph data structure** to solve the problem.

