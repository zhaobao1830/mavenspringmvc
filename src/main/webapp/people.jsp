<%--
  Created by IntelliJ IDEA.
  User: msi
  Date: 2019/4/23
  Time: 23:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<a href="javascript:fun1();">点击</a>
<script type="text/javascript">
    function fun1() {
        var people = {
            "name":"张三",
            "age":22
        };
        $.ajax({
            url:"jsonType",
            data:JSON.stringify(people),
            type:"post",
            contentType: "application/json;charse=UTF-8",
            dataType:"text",
            success:function(data){
                var obj = eval("(" + data + ")");
                alert(obj.name+"---"+obj.age);
            }
        })
    }
</script>
</body>
</html>
