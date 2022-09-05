package Enviroment;

import java.util.Random;

public class Plants extends Plant {
    private final Random random = new Random();

    public Plants(int x, int y) {
        super(x, y);
    }

    @Override
    public int getWeight() {
        return 1;
    }

    @Override
    protected void grow() {
        new Plants(random.nextInt(100), random.nextInt(20));
    }
}
