package com.elea.srv.nexus.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elea.srv.nexus.dao.CategorieRepository;
import com.elea.srv.nexus.models.Categorie;

@RestController
@CrossOrigin
@RequestMapping("categories")
public class CategorieController {
	
	@Autowired
	private CategorieRepository categorieDao;
	
	
	// GET categories
		@GetMapping("")
		public List<Categorie> getCategories() {
			return categorieDao.findAll();
		}

}
