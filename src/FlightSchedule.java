import java.util.ArrayList;
class FlightSchedule {
    Vertex v;
    static ArrayList<Vertex>cities = new ArrayList<>();
    public int size; 
    public static int flight[][];
    public FlightSchedule (){
        this.size = 5;
        flight = new int[5][5];
    }

    public static void addFlight(int source, int dest){
        flight[source][dest] =1;
    }

    
    public static void addCity(City v){
        cities.add(new Vertex(v));
    }

    public void printFlights(){

        for(int x = 0; x < this.size; x++){
            for(int y = 0; y < this.size; y++){
                if(flight[x][y] == 1){
                 System.out.println(cities.get(x).data.city + " -> "+ cities.get(y).data.city);

                }
                 
            }
    }}}