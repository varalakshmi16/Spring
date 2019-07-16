package com.dsrc.bo;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsrc.bean.RegisterBean;
import com.dsrc.dao.ProfileDAO;

@Service
public class ProfileManagementBO implements ProfileBO
{
	
	private ProfileDAO profileDAO;
	
	@Transactional
	public void setProfileDAO(ProfileDAO profileDAO) {
		this.profileDAO = profileDAO;
	}

	@Override
	@Transactional
	public boolean addPerson(RegisterBean p) {
		return profileDAO.addPerson(p);
		
	}

	@Override
	@Transactional
	public boolean updatePerson(RegisterBean p) {
		return profileDAO.updatePerson(p);
		
	}

	@Override
	@Transactional
	public boolean removePerson(int id) {
		// TODO Auto-generated method stub
		return this.profileDAO.removePerson(id);
		
	}
	@Override
	@Transactional
	public List<RegisterBean> login(RegisterBean r) {
				
		return this.profileDAO.login(r);				
	}

	@Override
	@Transactional
	public boolean changePassword(String pass,int id) {
		
		return this.profileDAO.changePassword(pass,id);
		
	}
}