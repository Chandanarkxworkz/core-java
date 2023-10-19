package com.xworkz.police.officer.Station.policeApp.station;

import com.xworkz.police.officer.Station.police.officer.Station.Officer;
import lombok.ToString;

import java.util.Arrays;

@ToString

public class PoliceStation {
    Officer officers[];

    public PoliceStation(int size) {
        officers = new Officer[size];
    }

    int index;

    public boolean addOfficers(Officer officers) {
        System.out.println("invoke add officers");
        boolean isAdded = false;
        if (officers != null) {
            this.officers[index++] = officers;
            isAdded = true;


        }
        return isAdded;

    }

    public void getAllOfficer() {
        System.out.println("officer lists are ");
        for (int i = 0; i < officers.length; i++) {
            System.out.println(officers[i].getOfficerId() + " " + officers[i].getName() + " " + officers[i].getPostName() + " " + officers[i].getAge() + " " + officers[i].getGender() + " " + officers[i].getBloodGroup() + " " + officers[i].getAddress());
        }


    }


    public String getAddressById(int id) {
        String address = null;
        for (int officerIndex = 0; officerIndex < this.officers.length; officerIndex++) {
            if (officers[officerIndex].getOfficerId() == id) {
                address = officers[officerIndex].getAddress();
                System.out.println("address found..... ");
            }
        }
        return address;
    }


    public Officer getOfficerInfoById(int id){
        Officer officer1=null;
        for (int officerIndex = 0; officerIndex < this.officers.length; officerIndex++) {
            if (officers[officerIndex].getOfficerId() == id) {
                officer1 = officers[officerIndex];
                System.out.println("office info  found by id ..... ");
            }
        }
        return officer1;
    }

    public int getOfficerAgeByName(String officerName){
        int age =0;
        for (int officerIndex = 0; officerIndex < this.officers.length; officerIndex++) {
            if (officers[officerIndex].getName() == officerName) {
                age = officers[officerIndex].getAge();
                System.out.println("officer age found by name..... ");
            }
        }
        return age;
    }

    public String getPostNameByName(String officerName){
        String postName=null;
        for (int officerIndex = 0; officerIndex < this.officers.length; officerIndex++) {
            if (officers[officerIndex].getName().equals(officerName) ) {
                postName = officers[officerIndex].getPostName();
                System.out.println("officer found..... ");
            }
        }
        return postName;
    }
    public String getPostNameById(int officerId){
        String postName1=null;
        for (int officerIndex = 0; officerIndex < this.officers.length; officerIndex++) {
            if (officers[officerIndex].getOfficerId() == officerId) {
                postName1 = officers[officerIndex].getPostName();
                System.out.println("post name found by id..... ");
            }
        }
        return postName1;
    }
    public String[] getOfficersNameByPostName(String postName){
        System.out.println("search officers by their post name ");
        String officerName[]=null;
        int newIndex=0;

        for (int officerIndex = 0; officerIndex < this.officers.length; officerIndex++) {
            if (officers[officerIndex].getPostName() == postName) {
                newIndex++;
            }
        }

        officerName=new String[newIndex];
        newIndex=0;
        for (int officerIndex = 0; officerIndex < this.officers.length; officerIndex++) {
            if (officers[officerIndex].getPostName() == postName) {
                officerName[newIndex++]= officers[officerIndex].getName();
                System.out.println("officer found..... ");
            }
        }
        return officerName;
    }


    public boolean updatePostNameByOfficerName(String updatedPostName, String existingOfficerName) {
        boolean isPostNameUpdated = false;
        System.out.println("invoking update company name by id method");
        for (int officerIndex = 0; officerIndex < this.officers.length; officerIndex++) {
            if(officers[officerIndex].getName() == existingOfficerName) {
                officers[officerIndex].setPostName(updatedPostName);
                isPostNameUpdated = true;
            }
        }


        return isPostNameUpdated;
    }

    public void deleteOfficerById(int id) {

        System.out.println("invoking deleteOfficerById");
        int index, newIndex;


        for (index = 0, newIndex = 0; index < this.officers.length; index++) {


            if (officers[index].getOfficerId() != id) {
                officers[newIndex++] = officers[index];
                System.out.println("given officers  deleted");
            }
            else{
                System.out.println("given officer is been deleted from the police station");

            }
        }
        officers = Arrays.copyOf(officers, newIndex);
        getAllNewOfficer(officers);

    }
    public void getAllNewOfficer(Officer officers[]){
        System.out.println("get all new  officer");
        for(int index=0;index<officers.length;index++){

            System.out.println(officers[index].getOfficerId() + " " + officers[index].getName() + " " + officers[index].getPostName() + " " + officers[index].getAge() + " " + officers[index].getGender() + " " + officers[index].getBloodGroup() + " " + officers[index].getAddress());

}




      }

}

