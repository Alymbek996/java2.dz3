package com.company;

public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameLengthException {
        if (name.length()>20){
            throw new IllegalNameLengthException( "длина имени не может быть болше 20 символов вы задали"+ name);

        }
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age <= 0|| age>100) {
            throw new IllegalAgeException("возразт человека не должно быть больше 100 вы задали"+ age);

        }
        this.age = age;

    }
}
