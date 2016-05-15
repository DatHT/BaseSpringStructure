package com.pisb.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pisb.dao.IBaseDao;

@Repository
public class BaseDao<Model, Id> implements IBaseDao<Model, Id> {

	private static final Logger log = Logger.getLogger(BaseDao.class.getName());
	private Class<Model> clazz;
	
	@Autowired
	private SessionFactory factory;
	
	public BaseDao(Class<Model> clazz) {
        this.clazz = clazz;
    }
	
	
	protected Session getSession() {
		return factory.getCurrentSession();
	}

	@Override
	public <Model> Model getById(Id id) {
		// TODO Auto-generated method stub
		return (Model) getSession().get(clazz, (Serializable) id);
	}

	@Override
	public void insert(Model model) {
		// TODO Auto-generated method stub
		getSession().save(model);
		
	}

	@Override
	public <Model> List<Model> getAll() {
		// TODO Auto-generated method stub
		
		return null;
	}

	
	
}
