<%--
  Created by IntelliJ IDEA.
  User: MSI
  Date: 2018/12/10
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/js/jquery-3.3.1.js"></script>

</head>
<body>
    <button id="ajaxResponse">提交</button>
</body>
<script>
    $(function () {
        $("#ajaxResponse").click(function () {
            $.ajax({
                // method:"post",
                // url:"/ajaxResponse.do",
                // data:{name:"jack",age:26},
                // dataType:"json",
                // success:function (result) {
                //     alert(result.name + "," + result.age)
                // }


                method:"post",
                url:"/returnObject.do",
                success:function (result) {
                    alert(result)
                }
            })


        })
    })


</script>
</html>
