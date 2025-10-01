class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrink=0;
        int emptyBottles=0;
        while (numBottles>0) {
            totalDrink=totalDrink+numBottles;
            emptyBottles=emptyBottles+numBottles;
            numBottles=emptyBottles/numExchange;
            emptyBottles=emptyBottles%numExchange;
        }
        return totalDrink;
    }
}
