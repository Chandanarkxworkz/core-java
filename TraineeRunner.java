package com.xworkz.crud.things;

import com.xworkz.crud.things.mentor.Mentor;

import java.util.Scanner;

public class TraineeRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the no of trainee ");
        int size = scanner.nextInt();
        Mentor mentor = new Mentor(size);
        for (int index = 0; index < size; index++) {

            Trainee trainee = new Trainee();

            trainee.setName(scanner.next());
            trainee.setId(scanner.nextInt());
            trainee.setAge(scanner.nextInt());
            trainee.setAddress(scanner.next());
            trainee.setEmail(scanner.next());
            trainee.setPhoneNumber(scanner.next());
            trainee.setSpecialization(scanner.next());
            trainee.setUniversity(scanner.next());
            trainee.setSupervisor(scanner.next());
            trainee.setDepartment(scanner.next());

            mentor.addName(trainee);


        }
        mentor.getNames();
    }
}
