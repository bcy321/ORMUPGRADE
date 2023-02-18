package ch09.userInfo.web;

import ch09.domain.userInfo.UserInfo;
import ch09.domain.userInfo.dao.UserInfoDao;
import ch09.domain.userInfo.dao.mySql.UserInfoMySqlDao;
import ch09.domain.userInfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\ORMUPGRADE\\src\\ch09\\db.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);
        String dbType = properties.getProperty("DBTYPE");
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        UserInfoDao userInfoDao = null;
        if(dbType.equals("ORACLE")){
            userInfoDao = new UserInfoOracleDao();
        }else if(dbType.equals("MYSQL")){
            userInfoDao = new UserInfoMySqlDao();
        }else {
            System.out.println("db error");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
    }
}
