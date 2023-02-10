<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 2/10/2023
  Time: 6:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/calculator" method="post">
    <div class="mb-2">
      <label for="pd">Nhập số đầu tiên</label>
      <input type="number" name="n1" id="pd">
    </div>
    <div>
      <p>Hãy nhập phép tính</p>
      <select name="operators">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
      </select>
    </div>
    <div class="mb-2">
      <label for="lp">Nhập số thứ hai</label>
      <input type="number" name="n2" id="lp">
    </div>
    <input type="submit" value="Kiểm tra kết quả">
  </form>
  <p>${result}</p>
  </body>
</html>
