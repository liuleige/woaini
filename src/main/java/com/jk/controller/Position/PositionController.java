package com.jk.controller.Position;

import com.jk.entity.position.AoaPosition;
import com.jk.service.user.PositionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class PositionController {

    @Resource
    private PositionService positionService;

    @RequestMapping("/Positionlist")
    public  String   findAll(Model model){
        List<AoaPosition> positionsList=positionService.findAll();
        model.addAttribute("positionsList",positionsList);
        return   "Position/positionlist";
    }
    @RequestMapping("/toEditposi")
    public String  findOne(Model model,Long  id){
        AoaPosition  dept=positionService.fingOne(id);
        model.addAttribute("dept",dept);
        return "Position/positionedit";
    }
    @RequestMapping("/editposi")
    public  String  edit(AoaPosition position){
        positionService.editPosition(position);
        return  "redirect:/Positionlist";
    }

    @RequestMapping("/toAddposi")
    public  String  toAdd(){
        return  "Position/positionadd";
    }

    @RequestMapping("/addposi")
    public   String  add(AoaPosition position){
        positionService.addPosition(position);
        return  "redirect:/Positionlist";
    }

    @RequestMapping("/deleteposi")
    public  String  delete(Long id){
        positionService.deletePosition(id);
        return  "redirect:/Positionlist";
    }
}
