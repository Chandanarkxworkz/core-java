package com.xworkz.crud.repo.impl;

import com.xworkz.crud.BankDto;
import com.xworkz.crud.constants.DBProperties;
import com.xworkz.crud.repo.BankRepo;
import com.xworkz.crud.repo.utils.BankUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BankRepoImpl implements BankRepo {

    @Override
    public boolean validateAndSave(BankDto dto) {
        Connection connection = BankUtils.getConnection();
        String query = "Insert into bank values(?,?,?,?,?)";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(query);
            statement.setInt(1 , dto.getId());
            statement.setString(2,dto.getName());
            statement.setLong(3,dto.getContactNumber());
            statement.setString(4,dto.getBankType());
            statement.setString(5,dto.getEmail());
            int rowsAffected = statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return false;
    }

    @Override
    public BankDto findById(int id) {
        Connection connection = BankUtils.getConnection();
        String query = "select * from bank where id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setInt(1, id);

            ResultSet set = statement.executeQuery();

            BankDto dto = new BankDto();
            while (set.next()) {
                int returnedId = set.getInt("id");
                String name = set.getString("name");
                Long contactNumber = set.getLong("contactNumber");
                String bankType = set.getString("bankType");
                String  email = set.getString("email");

                dto.setId(returnedId);

                dto.setName(name);

                dto.setContactNumber(contactNumber);

                dto.setBankType(bankType);

                dto.setEmail(email);

            }
            return dto;
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public BankDto findByName(String name) {
        Connection connection = BankUtils.getConnection();
        String query = "select * from bank where name = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, name);

            ResultSet set = statement.executeQuery();

            BankDto dto = new BankDto();
            while (set.next()) {
                int returnedId = set.getInt("id");
                String returnedName = set.getString("name");
                Long contactNumber = set.getLong("contactNumber");
                String bankType = set.getString("bankType");
                String  email = set.getString("email");

                dto.setId(returnedId);

                dto.setName(returnedName);

                dto.setContactNumber(contactNumber);

                dto.setBankType(bankType);

                dto.setEmail(email);

            }
            return dto;
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean updateNameById(int id, String name) {
        Connection connection = BankUtils.getConnection();

        String query = "update bank set name = ? where id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,name);
            statement.setInt(2,id);
            int rowsAffected = statement.executeUpdate();
            System.out.println(rowsAffected);
            if (rowsAffected >0){
                return  true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public boolean deleteByName(String name) {
        Connection connection = BankUtils.getConnection();
        String query = "delete from bank where name = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1 , name);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected >0){
                return  true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public List<BankDto> readAll() {
        Connection connection = BankUtils.getConnection();
        String query = "select * from bank ";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet set = statement.executeQuery();

            List<BankDto> list = new ArrayList<BankDto>();

            while (set.next()){
                int id = set.getInt("id");
                String name = set.getString("name");
                Long contactNumber = set.getLong("contactNumber");
                String bankType = set.getString("bankType");
                String  email = set.getString("email");

                BankDto dto = new BankDto(id , name , contactNumber , bankType , email);
                System.out.println(dto);
            }
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}



//    @Override
//    public boolean save(BankDto dto) {
//        Connection connection= BankUtils.getConnection();
//        String query = "INSERT INTO bank(bankName, location, id, contactNumber, bankType, email)" +  "VALUES (?, ?, ?, ?, ?, ?)";
//
//       // try (Connection connection = DriverManager.getConnection(DBProperties.URL.value, DBProperties.USER.value, DBProperties.PASSWORD.value);
//             PreparedStatement statement = connection.prepareStatement(query) ;
//            statement.setString(1, dto.getBankName());
//            statement.setString(2, dto.getLocation());
//            statement.setInt(3, dto.getId());
//            statement.setLong(4, dto.getContactNumber());
//            statement.setString(5, dto.getBankType());
//            statement.setString(6, dto.getEmail());
//           // statement.executeQuery();
//
//
//            int rowsAffected = statement.executeUpdate();
//            if(rowsAffected>0) {
//                return true;
//            }
//
//        } catch (SQLException e) {
//            throw new RuntimeException((e);
//        }
//        return false;
//    }
//
//
//
//    public boolean updateNameById(String bankType, BankDto dto) {
//        String query = "UPDATE bank SET bankName=?, location=? WHERE bankType=?";
//
//        try (Connection connection = DriverManager.getConnection(DBProperties.URL.value, DBProperties.USER.value, DBProperties.PASSWORD.value);
//             PreparedStatement statement = connection.prepareStatement(query)) {
//            statement.setString(1, dto.getBankName());
//            statement.setString(2, dto.getLocation());
//            statement.setString(3, dto.getBankType());
//            int rowsAffected = statement.executeUpdate();
//            return rowsAffected > 0;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//
//    @Override
//    public boolean update(int id, BankDto dto) {
//        String query = "UPDATE bank SET bankName=?, location=? WHERE id=?";
//
//        try (Connection connection = DriverManager.getConnection(DBProperties.URL.value, DBProperties.USER.value, DBProperties.PASSWORD.value);
//             PreparedStatement statement = connection.prepareStatement(query)) {
//            statement.setString(1, dto.getBankName());
//            statement.setString(2, dto.getLocation());
//            statement.setInt(3, id);
//            int rowsAffected = statement.executeUpdate();
//            return rowsAffected > 0;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//
//    public boolean deleteByBankName(String BankName) {
//        Connection connection = BankUtils.getConnection();
//        String query = "delete from bank where name = ?";
//        try {
//            PreparedStatement statement = connection.prepareStatement(query);
//            statement.setString(1, BankName);
//            int rowsAffected = statement.executeUpdate();
//            if (rowsAffected > 0) {
//                return true;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//
//    public boolean deleteByLocation(String Location) {
//        Connection connection = BankUtils.getConnection();
//        String query = "delete from bank where Location = ?";
//        try {
//            PreparedStatement statement = connection.prepareStatement(query);
//            statement.setString(1, Location);
//            int rowsAffected = statement.executeUpdate();
//            if (rowsAffected > 0) {
//                return true;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//
//
//    @Override
//    public List<BankDto> readAll() {
//    Connection connection = BankUtils.getConnection();
//        String query = "SELECT * FROM bank";
//       // List<BankDto> list = null;
//       // try (Connection connection = DriverManager.getConnection(DBProperties.URL.value, DBProperties.USER.value, DBProperties.PASSWORD.value);
//             PreparedStatement statement = connection.prepareStatement(query);
//             ResultSet set = statement.executeQuery()){
//            List<BankDto> list = new ArrayList<BankDto>();
//            while (set.next()) {
//                String bankName = set.getString("bankName");
//                String location = set.getString("location");
//                int id = set.getInt("id");
//                long contactNumber = set.getLong("contactNumber");
//                String bankType = set.getString("bankType");
//                String email = set.getString("email");
//                System.out.println(bankName);
//                System.out.println(location);
//                System.out.println(id);
//                System.out.println(contactNumber);
//                System.out.println(bankType);
//                System.out.println(email);
//            }
//
//              //  BankDto dto = new BankDto(bankName, location, id, contactNumber, bankType, email);
//               // list.add(dto);
//return list;
//
//            //  return list;
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//           // e.printStackTrace();
//        }
//
//
//        //return list;
//    }
//
//
//
//
//    @Override
//    public BankDto findById(int id) {
//        Connection connection = BankUtils.getConnection();
//        String query = "select * from bank where id = ?";
//
//        try {
//            PreparedStatement statement = connection.prepareStatement(query);
//            statement.setInt(1, id);
//
//            ResultSet set = statement.executeQuery();
//            BankDto dto = new BankDto();
//
//            while (set.next()) {
//                String bankName = set.getString("bankName");
//                String location = set.getString("location");
//                int id = set.getInt("id");
//                long contactNumber = set.getLong("contactNumber");
//                String bankType = set.getString("bankType");
//                String email = set.getString("email");
//
//                dto.setBankName(bankName);
//                dto.setLocation(location);
//                dto.setId(id);
//                dto.setContactNumber(contactNumber);
//                dto.setBankType(bankType);
//                dto.setEmail(email);
//
//            }
//            return dto;
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//    @Override
//    public boolean updateNameById(int id, String bankName) {
//    Connection connection = BankUtils.getConnection();
//    String query = " update bank set name = ? where id =? ";
//    try {
//        PreparedStatement statement = connection.prepareStatement(query);
//        statement.setString(1,bankName);
//      //  statement.setString(2,location);
//        statement.setInt(3,id);
//       // statement.setString(4,contactName);
//       // statement.setString(5,bankType);
//       // statement.setString(6,email);
//        int rowsAffected = statement.executeUpdate();
//        System.out.println(rowsAffected);
//        if (rowsAffected > 0) {
//            return true;
//        }
//    } catch (SQLException e) {
//        e.printStackTrace();
//    }
//
//        return false;
//    }
//
//    @Override
//    public boolean deleteByName(String bankName) {
//
//        Connection connection = BankUtils.getConnection();
//        String query = " delete from bank where name=? ";
//        try {
//            PreparedStatement statement = connection.prepareStatement(query);
//            statement.setString(1, bankName);
//            //  statement.setString(2,location);
//            // statement.setInt(3,id);
//            // statement.setString(4,contactName);
//            // statement.setString(5,bankType);
//            // statement.setString(6,email);
//            int rowsAffected = statement.executeUpdate();
//            // System.out.println(rowsAffected);
//            if (rowsAffected > 0) {
//                return true;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return false;
//    }
//}
////    @Override
////    public boolean save(BankDto dto) {
////
////      // Connection connection = BankUtils.getConnection();
////        String query = "Insert into bank(bankName,location,id,contactNumber,bankType,email) values (?,?,?,?,?,?)";
////
////
////        try
////                (Connection connection= DriverManager.getConnection(DBProperties.URL.value,DBProperties.USER.value,DBProperties.PASSWORD.value);
////            PreparedStatement statement = connection.prepareStatement(query);)
////        {
////          // PreparedStatement statement = connection.prepareStatement(query);
////            statement.setString(1, dto.getBankName());
////            statement.setString(2, dto.getLocation());
////            statement.setInt(3, dto.getId());
////            statement.setLong(4, dto.getContactNumber());
////            statement.setString(5, dto.getBankType());
////            statement.setString(6, dto.getEmail());
////            int rowsAffected = statement.executeUpdate();
////            if (rowsAffected > 0) {
////                return true;
////
////            }
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
////
////
////        return false;
////}
////    @Override
////    public List<BankDto> readAll() {
////
////
////         Connection   connection = BankUtils.getConnection();
////           String query = "select * from Book ";
////            try {
////               PreparedStatement statement = connection.prepareStatement(query);
////                ResultSet set = statement.executeQuery();
////                List<BankDto> list = new ArrayList<BankDto>();
////                while (set.next()) {
////
////                    String bankName = set.getString("bankName");
////                    String location = set.getString("location");
////                    int id = set.getInt("id");
////                    long contactNumber = set.getLong("contactNumber");
////                    String bankType = set.getString("bankType");
////                    String email = set.getString("email");
////
////                   BankDto dto = new BankDto(bankName, location, id, contactNumber, bankType, email);
////                    list.add(dto);
////                }
////                return list;
////            } catch (SQLException e) {
////                throw new RuntimeException(e);
////
////            }
////        }
////    }
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
////
////
