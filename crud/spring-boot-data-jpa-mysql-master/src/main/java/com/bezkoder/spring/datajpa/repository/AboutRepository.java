package com.bezkoder.spring.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.datajpa.model.About;

public interface AboutRepository extends JpaRepository<About, Long> {
	List<About> findByTitleContaining(String title);
}
