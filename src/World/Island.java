package World;

import Enviroment.*;
import Enviroment.Animals.Herbs.*;
import Enviroment.Animals.Predators.*;

public class Island {
    public Cell[][] createWorld(int x, int y) {
        Cell[][] boxAnimals = new Cell[x][y]; // создаём массив и передаём в него x,y
        addAnimalsToList(boxAnimals); // заполняем массив листами с животными
        System.out.println("Создался мир!! ");
        return boxAnimals; // создаём мир и передаём в конструктор массив
    }



    private Cell createAnimal(int x , int y) {
        Cell cell = new Cell();
        for (int i=0 ; i < 10;i++){
            cell.bornAnimal(new Bear(x,y,Animal.Gender.MALE));
            cell.bornAnimal(new Boa(x,y,Animal.Gender.MALE));
            cell.bornAnimal(new Buffalo(x,y,Animal.Gender.MALE));
            cell.bornAnimal(new Catterpillar(x,y,Animal.Gender.MALE));
            cell.bornAnimal(new Deer(x,y,Animal.Gender.MALE));
            cell.bornAnimal(new Duck(x,y,Animal.Gender.MALE));
            cell.bornAnimal(new Horse(x,y,Animal.Gender.MALE));
            cell.bornAnimal(new Eagle(x,y,Animal.Gender.MALE));
            cell.bornAnimal(new Fox(x,y,Animal.Gender.MALE));
            cell.bornAnimal(new Goat(x,y,Animal.Gender.MALE));
            cell.bornAnimal(new Bear(x,y,Animal.Gender.MALE));
            cell.bornAnimal(new Snake(x,y,Animal.Gender.MALE));

            cell.bornAnimal(new Bear(x, y, Animal.Gender.FEMALE));
            cell.bornAnimal(new Boa(x, y, Animal.Gender.FEMALE));
            cell.bornAnimal(new Buffalo(x, y, Animal.Gender.FEMALE));
            cell.bornAnimal(new Catterpillar(x, y, Animal.Gender.FEMALE));
            cell.bornAnimal(new Deer(x, y, Animal.Gender.FEMALE));
            cell.bornAnimal(new Duck(x, y, Animal.Gender.FEMALE));
            cell.bornAnimal(new Horse(x, y, Animal.Gender.FEMALE));
            cell.bornAnimal(new Mouse(x, y, Animal.Gender.FEMALE));
            cell.bornAnimal(new Rabbit(x, y, Animal.Gender.FEMALE));
            cell.bornAnimal(new Sheep(x, y, Animal.Gender.FEMALE));
            cell.bornAnimal(new Wolf(x, y, Animal.Gender.FEMALE));
            cell.bornAnimal(new Snake(x, y, Animal.Gender.FEMALE));





        }
        for (int i = 0; i < 15; i++) {
            cell.bornPlant(new Plants(x,y));
        }
    return cell;
    }

    private Cell[][] addAnimalsToList(Cell[][] array) { // метод возвращает массив
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = createAnimal(i,j);
                System.out.println(array[i][j]);
            }
        }
        return array;
    }



}
