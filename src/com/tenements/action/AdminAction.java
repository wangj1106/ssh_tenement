package com.tenements.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tenements.domain.Admin;
import com.tenements.service.AdminService;

public class AdminAction extends ActionSupport implements ModelDriven<Admin>{
	private Admin admin = new Admin();
	public Admin getModel() {
		return admin;
	}
	
	private AdminService adminService;
	
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}



//	public String login(){
//		Admin existAdmin = adminService.login(admin);
//		if(existAdmin == null){
//			this.addActionError("用户名或密码错误！");
//			return INPUT;
//		}else{
//			ActionContext.getContext().getSession().put("existAdmin", existAdmin);
//			return SUCCESS;
//		}
//	}
	
	public String login() throws IOException{
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out=response.getWriter();
		Admin existAdmin = adminService.login(admin);
//		String alert=
//				"	<script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>" + 
//				"	<script type=\"text/javascript\" src=\"js/jquery.easyui.min.js\"></script>" + 
//				"   <script>$.messager.alert(\"提示消息\", \"用户名、密码错误!\", \"info\");window.location.href=\"login.jsp\";</script>";
		if(existAdmin == null){
			//out.print(alert);
			out.print("<script>alert( \"用户名、密码错误!\");window.location.href=\"login.jsp\";</script>");
			return null;
		}else{
			ActionContext.getContext().getSession().put("existAdmin", existAdmin);
			return SUCCESS;
		}
	}
	
}
