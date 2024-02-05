package com.xworkz.crud.service.impl;

import com.xworkz.crud.BankDto;
import com.xworkz.crud.repo.BankRepo;
import com.xworkz.crud.repo.impl.BankRepoImpl;
import com.xworkz.crud.service.BankService;

import java.sql.*;
import java.util.List;


    public class BankServiceImpl implements BankService {
        BankRepoImpl repo = new BankRepoImpl();
        @Override
        public boolean validateAndSave(BankDto dto) {
            if(dto.getId()>0){
                if (dto.getName() != null){
                    System.out.println("Validated........");
                    return repo.validateAndSave(dto);
                }
            }
            return false;
        }

        @Override
        public BankDto findById(int id) {
            if(id>0){
                System.out.println("id is valid ......");
                return repo.findById(id);
            }
            else {
                System.out.println("Id is invalid");
            }
            return null;
        }

        @Override
        public BankDto findByName(String name) {
            if(name.length()>2 && name!= null){
                System.out.println("ssssssss");
                return repo.findByName(name);
            }
            else{
                System.out.println("*****************");
            }
            return null;
        }

        @Override
        public boolean updateNameById(int id, String name) {
            if(id>0){
                System.out.println(" update");
                return repo.updateNameById(id, name);
            }
            return false;
        }

        @Override
        public boolean deleteByName(String name) {
            if (name != null){
                System.out.println("delete.............");
                return repo.deleteByName(name);
            }
            return false;
        }

        @Override
        public List<BankDto> readAll() {
            System.out.println("Read the data");
            return repo.readAll();
        }

    }

//        private BankRepo repo = new BankRepoImpl();
//
//        @Override
//        public boolean validateAndSave(BankDto dto) {
//            if (dto != null) {
//                if (dto.getBankName() != null && dto.getBankName().length() >= 5) {
//                    System.out.println("bank name is valid");
//                    if (dto.getLocation() != null && dto.getLocation().length() >= 5) {
//                        System.out.println("location is valid");
//
//                        if (dto.getId() > 0) {
//                            System.out.println("id is valid");
//                            if (Long.toString(dto.getContactNumber()).length() == 10) {
//                                System.out.println("contact number is valid");
//
//                                if (dto.getBankType() != null && dto.getBankType().length() >= 5) {
//                                    System.out.println("bank type is valid");
//
//                                    if (dto.getEmail() != null && dto.getEmail().length() >= 5) {
//                                        System.out.println("email is valid");
//
//                                        repo.save(dto);
//                                        return true;
//                                    } else {
//                                        System.out.println("email is invalid");
//                                    }
//                                } else {
//                                    System.out.println("bank type is invalid");
//                                }
//                            } else {
//                                System.out.println("contact number is invalid");
//                            }
//                        } else {
//                            System.out.println("id is invalid");
//                        }
//                    } else {
//                        System.out.println("location is invalid");
//                    }
//                } else {
//                    System.out.println("bank name is invalid");
//                }
//            }
//            return false;
//        }
//        public BankDto findById(int id) {
//            try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_31_jan_2024", "root", "root@2024");
//                String query = "select * from bank where id = ?";
//
//                PreparedStatement statement = connection.prepareStatement(query);
//
//                statement.setInt(1, id);
//                ResultSet set = statement.executeQuery();
//                BankDto dto = new BankDto();
//                while (set.next()) {
//                    String bankName = set.getString("bankName");
//                    String location = set.getString("location");
//                    int id1= set.getInt("id");
//                    long contactNumber = set.getLong("contactNumber");
//                    String bankType = set.getString("bankType");
//                    String email = set.getString("email");
//
//
//                    if (id > 0) {
//                        System.out.println("id is valid sending id to repository");
//                        return repo.findById(id);
//                    }
//                    System.out.println("id is not valid");
//                    return null;
//                }
//
//            } catch (SQLException|ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//            return null;
//        }
//
//        @Override
//        public boolean updateNameById(int id, String bankName) {
//            return false;
//        }
//
//        @Override
//        public boolean deleteByName(String bankName) {
//            return false;
//        }
//
//        public BankDto findByBankName(String bankName) {
//            try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_31_jan_2024", "root", "root@2024");
//                String query = "select * from Bank where bankName = ?";
//
//                PreparedStatement statement = connection.prepareStatement(query);
//
//                statement.setString(1, bankName);
//                ResultSet set = statement.executeQuery();
//                BankDto dto = new BankDto();
//                while (set.next()) {
//                    String bankName1 = set.getString("bankName");
//                    String location = set.getString("location");
//                    int id = set.getInt("id");
//                    long contactNumber = set.getLong("contactNumber");
//                    String bankType = set.getString("bankType");
//                    String email = set.getString("email");
//                    }
//                    System.out.println("id is not valid");
//                    return null;
//                } catch (SQLException ex) {
//                throw new RuntimeException(ex);
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//
//
//            return null;
//        }
//
//
//        @Override
//        public List<BankDto> readAll() {
//           return repo.readAll();
//
//}
//    }
//
////    private BankRepo repo = new BankRepoImpl();
////
////    @Override
////    public boolean validateAndSave(BankDto dto) {
////        if (dto != null) {
////            if (dto.getBankName() != null && dto.getBankName().length() >= 5) {
////                System.out.println("bank name is valid");
////                if (dto.getLocation() != null && dto.getLocation().length() >= 5) {
////                    System.out.println("location is valid");
////
////                    if (dto.getId() > 0) {
////                        System.out.println("id is valid");
////                        if (dto.getContactNumber() != 10 && dto.getContactNumber() >= 10) {
////                            System.out.println("contact number is valid");
////
////                            if (dto.getBankType() != null && dto.getBankType().length() >= 5) {
////                                System.out.println("bank type is valid");
////
////                                if (dto.getEmail() != null && dto.getEmail().length() >= 5) {
////                                    System.out.println("email is valid");
////
////                                    repo.save(dto);
////                                }
////                                System.out.println("email is invalid");
////                            }
////                            System.out.println("bank type is invalid");
////                        }
////                        System.out.println("contact number is invalid");
////                    }
////                    System.out.println("id is invalid");
////                }
////                System.out.println("bank dto is invalid");
////
////                return false;
////            }
////        }
////        return false;
////    }
////
////    @Override
////    public List<BankDto> readAll() {
////        return null;
////    }
////
////
////}
////
////
////
////
////
////
////
////
////
////
////
////
////
