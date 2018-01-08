package com.spring.tx.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.tx.dao.TestDAO;
import com.spring.tx.model.User;

@Service
public class TestDAOImpl implements TestDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void insertUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

}
