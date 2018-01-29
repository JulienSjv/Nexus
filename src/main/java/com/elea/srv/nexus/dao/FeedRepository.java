package com.elea.srv.nexus.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elea.srv.nexus.models.Feed;

public interface FeedRepository extends JpaRepository<Feed, Long> {

}
