package com.tenements.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tenements.domain.PageBean1;
import com.tenements.domain.User;
import com.tenements.service.UserService;

public class UserAction  extends ActionSupport implements ModelDriven<User>{
	private User user = new User();
	public User getModel() {
		return user;
	}
	
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	private Integer currPage = 1;
	
	
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	public String login(){
		//登陆方法确定用户是否存在
		System.out.print("login执行了");
		User existUser = userService.login(user);
		if(existUser == null){
			this.addActionError("用户名或密码错误！");
			return INPUT;
		}else{
			ActionContext.getContext().getSession().put("existUser",existUser);
			return SUCCESS;
		}
	}
	
	public String findAll(){
		PageBean1<User> pageBean = userService.findByPage(currPage);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}
	
	public String saveUI(){
		return "saveUI";
	}
	
	public String save(){
		userService.save(user);
		return "saveSuccess";
	}
	
	public String edit(){
		user = userService.findById(user.getUid());
		return "editSuccess";
	}
	
	public String update(){
		userService.update(user);
		return "updateSuccess";
	}
	
	public String delete(){
		user = userService.findById(user.getUid());
		userService.delete(user);
		return "deleteSuccess";
	}
	
	public String findSelf(){
		return "findSelf";
	}
	
	public String editSelf(){
		user = userService.findById(user.getUid());
		return "editSelfSuccess";
	}
	
	public String updateSelf(){
		userService.update(user);
		return "updateSelfSuccess";
	}
}
