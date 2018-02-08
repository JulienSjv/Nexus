package com.elea.srv.nexus.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
	public List<Soft> getSofts() {
		return softDao.findAll();
	}

	// UPDATE soft
	@PutMapping("")
	@ResponseBody
	public String updateSoft(@RequestBody Soft soft) {
		Soft s = null;
		s = softDao.findOne(soft.getId());
		if (s != null) {
			try {
				softDao.save(soft);
				return "Updated!";
			} catch (Exception ex) {
				ex.printStackTrace();
				return "Fail on update..";
			}
		} else {
			return "Fail, not exist..";
		}

	}

	// ADD soft
	@PostMapping("")
	@ResponseBody
	public String addSoft(@RequestBody Soft soft) {
		try {
			softDao.save(soft);
			return "Added!";
		} catch (Exception ex) {
			ex.printStackTrace();
			return "Fail on add..";
		}

	}

	// DEL SOFT
	@DeleteMapping("")
	@ResponseBody
	public String delSoft(@RequestBody Soft soft) {
		try {
			softDao.delete(soft);
			return "Delete!";
		} catch (Exception e) {
			e.printStackTrace();
			return "Fail on Delete";
		}
	}

}
