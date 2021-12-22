package com.example.springjwt.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springjwt.model.DAOUser;
import com.example.springjwt.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public void save(DAOUser user) {
        repo.save(user);
    }
     
    public List<DAOUser> listAll() {
        return (List<DAOUser>) repo.findAll();
    }
     
    public DAOUser get(Long id) {
        return repo.findById(id).get();
    }
     
    public void delete(Long id) {
        repo.deleteById(id);
    }
	
}
