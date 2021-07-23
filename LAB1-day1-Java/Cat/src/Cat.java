

import java.util.Scanner;

public class Cat {

    private String name;
    private int age;
    private char gender;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
        this.name = "Кот";
        this.age = 10;
    }

    public static void main(String[] args) {
        System.out.println("Hello!");

        Cat myCat = new Cat("Повидло");
        System.out.println(myCat.name);

        /* myCat.setName("Повидло");
        String name = myCat.getName();
        System.out.println(name); */

        myCat.consoleNameInput();
        myCat.consoleNameOutput();

        myCat.consoleAgeInput();
        myCat.consoleAgeOutput();

        myCat.consoleDataOutput();

        myCat.consoleStateOutput();

        myCat.chackKnowledge();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void consoleNameInput (){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        this.name = str;
    }


    public void consoleNameOutput (){
        System.out.println(this.name);
    }

    public void consoleAgeOutput (){
        System.out.println(this.age);
    }

    public void consoleAgeInput (){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        try{
            this.age = Integer.parseInt(str);
        }catch (NumberFormatException e) {
            System.out.println("Ожидалось число, в введена строка" + " " + str);
        }
    }

    public void consoleDataOutput (){
        System.out.println(this.name + " " + this.age);
    }

    public void consoleStateOutput () {
        String state = "";


        if (this.age <= 1 ){
            state = "Котенок";
        } else if (this.age > 2 && this.age <= 5 ){
            state = "Молодой кот";
        } else if (this.age >= 6 && this.age < 13) {
            state = "Пожилой кот";
        }
        System.out.println("Наш кот:" + state);
    }

    public void chackKnowledge () {
        System.out.println("Введите команду: ");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        boolean isKnow = false;
        switch (str){
            case "Сидеть": isKnow = true; break;
            case "Тапки": isKnow = true; break;
            case "фу": isKnow = true; break;

        }
        if (isKnow){
            System.out.println(this.name + " знает такую команду");
        } else {
            System.out.println(this.name + " не знает такую команду");
        }
    }
}

