package complexproblem;

/**
 * Find the minimum cost of traveling between two tram stations in a circular city with N stations numbered from 1 to N.
 * The cost of tickets between adjacent stations is given in an array ticket_cost, where ticket_cost[i] represents
 * the cost of traveling from station i to station (i + 1) % N. Trams can move in both clockwise and anti-clockwise directions.
 * The input includes N, the start station, and the finish station.
 *
 * The output should be the minimum cost of traveling from start to finish station.
 *
 *
 */
public class TramProblem {

    public static void main(String[] args){

        System.out.println(findMinimumTravelCost(5,2,new int[] {1,2,3,4,5,6}));
    }

    public static int findMinimumTravelCost(int destinationStation,int startStation, int[] ticketCost ){

        int result = 0;

        if(destinationStation==startStation)
            return result;
        startStation -- ;
        destinationStation -- ;

        //clockwise calculation
        int currentStation = startStation;
        int clockWiseCost = 0;

        while(destinationStation!=currentStation){
            clockWiseCost = clockWiseCost + ticketCost[currentStation];
            currentStation = (currentStation+1)%ticketCost.length;

        }
        System.out.println("ClockWise: "+clockWiseCost);

        //anticlockwise calculation
        currentStation = startStation;
        int antiClockWiseCost = 0;
        while(destinationStation!=currentStation){
           if(currentStation == 0){
               currentStation = ticketCost.length-1;
           }
           else{
               currentStation--;
           }
           antiClockWiseCost = antiClockWiseCost+ticketCost[currentStation];
        }
        System.out.println("AntiClockWise: "+antiClockWiseCost);

        return Math.min(clockWiseCost,antiClockWiseCost);
    }
}
