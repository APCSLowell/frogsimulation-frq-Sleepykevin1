public class FrogSimulation
{
    private int goalDistance;
    private int maxHops;
    private int maxHopsHolder; // you MUST declare this!

    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
        maxHopsHolder = numHops; // this line is fine
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
