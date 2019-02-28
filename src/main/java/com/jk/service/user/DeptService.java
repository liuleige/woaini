package com.jk.service.user;

import com.jk.entity.dept.Dept;

import java.util.List;

public interface DeptService {

    public List<Dept> findAll();

    public  void  addDept(Dept dept);

    public void deleteDept(Long id);

    public  Dept  fingOne(Long id);

    public  void  editDept(Dept dept);
}
