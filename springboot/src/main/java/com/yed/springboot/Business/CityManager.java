package com.yed.springboot.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.yed.springboot.DataAccess.ICityDal;
import com.yed.springboot.Entities.City;

@Service
public class CityManager implements ICityService{

	private ICityDal cityDal;
	
	@Autowired
	public CityManager(ICityDal cityDal) {
		super();
		this.cityDal = cityDal;
	}

	@Transactional
	@Override
	public List<City> getAll() {
		return this.cityDal.getAll();
	}

	@Transactional
	@Override
	public void add(City city) {
		this.cityDal.add(city);
	}

	@Transactional
	@Override
	public void update(City city) {
		this.cityDal.update(city);
	}

	@Transactional
	@Override
	public void delete(City city) {
		this.cityDal.delete(city);
	}

	@Transactional
	@Override
	public City getById(int id) {
		return this.cityDal.getById(id);
	}

}
