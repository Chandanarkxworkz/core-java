package com.xworkz.police.officer.Station.policeApp.station;

import com.xworkz.police.officer.Station.police.officer.Station.Officer;

import java.util.Scanner;

public class StationExecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the no of objects");
        int size = scanner.nextInt();

        PoliceStation policeStation = new PoliceStation(size);

        for (int index = 0; index < size; index++) {
            Officer officer = new Officer();

            System.out.println("enter the id");
            officer.setOfficerId(scanner.nextInt());

            System.out.println("enter the officer name");
            officer.setName(scanner.next());

            System.out.println("enter the officer role type");
            officer.setPostName(scanner.next());

            System.out.println("enter the officer age");
            officer.setAge(scanner.nextInt());

            System.out.println("enter the gender");
            officer.setGender(scanner.next());

            System.out.println("enter the blood group ");
            officer.setBloodGroup(scanner.next());

            System.out.println("enter the location");
            officer.setAddress(scanner.next());

            policeStation.addOfficers(officer);
        }
        policeStation.getAllOfficer();

        String input=null;
        do{
            System.out.println("press 1: to get All Officers");
            System.out.println("press 2: to get address of the officer by id");
            System.out.println("press 3: to get officer information by id");
            System.out.println("press 4: to get officer age by name");
            System.out.println("press 5: to get post name of the officer by name");
            System.out.println("press 6: to get post name of the officer by id");
            System.out.println("press 7: to get officer names by post name");
            int options=scanner.nextInt();
            switch (options) {
                case 1:
                    policeStation.getAllOfficer();
                    break;
                case 2:
                    String address = policeStation.getAddressById(scanner.nextInt());
                    System.out.println(address);
                    break;
                case 3:
                    Officer officer1 = policeStation.getOfficerInfoById(scanner.nextInt());

                    System.out.println(officer1.getOfficerId() + " " + officer1.getName() + " " + officer1.getPostName() + " " + officer1.getAge() + " " + officer1.getGender() + " " + officer1.getBloodGroup() + " " + officer1.getAddress());
                    break;
                case 4:
                    int age = policeStation.getOfficerAgeByName(scanner.next());
                    System.out.println(age);
                    break;

                case 5:
                    String postName = policeStation.getPostNameByName(scanner.next());
                    System.out.println(postName);
                    break;

                case 6:
                    String postName1 = policeStation.getPostNameById(scanner.nextInt());
                    System.out.println(postName1);
                    break;
                case 7:
                    String[] officerName = policeStation.getOfficersNameByPostName(scanner.next());
                    System.out.println(officerName);
                    break;

                default:
                    System.out.println("please check");
                    break;
            }
            System.out.println("do you want to proceed :yes or no");
            input= scanner.next();
            }
        while (input.equals("yes"));
        System.out.println("thank u");

        }
        /*

        PoliceStation policeStation = new PoliceStation();
        policeStation.addOfficers(officer);


        Officer officer1 = new Officer();
        officer1.setOfficerId(2);
        officer1.setName("Saniya");
        officer1.setPostName("CEO");
        officer1.setAge(27);
        officer1.setGender("female");
        officer1.setBloodGroup("A-");
        officer1.setAddress("Belur");


        policeStation.addOfficers(officer1);


        Officer officer2 = new Officer();
        officer2.setOfficerId(3);
        officer2.setName("mohan");
        officer2.setPostName("Constable");
        officer2.setAge(30);
        officer2.setGender("Male");
        officer2.setBloodGroup("A+");
        officer2.setAddress("chikkmanglur");


        policeStation.addOfficers(officer2);

        Officer officer3 = new Officer();
        officer3.setOfficerId(4);
        officer3.setName("divya");
        officer3.setPostName("sub-inspector");
        officer3.setAge(32);
        officer3.setGender("female");
        officer3.setBloodGroup("o+");
        officer3.setAddress("mandya");


        policeStation.addOfficers(officer3);

        Officer officer4 = new Officer();
        officer4.setOfficerId(5);
        officer4.setName("kiran");
        officer4.setPostName("ASP");
        officer4.setAge(29);
        officer4.setGender("male");
        officer4.setBloodGroup("AB+");
        officer4.setAddress("Raichur");


        policeStation.addOfficers(officer4);

        Officer officer5 = new Officer();
        officer5.setOfficerId(6);
        officer5.setName("charita");
        officer5.setPostName("DSP");
        officer5.setAge(27);
        officer5.setGender("female");
        officer5.setBloodGroup("A-");
        officer5.setAddress("Belur");


        policeStation.addOfficers(officer5);

        String address = policeStation.getAddressById(4);
        System.out.println(address);

        Officer office = policeStation.getOfficeInfoById("divya");
        System.out.println(office.getOfficerId() + " " + office.getName() + " " + office.getGender() + " " + office.getAge() + " " + office.getPostName() + " " + office.getBloodGroup() + office.getOfficerId());

        int age = policeStation.getOfficerAgeByName("charita");
        System.out.println(age);

        String postName = policeStation.getPostNameByName("saniya");
        System.out.println(postName);

        String postName1 = policeStation.getPostNameById(2);
        System.out.println(postName1);

        policeStation.updatePostNameByOfficerName("constable", "nithin");

        policeStation.deleteOfficerById(3);

    }*/
    }

