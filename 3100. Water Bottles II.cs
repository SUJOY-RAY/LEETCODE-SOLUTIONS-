// public class Solution {
//     public int MaxBottlesDrunk(int numBottles, int numExchange) {
//         int totalDrunk  = 0;
//         int empty = 0;
//         while(numBottles > 0) {
//             totalDrunk += numBottles;
//             empty += numBottles;
//             numBottles = 0;

//             while(empty >= numExchange){
//                 empty -= numExchange;
//                 numBottles += 1;
//                 numExchange++;
//             }
//         }
//         return totalDrunk;
//     }
// }

// // Slow iterative method
// public class Solution {
//     public int MaxBottlesDrunk(int numBottles, int numExchange) {
//         int drinkable = 0;
//         int empty = 0;

//         while (numBottles > 0) {
//             drinkable++;
//             numBottles--;
//             empty++;

//             while (empty >= numExchange) {
//                 numBottles++;
//                 empty -= numExchange;
//                 numExchange++;
//             }
//         }

//         return drinkable;
//     }

//Algorithmmic approach
public class Solution {
    public int MaxBottlesDrunk(int numBottles, int numExchange) {
        int drunk = numBottles;
        while(numBottles >= numExchange){
            numBottles = numBottles - numExchange + 1;
            drunk++;
            numExchange++;
        }
        return drunk;
    }
}

