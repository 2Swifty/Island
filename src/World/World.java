package World;


import Enviroment.Animal;
import Enviroment.Entity;
import Enviroment.Plant;

public class World implements Runnable {
    private final Cell[][] box; // массив для хранения List с животными.

    public World(Cell[][] boxAnimals) { // конструктор принемает и инициализирует boxAnimal.
        this.box = boxAnimals;
    }

    public int getWorldMaxX() {
        return box.length; // вернуть диогональ.
    }

    public int getWorldMaxY() {
        return box[0].length; // вернуть вертикаль.
    }

    public Cell[][] getBox() {
        return box;
    }

    public void kill(Entity obj) {
        box[obj.getX()][obj.getY()].kill(obj);// по текущим координатам вызывается метод kill и передаётся obj.
    }

    public void moveAnimal(Animal animal, int x, int y)  {
        box[animal.getX()][animal.getY()].kill(animal); // убираем животное по старым координатам.
        animal.setX(x); // записываем новую координату x.
        animal.setY(y); // записываем новую координату y.
        box[x][y].bornAnimal(animal); // добавляем animal по новым координатам.
        System.out.println(animal + " перешёл на " + animal.getY() + ", " + animal.getX());
    }

    @Override
    public void run() {
        try {
            step(); // вызываем метод step и обрабатываем в нём исключение.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void step() throws InterruptedException {
        for (int i = 0; i < 15; i++) { // вызываем методы в цикле
            callMove(); // делаем переход
            callEatAnimal(); // едим животных
            callEatPlant(); // едим растиния
            reproduce(); // размножаемся
        }
    }

    private void callMove() {
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) { // с помощью цикла будем обращаться к каждой ячейки массива.
                box[i][j].getListFauna().forEach(animal -> {
                    animal.moveDirection(this);
                    /** с помощью метода getListFauna возвращаем лист, в цикле вызываем
                     * у каждого animal метод moveDirection и передаём в него текущий мир.
                     **/
                });
            }
        }
    }

    private void callEatAnimal() {
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) { // с помощью цикла будем обращаться к каждой ячейки массива
                int finalI = i;
                int finalJ = j;
                box[i][j].getListFauna().forEach(animal -> {
                    box[finalI][finalJ].getListFauna().forEach(animalInteraction -> {
                        /** с помощью метода getListFauna возвращаем лист, в цикле для каждого animal
                         *  возвращаем другого animal из списка.
                         **/
                        if (animal != animalInteraction){ // проверяем что это не один и тот же объект
                            animal.eat(animalInteraction,this); // пробуем съесть с помощью метода eat

                        }
                    });
                });
            }
        }
    }
    private void callEatPlant() {
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) { // с помощью цикла будем обращаться к каждой ячейки массива
                int finalI = i;
                int finalJ = j;
                box[i][j].getListFauna().forEach(animal -> {
                    for (Plant plant : box[finalI][finalJ].getListFlora()) { // циклично возвращаем animal и у каждого животного вызываем метод eatPlant и передаём туда растения, которые мы получаем во внутреннем цикле.
                        animal.eatPlant(plant, this);
                    }
                });

            }
        }
    }

    private void reproduce() {
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) { // с помощью цикла будем обращаться к каждой ячейки массива
                int finalI = i;
                int finalJ = j;
                box[i][j].getListFauna().forEach(animal -> {
                    box[finalI][finalJ].getListFauna().forEach(animalInteraction -> { //с помощью метода getListFauna возвращаем лист, в цикле для каждого animal , возвращаем другого animal из списка
                        if (animal != animalInteraction){ // проверяем что это не один и тот же объект
                            animal.reproducing(animalInteraction);
                        }
                    });
                });
            }
        }
    }
}
