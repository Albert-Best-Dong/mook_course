<%--
  Created by IntelliJ IDEA.
  User: dzhum
  Date: 2019/4/20
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>

<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();

    request.setAttribute("basePath", basePath);
%>
