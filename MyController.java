package com.dsrc.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dsrc.bean.RegisterBean;
import com.dsrc.bo.ProfileBO;

@Controller
public class MyController {
		
	private ProfileBO profileBO;	
	
	List l=null;
	
	@Autowired
	@Qualifier(value="profileBO")
	public void setProfileBO(ProfileBO bo)
	{
		this.profileBO=bo;
	}
	
	@RequestMapping("/index.htm")
	public String index()
	{
		return "index";
	}
	@RequestMapping("/Register.htm")
	public String register(Model m)
	{	
		m.addAttribute("reg",new RegisterBean());
		return "Register";	
	}
	@RequestMapping(value="/save.htm",method = RequestMethod.POST)  
    public String save(@ModelAttribute("reg") RegisterBean reg)
	{  	
		boolean res=false;
		res=profileBO.addPerson(reg);
		if(res)
		{
		return "Home";
		} 
		return "error";
    } 
	@RequestMapping("/Login.htm")
	public String login(Model m)
	{		
		m.addAttribute("reg",new RegisterBean());
		return "Login";		
	}
	@RequestMapping(value="/loginval.htm",method=RequestMethod.POST)
	public String loginval(@ModelAttribute("log") RegisterBean log)
	{
		
		l=this.profileBO.login(log);
		return "redirect:/ViewProfile.htm";		
	}	
	@RequestMapping("/ViewProfile.htm")
	public String view(Model m)
	{
		m.addAttribute("log",new RegisterBean());
		m.addAttribute("list",l);
		return "ViewProfile";
	}
	@RequestMapping("/edit.htm")
	public String edit(Model m)
	{
			m.addAttribute("reg",new RegisterBean());	
			m.addAttribute("list",l);
			return "EditProfile";		
			
	}
	@RequestMapping("/saveedit.htm")
	public String saveedit(@ModelAttribute("sav") RegisterBean reg)
	{
		this.profileBO.updatePerson(reg);
		
		return "Home";		
	}
	@RequestMapping("/Delete.htm")
	public String delete()
	{

		RegisterBean r=new RegisterBean();
		for(Iterator i=l.iterator();i.hasNext();)
		{
			 r=(RegisterBean) i.next();
		}
		this.profileBO.removePerson(r.getUser());
				
		return "Home";		
	}
	@RequestMapping("/ChangePass.htm")
	public String changepass()
	{
		return "ChangePassword";	
	}
	@RequestMapping("/change.htm")
	public String change(HttpServletRequest request,HttpServletResponse response)
	{
		String pass=request.getParameter("new");
		System.out.println(pass);
		RegisterBean r=new RegisterBean();
		for(Iterator i=l.iterator();i.hasNext();)
		{
			 r=(RegisterBean) i.next();
		}
		int id=r.getUser();
		System.out.println(id);
		this.profileBO.changePassword(pass,id);
		return "Home";		
	}
	@RequestMapping("/Home.htm")
	public String home()
	{
		return "Home";
	}
	
}
