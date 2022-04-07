package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        boolean ageException = false;


        while (true) {
            try {
                if (!ageException) {
                    System.out.println("введите имя;");
                    String name = scanner.next();
                    user.setName(name);
                    System.out.println(" ваше имя;" + user.getName());
                }
                System.out.println("выведите возразт  ;");
                Integer age = scanner.nextInt();
                user.setAge(age);
                System.out.println("ваш возразт "+user.getAge());
                ageException = false;


            } catch (IllegalNameLengthException illegalNameLengthException) {
                System.out.println(illegalNameLengthException.getMessage());
            }catch (IllegalAgeException illegalAgeException){
                System.out.println(illegalAgeException.getMessage());
                ageException = true;
            }

        }
    }
}
