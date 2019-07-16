package com.dsrc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.dsrc.bean.RegisterBean;

@Repository
public class ProfileManagementDAO implements ProfileDAO{
	

private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Override
	public boolean addPerson(RegisterBean p) {
		
	Session session=this.sessionFactory.getCurrentSession();
		
		session.save(p);
		return true;
		
	}

	@Override
	public boolean updatePerson(RegisterBean p) {
		
		Session session=this.sessionFactory.getCurrentSession();
		session.update(p);
		return true;
	
	}


	@Override
	public boolean removePerson(int id) {
		
		Session session=this.sessionFactory.getCurrentSession();		
		RegisterBean r=session.get(RegisterBean.class, id);
		session.delete(r);
		
		return true;
	}

	@Override
	public List<RegisterBean> login(RegisterBean p) {
		
		Session session=this.sessionFactory.getCurrentSession();

		 Query<RegisterBean> theQuery = session.createQuery("from RegisterBean where user=:id and pass=:pass", RegisterBean.class);
		 theQuery.setInteger("id", p.getUser());
		 theQuery.setString("pass", p.getPass());
		 List l=theQuery.list();
	
  		return l;
	}

	@Override
	public boolean changePassword(String pass,int id) {
		
		Session session=this.sessionFactory.getCurrentSession();
		Query q=session.createQuery("update RegisterBean set pass=:pa where user=:i");
		q.setString("pa", pass);
		q.setInteger("i", id);		
		q.executeUpdate();
		return true;
	}
}