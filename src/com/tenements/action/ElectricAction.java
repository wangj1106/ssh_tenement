package com.tenements.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tenements.domain.Electric;
import com.tenements.domain.Houses;
import com.tenements.domain.PageBean1;
import com.tenements.domain.User;
import com.tenements.domain.Water;
import com.tenements.service.ElectricService;
import com.tenements.service.FeeService;
import com.tenements.service.HousesService;
import com.tenements.service.UserService;

public class ElectricAction extends ActionSupport implements ModelDriven<Electric>{
	private Electric electric = new Electric();
	public Electric getModel(){
		return electric;
	}
	
	private Integer currPage = 1;
	
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	private ElectricService electricService;
	private HousesService housesService;
	private FeeService feeService;
	
	public void setElectricService(ElectricService electricService) {
		this.electricService = electricService;
	}

	public void setHousesService(HousesService housesService) {
		this.housesService = housesService;
	}
	
	public void setFeeService(FeeService feeService) {
		this.feeService = feeService;
	}

	public String findAll(){
		PageBean1<Electric> pageBean = electricService.findByPage(currPage);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}

	public String saveUI(){
		List<Houses> list = housesService.findAll();
		ActionContext.getContext().getValueStack().set("list", list);
		return "saveUI";
	}

	public String save(){
		electricService.save(electric);
		return "saveSuccess";
	}
	
	public String edit(){
		electric = electricService.findById(electric.getEid());
		
		List<Houses> list = housesService.findAll();
		ActionContext.getContext().getValueStack().set("list", list);
		return "editSuccess";
	}
	
	public String update(){
		electricService.update(electric);
		return "updateSuccess";
	}
	
	public String delete(){
		electric = electricService.findById(electric.getEid());
		electricService.delete(electric);
		return "deleteSuccess";
	}
	
	public String findElectricByUid(){
		PageBean1<Electric> pageBean = electricService.findByPage(currPage);
		ActionContext.getContext().getValueStack().push(pageBean);
		ActionContext.getContext().getSession().put("existFee", feeService.getFee());
		return "findElectricByUid";
	}
}