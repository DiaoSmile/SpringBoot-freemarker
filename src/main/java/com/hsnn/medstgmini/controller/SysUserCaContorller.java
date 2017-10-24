package com.hsnn.medstgmini.controller;

import com.hsnn.medstgmini.entity.SysUserCa;
import com.hsnn.medstgmini.service.SysUserCaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 64889 on 2017-10-20.
 */
@RestController
@RequestMapping(value = "/user")
public class SysUserCaContorller {
    @Autowired
    public SysUserCaService sysUserCaService;

    @RequestMapping(value = "/list", method= RequestMethod.GET)
    public String list(ModelMap map){
        List<SysUserCa> userList=sysUserCaService.findAll();
        map.addAttribute("userList", userList);
        return "/user/list";
    }

    @RequestMapping(value = "/findAll")
    public List<SysUserCa> findAll(){
        return sysUserCaService.findAll();
    }

}
