package com.tenements.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tenements.domain.Repair;
import com.tenements.domain.PageBean1;
import com.tenements.domain.User;
import com.tenements.service.RepairService;
import com.tenements.service.UserService;

public class RepairAction extends ActionSupport implements ModelDriven<Repair>{
	private Repair repair = new Repair();
	public Repair getModel(){
		return repair;
	}
	
	private Integer currPage = 1;
	
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	private RepairService repairService;
	private UserService userService;
	
	public void setRepairService(RepairService repairService) {
		this.repairService = repairService;
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String findAll(){
		PageBean1<Repair> pageBean = repairService.findByPage(currPage);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}

	public String saveUI(){
		List<User> list = userService.findAll();
		ActionContext.getContext().getValueStack().set("list", list);
		return "saveUI";
	}

	public String save(){
		repairService.save(repair);
		return "saveSuccess";
	}
	
	public String edit(){
		repair = repairService.findById(repair.getRid());
		
		List<User> list = userService.findAll();
		ActionContext.getContext().getValueStack().set("list", list);
		return "editSuccess";
	}
	
	public String update(){
		repairService.update(repair);
		return "updateSuccess";
	}
	
	public String delete(){
		repair = repairService.findById(repair.getRid());
		repairService.delete(repair);
		return "deleteSuccess";
	}
	
	public String findRepairByUid(){
		PageBean1<Repair> pageBean = repairService.findByPage(currPage);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findRepairByUid";
	}
	
	public String deleteByUser(){
		repair = repairService.findById(repair.getRid());
		repairService.delete(repair);
		return "deleteSuccessByUser";
	}
}
