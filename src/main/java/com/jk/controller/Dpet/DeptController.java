package com.jk.controller.Dpet;

import com.jk.entity.dept.Dept;
import com.jk.service.user.DeptService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class DeptController {
    @Resource
    DeptService  deptService;

    @RequestMapping("/list")
    public  String   findAll(Model model){
        List<Dept> deptList=deptService.findAll();
        model.addAttribute("deptList",deptList);
        return   "Dept/deptlist";
    }
    @RequestMapping("/toEdit")
    public String  findOne(Model model,Long  id){
        Dept  dept=deptService.fingOne(id);
        model.addAttribute("dept",dept);
        return "Dept/deptedit";
    }
    @RequestMapping("/edit")
    public  String  edit(Dept dept){
        deptService.editDept(dept);
        return  "redirect:/list";
    }

    @RequestMapping("/toAdd")
    public  String  toAdd(){
        return  "Dept/deptadd";
    }

    @RequestMapping("/add")
    public   String  add(Dept dept){
        deptService.addDept(dept);
        return  "redirect:/list";
    }

    @RequestMapping("/delete")
    public  String  delete(Long id){
        deptService.deleteDept(id);
        return  "redirect:/list";
    }


}
