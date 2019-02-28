package com.jk.service.Impl;

import com.jk.dao.Dept.DeptDao;
import com.jk.entity.dept.Dept;
import com.jk.service.user.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptDao  deptDao;

    public List<Dept> findAll() {

        return deptDao.findAll();
    }

    @Override
    public void addDept(Dept dept) {
        deptDao.save(dept);

    }

    @Override
    public void deleteDept(Long id) {
        deptDao.delete(id);
    }

    @Override
    public Dept fingOne(Long id) {
        return deptDao.findOne(id);
    }

    @Override
    public void editDept(Dept dept) {
        deptDao.save(dept);
    }
}


