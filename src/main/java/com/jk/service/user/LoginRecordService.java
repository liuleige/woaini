package com.jk.service.user;

import com.jk.entity.LoginRecord.LoginRecord;

import java.util.List;

public interface LoginRecordService {
    List<LoginRecord> findAll();
}
