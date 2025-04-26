public class FrogSimulation
{
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }

    public boolean simulate()
    { 
        int position = 0;

        for (int hop = 0; hop < maxHops; hop++) {
            position += hopDistance();

            if (position >= goalDistance) {
                return true;
            } else if (position < 0) {
                return false;
            }
        }

        return false;
    }

    public double runSimulations(int num)
    { 
        int successes = 0;

        for (int i = 0; i < num; i++) {
            if (simulate()) {
                successes++;
            }
        }

        return (double) successes / num;
    }
}
