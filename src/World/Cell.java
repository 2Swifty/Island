package World;

import Enviroment.Animal;
import Enviroment.Entity;
import Enviroment.Plant;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    ArrayList<Animal> listAnimal = new ArrayList<>();
    ArrayList<Plant> listPlant = new ArrayList<>();


    public void bornAnimal(Animal animal) {
        listAnimal.add(animal); // добавляем переданный объект в лист
    }

    public void bornPlant(Plant plant) {
        listPlant.add(plant); // добавляем переданный объект в лист
    }

    public void kill(Entity obj) {
        if (obj instanceof Animal) {
            listAnimal.remove(obj);// удаляем переданный объект из листа
        } else {
            listPlant.remove(obj);
        }
    }

    public List<Animal> getListFauna() {
        return List.copyOf(listAnimal);
    }

    public List<Plant> getListFlora() {
        return List.copyOf(listPlant);
    }
}
