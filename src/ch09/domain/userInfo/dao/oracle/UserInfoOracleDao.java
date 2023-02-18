package ch09.domain.userInfo.dao.oracle;

import ch09.domain.userInfo.UserInfo;
import ch09.domain.userInfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into oracle DB " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into oracle DB " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete from oracle DB " + userInfo.getUserId());
    }
}
