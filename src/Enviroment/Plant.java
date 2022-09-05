package Enviroment;

public abstract class Plant extends Entity {

    public Plant(int x, int y) {
        super(x, y);
    }

    @Override
    public int getWeight() {
        return 1;
    }

    protected abstract void grow();
}
