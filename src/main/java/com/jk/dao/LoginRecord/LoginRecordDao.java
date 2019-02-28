package com.jk.dao.LoginRecord;

import com.jk.entity.LoginRecord.LoginRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRecordDao extends JpaRepository<LoginRecord,Long>{
}
