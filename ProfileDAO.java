package com.dsrc.dao;

import java.util.List;

import com.dsrc.bean.RegisterBean;

public interface ProfileDAO {
	
		public boolean addPerson(RegisterBean p);
		public boolean updatePerson(RegisterBean p);
		public boolean removePerson(int id);
		public boolean changePassword(String pass,int id);
		public List<RegisterBean> login(RegisterBean r);
		
}