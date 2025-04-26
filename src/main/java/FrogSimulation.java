public class FrogSimulation
{
    private int goalDistance;
    private int maxHops;
    
    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
        maxHopsHolder = numHops;  // ignore this, it's used for testing
    }
    
    public boolean simulate()
    { 
        int total = 0;
        int hops = 0;
        while (hops < maxHops) {
            total += hopDistance();
            hops++;
            if (total < 0)
                return false;
            else if (total >= goalDistance)
                return true;
        }
        return false;
    }
    
    public double runSimulations(int num)
    { 
        int successes = 0;
        for (int i = 0; i < num; i++) {
            if (simulate())
                successes++;
        }
        return (double) successes / num;
    }
}
