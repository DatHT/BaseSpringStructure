package com.pisb.dao;

import java.util.List;

public interface IBaseDao<Model, Id> {

	public <Model> Model getById(Id id);
	public void insert(Model model);
	public <Model> List<Model> getAll();
}
