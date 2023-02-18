package ch04;
/*
* 다형성 이란?
* 하나의 코드가 여러 자료형으로 구현되어 실행 되는 것
* 같은 코드에서 여러 다른 실행 결과가 나옴
* */

import java.util.ArrayList;

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal{
    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }
    public void readBook(){
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal{
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Egle extends Animal{
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아 다닙니다.");
    }

    public void flying() {
        System.out.println("독수리가 양 날개를 쭉 펴고 하늘을 날아 다닙니다.");
    }
}


public class Polymorphism {

    public static void main(String[] args) {
        Animal human = new Human();
        Animal tiger = new Tiger();
        Animal egle = new Egle();

        Polymorphism test = new Polymorphism();
//        test.moveAnimal(human);
//        test.moveAnimal(tiger);
//        test.moveAnimal(egle);

        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(human);
        animalArrayList.add(tiger);
        animalArrayList.add(egle);


        for (Animal animal : animalArrayList){
            animal.move();
        }

        test.testDownCasting(animalArrayList);




    }

    public void testDownCasting(ArrayList<Animal> list){
        for (int i=0; i< list.size(); i++){
            Animal animal = list.get(i);
            if (animal instanceof Human){
                Human human = (Human) animal;
                human.readBook();
            }
            else if (animal instanceof Tiger){
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            }
            else if (animal instanceof Egle){
                Egle egle = (Egle) animal;
                egle.flying();
            }
            else{
                System.out.println("undefined error");
            }
        }
    }

    public void moveAnimal(Animal animal){
        animal.move();
    }



}
