<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    %>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>商品信息</title>
    <script type="text/javascript" src="<%=basePath%>/front/js/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="<%=basePath%>/front/js/bootstrap/bootstrap.js"></script>
    <link rel="stylesheet" href="<%=basePath%>/front/css/bootstrap/bootstrap.css">
    <link href="<%=basePath%>/front/css/workerinfo.css" rel="stylesheet"/>
    <script type="text/javascript">
        function deleteComm() {
            document.commForm.jsp = "${pageContext.request.contextPath }/Comm/deleteComm"
            document.commForm.submit();
        }

        function queryComm() {
            document.commForm.jsp = "${pageContext.request.contextPath }/Comm/queryComm"
            document.commForm.submit();
        }
    </script>


</head>
<body>

<%--当前用户：${username},--%>
<%--<c:if test="${username!=null}">--%>
<%--<a href="/logout">退出</a>--%>
<%--</c:if>--%>

<div class="container-fluid" style="margin-top: 2vw">
    <form name="commForm" action="${pageContext.request.contextPath }/Comm/queryComm" method="post">
        <table>
            <tr>
                <%--<label class="sr-only"  for="strValue">关键字:</label>--%>
                <td>商品名称:<input name="commCustom.comm_name"/>
<%--                    商品类型：<select name="itemsType">--%>
<%--                        <c:forEach items="${itemsTypes}" var="itemsType">--%>
<%--                            <option value="${itemsType.key}">${itemsType.value}</option>--%>
<%--                        </c:forEach>--%>
<%--                    </select>--%>
                </td>
                <td><input type="button" value="搜索"
                           onclick="queryComm()" <%--class="form-control" id="strValue"  placeholder="搜索编号或名称"--%>>
                    <input type="button" value="删除" onclick="deleteComm()"/>
                </td>
                <%--<a href="javascript:search();" class="btn btn-success">搜索</a>--%>
                <%--<a class="btn btn-info" data-toggle="modal" data-target="#AddWorkerModal">增加</a>--%>


            </tr>
        </table>
    </form>

    <table class="table table-responsive table-bordered" id="commList" width="100%" border=1>
        <thead>
        <tr>
            <td>选择</td>
            <td>编号</td>
            <td>商品名</td>
            <td>商品单价</td>
            <td>日期</td>
            <td>操作</td>
        </tr>
        </thead>
        <c:forEach items="${commList}" var="comm">
            <tr>
                <td><input type="checkbox" name="comm_id" value="${comm.comm_id}"></td>
                <td class="comm_Id"><c:out value="${comm.comm_id}"/></td>
                <td class="comm_Name"><c:out value="${comm.comm_name}"/></td>
                <td class="comm_Price"><c:out value="${comm.comm_price}"/></td>
                <td class="date"><fmt:formatDate value="${comm.date}" pattern="yyyy-MM-dd"/></td>
                    <%--<td class="date"><fmt:formatDate value="${comm.date}" pattern="yyyy-MM-dd HH:mm:ss"/></td>--%>

                <td>
                    <a href="${pageContext.request.contextPath }/Comm/editComm?comm_id=${comm.comm_id}">修改</a>
                        <%--<a class="btn btn-success modiCus" data-toggle="modal"--%>
                        <%--data-target="#UpdCusModal">修改</a>--%>
                        <%--<a class="btn btn-danger" onclick="return confirm('确定删除?')">删除</a>--%>
                </td>

            </tr>
        </c:forEach>
    </table>
</div>

<%--&lt;%&ndash;修改弹窗&ndash;%&gt;--%>
<%--<div class="modal fade" style="font-family: 幼圆" id="UpdCusModal" tabindex="-1" role="dialog" aria-labelledby="publicModal " aria-hidden="true">--%>
<%--<div class="modal-dialog">--%>
<%--<div class="modal-content">--%>
<%--<div class="modal-header">--%>
<%--<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>--%>
<%--<h4 style="text-align: center">修改用户信息</h4>--%>
<%--</div>--%>
<%--<div class="modal-body">--%>
<%--<div class="row margin_1">--%>
<%--<div class="col-lg-12 col-xs-12">--%>
<%--<form action="" method="post" name="form1">--%>
<%--<table class="table table-responsive table-bordered table-hover p1">--%>

