package com.xworkz.crud;

import com.xworkz.crud.service.BankService;
import com.xworkz.crud.service.impl.BankServiceImpl;

import java.util.List;

public class BankRunner {
    public static void main(String[] args) {

        BankServiceImpl service = new BankServiceImpl();
        BankDto dto = new BankDto(1, "pavan", 555656656556L, "current", "gghh@gmail.com");
        BankDto dto1 = new BankDto(2, "chandu", 4676767666767L, "Savings", "gghgg@gmail.com");
        BankDto dto2 = new BankDto(3, "saniya", 67677676767L, "RD", "hjhhjhj@gmail.com");
        BankDto dto3 = new BankDto(4, "dhanya", 777766767676767L, "FD", "ghhghghh@gamil.com");
        BankDto dto4 = new BankDto(5, "ranju", 77776767676L, "Savings", "hgghhgh@gmail.com");
        service.validateAndSave(dto1);
        BankDto id = service.findById(2);
        System.out.println(id);

        BankDto name = service.findByName("chandu");
        System.out.println(name);

        boolean updatedName = service.updateNameById(4, "dhanya");
        System.out.println(updatedName);

        boolean deleted = service.deleteByName("ranju");
        System.out.println(deleted);

        List<BankDto> readData = service.readAll();
        for (BankDto dto5 : readData) {
            System.out.println(dto5);
        }
    }
//        BankService service = new BankServiceImpl();
//        //service.readAll();
//
//        List<BankDto> readData = service.readAll();
//
//        for (BankDto dto : readData) {
//            System.out.println(dto);
//        }
//
//        BankDto dto = new BankDto("canara bank", "bangalore", 1, 7778788887L, "savings", "cccc@gmail.com");
//
//        boolean result = service.validateAndSave(dto);
//
//        System.out.println(result);
}


//        BankService service = new BankServiceImpl();
//
//        List<BankDto> readData= service.readAll();
//
//
//        for (BankDto dto: readData){
////            if(dto!=null) {
//                System.out.println(dto);
//
////            }

//        }
//
//
//        BankDto dto = new BankDto("canara bank","banglore",1,7778788887L,"savings","cccc@gmail.com");
//
//       boolean result = service.validateAndSave(dto);
//
//       System.out.println(result);
//    }
//}
