<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<%--<%@ page language="java" contentType="text/html;charset=UTF-8"  isELIgnored="false" %>--%>
<%--
  Created by IntelliJ IDEA.
  User: Will
  Date: 2019/6/8
  Time: 23:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改商品信息</title>
</head>
<body>
<%--显示错误信息--%>
<c:if test="${allErrors!=null&&allErrors.size()>0}">
    <c:forEach items="${allErrors}" var="error">
        ${error.defaultMessage}<br/>
    </c:forEach>
</c:if>
<form id="itemForm"	action="${pageContext.request.contextPath }/Comm/editCommSubmit" method="post" enctype="multipart/form-data" >
    <input type="hidden" name="comm_id" value="${commCustom.comm_id}" /> 修改商品信息：
    <table width="100%" border=1>
        <tr>
            <td>商品编号</td>
            <td><input disabled type="text" name="comm_id" value="${commCustom.comm_id}"/></td>
        </tr>
        <tr>
            <td>商品名称</td>
            <td><input type="text" name="comm_name" value="${commCustom.comm_name}"/></td>
        </tr>
        <tr>
            <td>商品价格</td>
            <td><input type="text" name="comm_price" value="${commCustom.comm_price}"/></td>
        </tr>
        <tr>
            <td>商品生产日期</td>
           <td><input type="text" name="date" value="<fmt:formatDate value="${commCustom.date}" pattern="yyyy-MM-dd "/>"/></td>
        </tr>
        <%--<tr>--%>
            <%--<td>商品图片</td>--%>
            <%--<td>--%>
                <%--<c:if test="${commCustom.comm_pic!=null}">--%>
                    <%--<img src="/pic/${comm.pic}" width="100" height="100">--%>
                <%--</c:if>--%>
                <%--<input type="file" name="comm_pic"/>&lt;%&ndash;与控制器层的相同&ndash;%&gt;--%>
            <%--</td>--%>
        <%--</tr>--%>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="提交" />
            </td>
        </tr>
    </table>

</form>
</body>
</html>
