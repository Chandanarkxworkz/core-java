package com.xworkz.crud.repo;

import com.xworkz.crud.BankDto;

import java.sql.SQLException;
import java.util.List;

public interface BankRepo {

    public boolean validateAndSave(BankDto dto);
    public BankDto findById(int id);

    public BankDto findByName(String name);
    public boolean updateNameById(int id , String name);
    public boolean deleteByName(String name);
    public List<BankDto> readAll();
}
//        public boolean save(BankDto dto) ;
//
//
//
//    boolean update(int id, BankDto dto);
//
//    public List<BankDto> readAll();
//
//   public BankDto findById(int id);
//   public boolean updateNameById(int id,String name);
//
//   public boolean deleteByName(String name);
//}