<%--<tr>--%>
<%--<td align="right">--%>
<%--员工编号--%>
<%--</td>--%>
<%--<td align="left">--%>
<%--<div class="row">--%>
<%--<div class="col-lg-7 col-md-7 col-sm-7 col-xs-7">--%>
<%--<input class="form-control " type="text" name="NO" id="workerId"--%>
<%--size="20" disabled>--%>
<%--</div>--%>
<%--</div>--%>
<%--</td>--%>
<%--</tr>--%>
<%--<tr>--%>
<%--<td align="right">--%>
<%--员工姓名--%>
<%--</td>--%>
<%--<td align="left">--%>
<%--<div class="row">--%>
<%--<div class="col-lg-7 col-md-7 col-sm-7 col-xs-7">--%>
<%--<input class="form-control " type="text" name="name"--%>
<%--id="workerName"--%>
<%--size="20">--%>
<%--</div>--%>
<%--</div>--%>
<%--</td>--%>
<%--</tr>--%>
<%--<tr>--%>
<%--<td align="right">--%>
<%--电话号码--%>
<%--</td>--%>
<%--<td align="left">--%>
<%--<div class="row">--%>
<%--<div class="col-lg-7 col-md-7 col-sm-7 col-xs-7">--%>
<%--<input class="form-control " type="text" name="telphone"--%>
<%--id="workerPhone" size="20">--%>
<%--</div>--%>
<%--</div>--%>
<%--</td>--%>
<%--</tr>--%>
<%--<tr>--%>
<%--<td align="right">--%>
<%--住址--%>
<%--</td>--%>
<%--<td align="left">--%>
<%--<div class="row">--%>
<%--<div class="col-lg-9 col-sm-9 col-xs-9">--%>
<%--<input class="form-control " type="text" name="address"--%>
<%--id="address"--%>
<%--size="40">--%>
<%--</div>--%>
<%--</div>--%>
<%--</td>--%>
<%--</tr>--%>
<%--<tr>--%>
<%--<td align="right">--%>
<%--状态--%>
<%--</td>--%>
<%--<td align="left">--%>
<%--<div class="row">--%>
<%--<div class="col-lg-4 col-sm-4 col-xs-4">--%>
<%--<select class="form-control">--%>
<%--<option class="status" name="status" value="inwork">在职--%>
<%--</option>--%>
<%--<option class="status" name="status" value="outwork">离职--%>
<%--</option>--%>
<%--</select>--%>
<%--</div>--%>
<%--</div>--%>
<%--</td>--%>
<%--</tr>--%>
<%--<tr>--%>
<%--<td align="right">--%>
<%--职位--%>
<%--</td>--%>
<%--<td align="left">--%>
<%--<div class="row">--%>
<%--<div class="col-lg-4 col-xs-6">--%>
<%--<select class="form-control ">--%>
<%--<option class="zhiwei" name="dengji" value="cleaner">保洁员--%>
<%--</option>--%>
<%--<option class="zhiwei" name="dengji" value="manager">经理--%>
<%--</option>--%>
<%--<option class="zhiwei" name="dengji" value="waiter">服务员--%>
<%--</option>--%>
<%--<option class="zhiwei" name="dengji" value="man">保安</option>--%>
<%--<option class="zhiwei" name="dengji" value="lady">前台--%>
<%--</option>--%>
<%--</select>--%>
<%--</div>--%>
<%--</div>--%>
<%--</td>--%>
<%--</tr>--%>
<%--<tr>--%>
<%--<td align="right">--%>
<%--性别--%>
<%--</td>--%>
<%--<td align="left">--%>
<%--<input name="sex" class="sex" type="radio" value="male" checked>--%>
<%--&lt;%&ndash;<label for="radio" style="font-weight: 100">&ndash;%&gt;--%>
<%--男--%>
<%--</label>--%>
<%--<input type="radio" class="sex" name="sex" value="female">--%>
<%--&lt;%&ndash;<label for="radio" style="font-weight: 100">&ndash;%&gt;--%>
<%--女--%>
<%--</label>--%>
<%--</td>--%>
<%--</tr>--%>
<%--<tr>--%>
<%--<th colspan="2" align="center" style="text-align: center">--%>
<%--<a class="btn btn-success" id="updWorker">确认修改</a>--%>
<%--&nbsp;--%>
<%--&nbsp;--%>
<%--<input class="btn btn-default" name="Input" type="button" value="返回"--%>
<%--onClick="">--%>
<%--<input name="action" type="hidden" value="201"/>--%>
<%--</th>--%>

<%--</tr>--%>
<%--</table>--%>
<%--</form>--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>
<%--&lt;%&ndash;修改弹窗结束&ndash;%&gt;--%>
</body>
</html>
