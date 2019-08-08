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
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>List</title>
    <script src="<%=basePath%>/front/js/bootstrap/bootstrap.js"></script>
    <link rel="stylesheet" href="<%=basePath%>/front/css/bootstrap/bootstrap.css">
</head>
<body>


<form class="form-inline" role="form">
    <div class="form-group ">
        <label class="sr-only" for="strValue">关键字</label>
        <input type="text" class="form-control " id="strValue" value="" placeholder="搜索编号或姓名">
        <a href="javascript:search();" class="btn btn-success">搜索</a>
        <a class="btn btn-info" data-toggle="modal" data-target="#AddWorkerModal">增加</a>
    </div>
</form>


<table class="table table-hover table-bordered" id="orList" width="100%" border=1>
    <thead>
    <tr>
        <td>订单号</td>
        <td>用户名</td>
        <td>物品</td>
        <td>价格</td>
        <td>数量</td>
        <td>日期</td>
    </tr>
    </thead>
    <c:forEach items="${orderList}" var="order">
        <tr>
            <td class="order_id"><c:out value="${order.order_id}"/></td>
            <td class="people_name"><c:out value="${order.people_name}"/></td>
            <td class="order_name"><c:out value="${order.order_name}"/></td>
            <td class="price"><c:out value="${order.price}"/></td>
            <td class="number"><c:out value="${order.number}"/></td>
            <td class="Date"><fmt:formatDate value="${order.date}" pattern="yyyy-MM-dd HH:mm:ss"/></td>

            <td>
                <a data-toggle="modal" data-target="#UpdWorkerModal" type="button" class="btn btn-primary xiugai">修改</a>
                <a class="btn btn-warning deleteWorker">清理门户</a>
            </td>

        </tr>
    </c:forEach>

</table>
</body>
</html>
