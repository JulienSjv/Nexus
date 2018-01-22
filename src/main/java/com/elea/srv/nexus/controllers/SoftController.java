package com.elea.srv.nexus.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elea.srv.nexus.dao.SoftRepository;
import com.elea.srv.nexus.models.Soft;


@RestController
@CrossOrigin
@RequestMapping("softs")
public class SoftController {
	
    @Autowired
    private SoftRepository softDao;
    
    
    // GET softs
    @GetMapping("")
    public List<Soft> getConfig() {
        return softDao.findAll();
    }

}
