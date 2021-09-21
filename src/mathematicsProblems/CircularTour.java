/**
 * Suppose there is a circle. There are N petrol pumps on that circle. You will be given two sets of data.
 * 1. The amount of petrol that every petrol pump has.
 * 2. Distance from that petrol pump to the next petrol pump.
 * Find a starting point where the truck can start to get through the complete circle without exhausting its petrol in between.
 * Note :  Assume for 1 litre petrol, the truck can go 1 unit of distance.
 *
 * Example 1:
 *
 * Input:
 * N = 4
 * Petrol = 4 6 7 4
 * Distance = 6 5 3 5
 * Output: 1
 * Explanation: There are 4 petrol pumps with
 * amount of petrol and distance to next
 * petrol pump value pairs as {4, 6}, {6, 5},
 * {7, 3} and {4, 5}. The first point from
 * where truck can make a circular tour is
 * 2nd petrol pump. Output in this case is 1
 * (index of 2nd petrol pump).
 */

package mathematicsProblems;
public class CircularTour {
    private static int findStartingPointOfTour(int[] petrol,int[] distance)
    {
        int n = petrol.length;
        int index = 0, total = 0, tank = 0;
        for (int i=0; i<n; i++) {
            int cur = petrol[i] - distance[i];
            tank += cur;
            total += cur;
            if (tank < 0) {
                index = i + 1;
                tank = 0;
            }
        }
        return total >= 0 ? index : -1;

    }
    public static void main(String[] args) {
        int n=4;
        int[] petrol={4,6,7,4};
        int[] distance={6,5,3,5};
        int result=findStartingPointOfTour(petrol,distance);
        System.out.println(result);

    }
}
