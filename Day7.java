//How many full water bottles
class Day7 {
    public int numWaterBottles(int numBottles, int numExchange) {
        // int count=0;
        int full=numBottles,empty=numBottles,count=full;
        while(full!=0 || empty>=numExchange)
        {
            full=empty/numExchange;
            empty=empty%numExchange;
            empty+=full;
            count+=full;
        }
        return count;
    }
}
