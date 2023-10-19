package com.xworkz.crud.things.mentor;

import com.xworkz.crud.things.Trainee;

public class Mentor {
    Trainee[] trainee;

    public Mentor(int size) {
        trainee = new Trainee[size];
    }
    int index;
    int id;

    public void addName(String name) {
        System.out.println(" add the addName method");
        System.out.println("the name is " + name);

        if (index < trainee.length) {
            trainee[index] = name;

            System.out.println("the array index is less than array size");
            System.out.println("the name is stored in the traineename array is " + index);

            index += 1;
            System.out.println("index value is " + index);
        } else {
            System.out.println("the array is full");
        }
    }

    public void updateName(String oldValue, String newValue) {
        System.out.println("this is update method");
        System.out.println("the old value" + oldValue + " " + "new value " + newValue);
        boolean isfound = false;

        for (int i = 0; i < trainee.length; i++) {
            System.out.println("the update " + trainee[i]);

            if (trainee[i] == oldValue) {
                trainee[i] = newValue;
                System.out.println("the name updated successfully" + trainee[i]);
            } else {
                System.out.println("the name not updated");
            }
        }
        isfound = true;
    }


    public void onDelete(String name) {
        System.out.println(" this is delete method ");
        System.out.println("name for delete: " + name);
        boolean isDelete = false;
        for (int i = 0; i < trainee.length; i++) {
            if (trainee[i] == name) {
                trainee[i] = null;
                isDelete = true;
            }

        }
        if (isDelete) {
            System.out.println("name is deleted");
        } else {
            System.out.println("name is not deleted");
        }
    }

    public void getNames() {
        System.out.println("this is get method");
        for (int i = 0; i < trainee.length; i++) {
            System.out.println("get the name " + trainee[i]);


        }
    }

    public void read() {
        System.out.println("this is read method");
        for (int i = 0; i < trainee.length; i++) {
            if (trainee[i] != null) {
                System.out.println("get the name " + trainee[i]);


            }

        }

    }
}







