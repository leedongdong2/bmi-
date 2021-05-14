<%@page import="java.util.List"%>
<%@page import="Mdata.MemberController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String mid = request.getParameter("loginId");
String mpwd = request.getParameter("loginPwd");
MemberController mc = new MemberController();
List<String> list = mc.login(mid, mpwd);

if(list == null){
	out.print("{\"log\":\"false\"}");
}else if(list != null){
	session.setAttribute("mid", list.get(0));
	session.setAttribute("mpwd", list.get(1));
	String str = String.format("{\"log\":\"true\",\"gender\":\"%s\",\"age\":\"%s\"}",list.get(2),list.get(3));
	out.print(str);
}



%>