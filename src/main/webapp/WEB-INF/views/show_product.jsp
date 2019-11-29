<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/29
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>show product</title>
</head>
<body>
    <h2>Welcome ${sessionScope.username}</h2>
    <ul>
        <c:forEach items="${productsFromServer}" var="product">
            <li>${product.pname}:${product.price}:
                    <fmt:formatDate value="${product.pdate}" pattern="yyyy年MM月dd日" />
            </li>
        </c:forEach>
    </ul>
</body>
</html>
