package com.tenements.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tenements.domain.Houses;
import com.tenements.domain.PageBean1;
import com.tenements.domain.User;
import com.tenements.domain.Water;
import com.tenements.service.FeeService;
import com.tenements.service.HousesService;
import com.tenements.service.UserService;
import com.tenements.service.WaterService;

public class WaterAction extends ActionSupport implements ModelDriven<Water>{
	private Water water = new Water();
	public Water getModel(){
		return water;
	}
	
	private Integer currPage = 1;
	
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	private WaterService waterService;
	private HousesService housesService;
	private FeeService feeService;
	
	public void setWaterService(WaterService waterService) {
		this.waterService = waterService;
	}

	public void setHousesService(HousesService housesService) {
		this.housesService = housesService;
	}
	
	public void setFeeService(FeeService feeService) {
		this.feeService = feeService;
	}

	public String findAll(){
		PageBean1<Water> pageBean = waterService.findByPage(currPage);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}

	public String saveUI(){
		List<Houses> list = housesService.findAll();
		ActionContext.getContext().getValueStack().set("list", list);
		return "saveUI";
	}

	public String save(){
		waterService.save(water);
		return "saveSuccess";
	}
	
	public String edit(){
		water = waterService.findById(water.getWid());
		
		List<Houses> list = housesService.findAll();
		ActionContext.getContext().getValueStack().set("list", list);
		return "editSuccess";
	}
	
	public String update(){
		waterService.update(water);
		return "updateSuccess";
	}
	
	public String delete(){
		water = waterService.findById(water.getWid());
		waterService.delete(water);
		return "deleteSuccess";
	}
	
	public String findWaterByUid(){
		PageBean1<Water> pageBean = waterService.findByPage(currPage);
		ActionContext.getContext().getValueStack().push(pageBean);
		ActionContext.getContext().getSession().put("existFee", feeService.getFee());
		return "findWaterByUid";
	}
}