package Enviroment;

import World.World;

public abstract class Entity {



    public abstract int getWeight();
    // каждая сущность умеет возвращать свой вес

    private int x;
    private int y;
    public Entity(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setY(int y) { // поменять y
        this.y = y;
    }

    public void setX(int x) { // поменять x
        this.x = x;
    }

    public int getY() { // вернуть y
        return y;
    }

    public int getX() { // вернуть x
        return x;
    }


    //каждая сущность должна уметь хранить в себе координаты и возвращать их

    public void die(World world) {
        world.kill(this);
    }
    //каждая сущность должна иметь возможность умирать


}
