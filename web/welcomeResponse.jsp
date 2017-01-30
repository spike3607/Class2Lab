<%-- 
    Document   : welcomeResponse
    Created on : Sep 7, 2016, 6:58:36 PM
    Author     : Spike
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Response</h1>
        <p>
            <%
                Object responseObj = request.getAttribute("myMsg");
                Object errObj = request.getAttribute("errorMsg");
                
                if(responseObj != null) {
                    out.println(responseObj.toString());
                }
                
                if(errObj != null) {
                    out.println(errObj.toString());
                }
            %>
        </p>
    </body>
</html>
