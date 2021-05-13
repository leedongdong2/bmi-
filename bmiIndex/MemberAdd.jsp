<%@page import="Mdata.MemberController"%>
<%@page import="Mdata.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
request.setCharacterEncoding("utf-8");
String mid = request.getParameter("mid");
String password = request.getParameter("password");
String email = request.getParameter("email");
int age = Integer.parseInt(request.getParameter("age"));
String gender = request.getParameter("gender");


Member m = new Member();
m.setMid(mid);
m.setPassword(password);
m.setEmail(email);
m.setAge(age);
m.setGender(gender);


MemberController mc = new MemberController();
String result = mc.MemberAdd(m);

out.print(result);


%>




