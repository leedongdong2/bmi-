<%@page import="Mdata.MemberController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String mid = request.getParameter("mid");
MemberController mc = new MemberController();
String result = mc.idSameCheck(mid);
if(result == null){
	out.print("{\"mid\":\"false\"}");
} else if(result != null){
	out.print("{\"mid\":\"true\"}");
}
%>