package com.xworkz.crud.service;

import com.xworkz.crud.BankDto;

import java.util.List;

public interface BankService {

    public boolean validateAndSave(BankDto dto);

    public BankDto findById(int id);

    public BankDto findByName(String name);

    public boolean updateNameById(int id , String name);

    public boolean deleteByName(String name);

    public List<BankDto> readAll();

//       public   boolean validateAndSave(BankDto dto);
//
//        public List<BankDto>readAll();
//        public  BankDto findById(int id);
//       // public BankDto findByName(String name);
//        public boolean updateNameById(int id,String bankName);
//
//        public boolean deleteByName(String bankName);

//        public BankDto findById(int id);
    }


