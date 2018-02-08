package com.elea.srv.nexus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elea.srv.nexus.dao.ConfigRepository;
import com.elea.srv.nexus.models.Config;

@RestController
@CrossOrigin
@RequestMapping("config")
public class ConfigController {

	@Autowired
	private ConfigRepository configDao;

	// GET config
	@GetMapping("")
	public Config getConfig() {
		return configDao.findOne((long) 1);
	}

}
