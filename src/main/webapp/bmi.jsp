<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body style="font-size: 30px;">
	<form action="bmi.do">

		<fieldset>
			<legend>计算BMI指数</legend>
			身高（米）:<input name="height" /></br> 体重(公斤):<input name="weight" /></br> 性别：男<input
				type="radio" name="gender" value="m" checked="checked" /> 女<input
				type="radio" name="gender" value="f" checked="checked" /> <br>
			<input type="submit" value="确定" />
		</fieldset>
	</form>

</body>
</html>