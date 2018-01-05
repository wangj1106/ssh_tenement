package com.tenements.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tenements.domain.Houses;
import com.tenements.domain.PageBean1;
import com.tenements.domain.User;
import com.tenements.service.FeeService;
import com.tenements.service.HousesService;
import com.tenements.service.UserService;

public class HousesAction extends ActionSupport implements ModelDriven<Houses>{
	private Houses houses = new Houses();
	public Houses getModel(){
		return houses;
	}
	
	private Integer currPage = 1;
	
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	private HousesService housesService;
	private UserService userService;
	private FeeService feeService;
	
	public void setHousesService(HousesService housesService) {
		this.housesService = housesService;
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public void setFeeService(FeeService feeService) {
		this.feeService = feeService;
	}

	public String findAll(){
		PageBean1<Houses> pageBean = housesService.findByPage(currPage);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}

	public String saveUI(){
		List<User> list = userService.findAll();
		ActionContext.getContext().getValueStack().set("list", list);
		return "saveUI";
	}

	public String save(){
		housesService.save(houses);
		return "saveSuccess";
	}
	
	public String edit(){
		houses = housesService.findById(houses.getHid());
		
		List<User> list = userService.findAll();
		ActionContext.getContext().getValueStack().set("list", list);
		return "editSuccess";
	}
	
	public String update(){
		housesService.update(houses);
		return "updateSuccess";
	}
	
	public String delete(){
		houses = housesService.findById(houses.getHid());
		housesService.delete(houses);
		return "deleteSuccess";
	}
	
	public String findHousesByUid(){
		PageBean1<Houses> pageBean = housesService.findByPage(currPage);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findHousesByUid";
	}
	
	public String findTenementsFee(){
		PageBean1<Houses> pageBean = housesService.findByPage(currPage);
		ActionContext.getContext().getValueStack().push(pageBean);
		ActionContext.getContext().getSession().put("existFee", feeService.getFee());
		return "findTenementsFee";
	}
}
