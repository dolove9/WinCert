package com.wincert.framework.dao.user;

import com.wincert.framework.dao.user.dto.UserInfoDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserInfoDao {
    protected static final String NAMESPACE = "userInfo.";
    @Autowired
    SqlSession sqlSession;

    public List<UserInfoDto> selectUserInfoAll(){
        return sqlSession.selectList(NAMESPACE + "selectUserAll");
    }
}
