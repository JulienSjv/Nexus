package com.elea.srv.nexus.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elea.srv.nexus.dao.FeedRepository;
import com.elea.srv.nexus.models.Feed;

@RestController
@CrossOrigin
@RequestMapping("feeds")
public class FeedController {
	
	@Autowired FeedRepository feedDao;
	
	
	// GET feeds
		@GetMapping("")
		public List<Feed> getFeeds() {
			return feedDao.findAll();
		}
	

}
