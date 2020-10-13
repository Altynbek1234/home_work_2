package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        age_and_temp(generateRandomAge(),10);
        age_and_temp(generateRandomAge(),200);
        age_and_temp(generateRandomAge(),-10);
        age_and_temp(generateRandomAge(),0);
        age_and_temp(generateRandomAge(),3);
        age_and_temp(generateRandomAge(),7);
        //System.out.println(Math.round(Math.random() * 10));
      //  Random rand = new Random();
        //System.out.println(rand.nextInt(100));
       // System.out.println(generateRandomAge());
       // age_and_temp(generateRandomAge());

        generateRandomAge();

    }

    public static void age_and_temp(int age, int temp) {

        //System.out.println(age);
        //System.out.println(temp);
        if ((generateRandomAge() >= 20 && generateRandomAge() <= 45) && (temp > -20 && temp < 30)) {
            System.out.println("можно идти гулять");
        }
        else if (age < 20 && (temp >= 0 && temp < 28)){
            System.out.println("можно идти гулять");
        }
        else if (age > 45 && (temp < -10 && temp == 20)){
            System.out.println("можно идти гулять");
        }
        else {
            System.out.println("остовайтесь дома");
        }

    }
    public static int generateRandomAge(){
        Random rand = new Random();
        //System.out.println(rand.nextInt(100));
        return  rand.nextInt(100);

    }
}
