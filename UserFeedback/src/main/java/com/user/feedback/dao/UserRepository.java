package com.user.feedback.dao;

import org.springframework.data.repository.CrudRepository;

import com.user.feedback.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	public User findById(int id);

}
