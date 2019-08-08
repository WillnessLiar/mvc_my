<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    %>
    <title>json交互测试</title>
    <script type="text/javascript" src="<%=basePath%>/front/js/jquery-3.3.1.js"></script>

    <script type="text/javascript">
        // 请求json，输出json
        function requestJson() {

            $.ajax({
                contentType : "application/json;charset=utf-8",
                type: "post",
                url: "${pageContext.request.contextPath}/requestJson",

                // 数据格式是json串
                dataType:"json",
                data:JSON.stringify({comm_name:"tre4",comm_price:999}),
                success: function (data) {
                    alert(data);
                }
            });
        }

        // 请求key/value，输出json
        function responseJson() {
            $.ajax({
                type: 'post',
                url: '${pageContext.request.contextPath}/responseJson',
                contentType: "application/json;charset=utf-8",
                // 数据格式是json串
                data: 'comm_name=werwe&comm_price=999',
                success: function (data) {
                    alert(data);
                }
            });
        }


    </script>

</head>
<body>
<input type="button" onclick="requestJson()" value="请求json，输出json">
<input type="button" onclick="responseJson()" value="请求key/value，输出json">


</body>
</html>
