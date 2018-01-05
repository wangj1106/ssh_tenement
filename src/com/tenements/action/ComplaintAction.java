package com.tenements.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tenements.domain.Complaint;
import com.tenements.domain.PageBean1;
import com.tenements.domain.User;
import com.tenements.service.ComplaintService;
import com.tenements.service.UserService;

public class ComplaintAction extends ActionSupport implements ModelDriven<Complaint>{
	private Complaint complaint = new Complaint();
	public Complaint getModel(){
		return complaint;
	}
	
	private Integer currPage = 1;
	
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	private ComplaintService complaintService;
	private UserService userService;
	
	public void setComplaintService(ComplaintService complaintService) {
		this.complaintService = complaintService;
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String findAll(){
		PageBean1<Complaint> pageBean = complaintService.findByPage(currPage);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}

	public String saveUI(){
		List<User> list = userService.findAll();
		ActionContext.getContext().getValueStack().set("list", list);
		return "saveUI";
	}

	public String save(){
		complaintService.save(complaint);
		return "saveSuccess";
	}
	
	public String edit(){
		complaint = complaintService.findById(complaint.getCid());
		
		List<User> list = userService.findAll();
		ActionContext.getContext().getValueStack().set("list", list);
		return "editSuccess";
	}
	
	public String update(){
		complaintService.update(complaint);
		return "updateSuccess";
	}
	
	public String delete(){
		complaint = complaintService.findById(complaint.getCid());
		complaintService.delete(complaint);
		return "deleteSuccess";
	}
	
	public String findComplaintByUid(){
		PageBean1<Complaint> pageBean = complaintService.findByPage(currPage);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findComplaintByUid";
	}
	
	public String deleteByUser(){
		complaint = complaintService.findById(complaint.getCid());
		complaintService.delete(complaint);
		return "deleteSuccessByUser";
	}
}
