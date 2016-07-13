<%--
  Created by IntelliJ IDEA.
  User: chingwenje
  Date: 7/10/16
  Time: 8:43 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Json Message</title>
    <asset:stylesheet href="jsonMessage.css"/>
    <asset:javascript src="jsonMessage.js"/>
    <script src="${resource(dir: '/lib/jquery/', file: 'jquery-1.11.1.min.js')}"></script>
</head>

<body>

<g:form id="jsonMessage" controller="jsonMessage" action="processJsonMessage">
    <div class="padding30">
        <g:if test="${flash.success}">
            <div id="success" class="error">Message successfully save to file</div>
        </g:if>
        <div class="paddingBottom15"></div>
        <div>
            <g:textArea type="text" id="message" name="message" placeholder="Input valid json" value=""/>
        </div>

        <div  class="paddingBottom15""></div>
        <g:if test="${flash.message}">
            <div id="notify" class="error">${flash.message}</div>
        </g:if>
        <div  class="paddingBottom15"></div>

        <div onclick="return validateField()"><g:submitButton name="enter" value="Submit"/>
        </div>
    </div>

</g:form>
</body>
</html>