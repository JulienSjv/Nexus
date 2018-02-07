package com.elea.srv.nexus.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elea.srv.nexus.dao.BackgroundRepository;
import com.elea.srv.nexus.models.Background;


@RestController
@CrossOrigin
@RequestMapping("backgrounds")
public class BackgroundController {
	
	@Autowired
	BackgroundRepository bgDao;
	
	// GET Background
		@GetMapping("")
		public List<Background> getBackgrounds() {
			return bgDao.findAll();
		}

}
