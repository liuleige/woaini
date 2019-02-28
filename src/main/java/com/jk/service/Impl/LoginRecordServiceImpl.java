package com.jk.service.Impl;

import com.jk.dao.LoginRecord.LoginRecordDao;
import com.jk.entity.LoginRecord.LoginRecord;
import com.jk.service.user.LoginRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginRecordServiceImpl implements LoginRecordService{

    @Autowired
    private LoginRecordDao loginRecordDao;
    @Override
    public List<LoginRecord> findAll() {
        return loginRecordDao.findAll();
    }
}
