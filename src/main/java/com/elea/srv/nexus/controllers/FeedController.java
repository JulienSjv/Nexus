package com.elea.srv.nexus.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.elea.srv.nexus.dao.FeedRepository;
import com.elea.srv.nexus.models.Feed;

@RestController
@CrossOrigin
@RequestMapping("feeds")
public class FeedController {

	@Autowired
	FeedRepository feedDao;

	// GET feeds
	@GetMapping("")
	public List<Feed> getFeeds() {
		return feedDao.findAll(sortByIdAsc());
	}

	// UPDATE feeds
	@PutMapping("")
	@ResponseBody
	public String updateSoft(@RequestBody List<Feed> feeds) {

		List<Feed> oldFeeds = feedDao.findAll();

		for (Feed feed : oldFeeds) {
			try {
				feedDao.delete(feed);
			} catch (Exception ex) {
				ex.printStackTrace();
				return "Fail on delete..";
			}
		}
		for (Feed feed : feeds) {
			try {
				feedDao.saveAndFlush(feed);
			} catch (Exception ex) {
				ex.printStackTrace();
				return "Fail on insert..";
			}
		}

		return "Save OK";
	}

	private Sort sortByIdAsc() {
		return new Sort(Sort.Direction.ASC, "id");
	}

}
