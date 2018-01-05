package com.tenements.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tenements.domain.Fee;
import com.tenements.domain.Houses;
import com.tenements.domain.PageBean1;
import com.tenements.domain.User;
import com.tenements.service.FeeService;
import com.tenements.service.HousesService;
import com.tenements.service.UserService;

public class FeeAction extends ActionSupport implements ModelDriven<Fee>{
	private Fee fee = new Fee();
	public Fee getModel(){
		return fee;
	}
	
	private Integer currPage = 1;
	
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	private FeeService feeService;
	
	public void setFeeService(FeeService feeService) {
		this.feeService = feeService;
	}

	public String findAll(){
		PageBean1<Fee> pageBean = feeService.findByPage(currPage);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}

	public String save(){
		feeService.save(fee);
		return "saveSuccess";
	}
	
	public String edit(){
		fee = feeService.findById(fee.getFid());
		return "editSuccess";
	}
	
	public String update(){
		feeService.update(fee);
		return "updateSuccess";
	}
}
