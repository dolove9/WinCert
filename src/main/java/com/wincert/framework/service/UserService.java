package com.wincert.framework.service;

import com.wincert.framework.dao.user.UserInfoDao;
import com.wincert.framework.dao.user.dto.UserInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserInfoDao userInfoDao;

    public List<UserInfoDto>  getAllUser(){
        return userInfoDao.selectUserInfoAll();
    }

}
