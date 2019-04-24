<%@page language="java" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <base href="/mook_course">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>登录页面</title>
    <style type="text/css">
        .code {
            /*background: url(code_bg.jpg);*/
            font-family: Arial;
            font-style: italic;
            color: blue;
            font-size: 20px;
            border: 0;
            padding: 2px 3px;
            letter-spacing: 3px;
            font-weight: bolder;
            float: left;
            cursor: pointer;
            width: 40px;
            height: 20px;
            line-height: 20px;
            text-align: center;
            vertical-align: middle;
        }

        a {
            text-decoration: none;
            font-size: 12px;
            color: #288bc4;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
    <script type="text/javascript" src="mook_course/resources/js/dataTable/jquery-3.3.1.js"></script>
</head>
<body>
<center>

    <h1>用户登录</h1>

    <div>
        <table width="300px" cellspacing="0px" cellpadding="0px" border="1px">
            <tr>
                <td>用户名</td>
                <td colspan="2"><input type="text" name="username" placeholder="用户名为3-12位字母数字或下划线组合"></td>
            </tr>
            <tr>
                <td>密&nbsp;码</td>
                <td colspan="2"><input type="password" name="password" placeholder="长度为5-12位字母数字或下划线组合"></td>
            </tr>
            <tr>
                <td>验证码</td>
                <td style="border-right-style:none;">
                    <input type="text" name="checkCode" placeholder="请输入验证码" id="inputCode">

                </td>
                <td style="border-left-style:none;">
                    <div class="code" id="checkCode">
                    </div>
                    <img src="http://localhost:8080/mook_course/kaptcha.jpg" id="changecode"/>

                </td>
            </tr>
            <tr>
                <td colspan="3" style="text-align:center">
                    <input type="submit" value="登录">
                    <input type="reset" value="取消">
                </td>
            </tr>
        </table>
    </div>
</center>

<script type="text/javascript">
    // alert(code);
    $("#changecode").on("click",function(){
        $(this).attr("src","http://localhost:8080/mook_course/kaptcha.jpg?d="+new Date().getTime());
    });
    $("input[type='submit']").click(function () {
        var code = $("input[name='checkCode']").val();
        var username = $("input[name='username']").val();
        var password =$("input[name='password']").val();
        $.ajax({
            "url":"mook_course/login",
            "data":{"code":code,"username":username,"password":password},
            "type":"post",
            "dataType":"json",
            "success":function (data) {
                console.log(data);
                window.location.replace("http://localhost:8080/mook_course/pages/admin/server.jsp");
            },
            "error":function (err) {
                alert("信息有误");
                window.location.replace("http://localhost:8080/mook_course/");
                console.log(err);
            }
        });
    })
</script>
</body>
</html>