package com.dsrc.bo;

import java.util.List;

import com.dsrc.bean.RegisterBean;

public interface ProfileBO {

	public boolean addPerson(RegisterBean p);
	public boolean updatePerson(RegisterBean p);
	public boolean removePerson(int id);
	public boolean changePassword(String pass,int id);
	public List<RegisterBean> login(RegisterBean r);

}
