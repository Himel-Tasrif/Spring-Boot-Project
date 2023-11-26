package com.himel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.himel.entity.Notes;
import com.himel.entity.User;

public interface NotesRepository extends JpaRepository<Notes, Integer>{
	
	public List<Notes> findByUser(User user);

}
