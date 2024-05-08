<%@ page import="com.icp.gadgets.utils.StringUtils" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="../styles/css/login.css">
    <script src="../script/toast.script.js"></script>
    <style>
        .toast-notification {
            position: fixed;
            text-decoration: none;
            z-index: 999999;
            max-width: 300px;
            background-color: #fff;
            box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.12);
            border-radius: 4px;
            display: flex;
            padding: 10px;
            transform: translate(0, -150%);
        }
        .toast-notification .toast-notification-wrapper {
            flex: 1;
            padding-right: 10px;
            overflow: hidden;
        }
        .toast-notification .toast-notification-wrapper .toast-notification-header {
            padding: 0 0 5px 0;
            margin: 0;
            font-weight: 500;
            font-size: 14px;
            word-break: break-all;
            color: #4f525a;
        }
        .toast-notification .toast-notification-wrapper .toast-notification-content {
            font-size: 14px;
            margin: 0;
            padding: 0;
            word-break: break-all;
            color: #4f525a;
        }
        .toast-notification .toast-notification-close {
            appearance: none;
            border: none;
            background: transparent;
            cursor: pointer;
            font-size: 24px;
            line-height: 24px;
            padding-bottom: 4px;
            font-weight: bold;
            color: rgba(0, 0, 0, 0.2);
        }
        .toast-notification .toast-notification-close:hover {
            color: rgba(0, 0, 0, 0.4);
        }
        .toast-notification.toast-notification-top-center {
            transform: translate(calc(50vw - 50%), -150%);
        }
        .toast-notification.toast-notification-bottom-left, .toast-notification.toast-notification-bottom-right {
            transform: translate(0, 150%);
        }
        .toast-notification.toast-notification-bottom-center {
            transform: translate(calc(50vw - 50%), 150%);
        }
        .toast-notification.toast-notification-dark {
            background-color: #2d2e31;
        }
        .toast-notification.toast-notification-dark .toast-notification-wrapper .toast-notification-header {
            color: #edeff3;
        }
        .toast-notification.toast-notification-dark .toast-notification-wrapper .toast-notification-content {
            color: #edeff3;
        }
        .toast-notification.toast-notification-dark .toast-notification-close {
            color: rgba(255, 255, 255, 0.2);
        }
        .toast-notification.toast-notification-dark .toast-notification-close:hover {
            color: rgba(255, 255, 255, 0.4);
        }
        .toast-notification.toast-notification-success {
            background-color: #C3F3D7;
            border-left: 4px solid #51a775;
        }
        .toast-notification.toast-notification-success .toast-notification-wrapper .toast-notification-header {
            color: #51a775;
        }
        .toast-notification.toast-notification-success .toast-notification-wrapper .toast-notification-content {
            color: #51a775;
        }
        .toast-notification.toast-notification-success .toast-notification-close {
            color: rgba(0, 0, 0, 0.2);
        }
        .toast-notification.toast-notification-success .toast-notification-close:hover {
            color: rgba(0, 0, 0, 0.4);
        }
        .toast-notification.toast-notification-error {
            background-color: #f3c3c3;
            border-left: 4px solid #a75151;
        }
        .toast-notification.toast-notification-error .toast-notification-wrapper .toast-notification-header {
            color: #a75151;
        }
        .toast-notification.toast-notification-error .toast-notification-wrapper .toast-notification-content {
            color: #a75151;
        }
        .toast-notification.toast-notification-error .toast-notification-close {
            color: rgba(0, 0, 0, 0.2);
        }
        .toast-notification.toast-notification-error .toast-notification-close:hover {
            color: rgba(0, 0, 0, 0.4);
        }
        .toast-notification.toast-notification-verified {
            background-color: #d0eaff;
            border-left: 4px solid #6097b8;
        }
        .toast-notification.toast-notification-verified .toast-notification-wrapper .toast-notification-header {
            color: #6097b8;
        }
        .toast-notification.toast-notification-verified .toast-notification-wrapper .toast-notification-content {
            color: #6097b8;
        }
        .toast-notification.toast-notification-verified .toast-notification-close {
            color: rgba(0, 0, 0, 0.2);
        }
        .toast-notification.toast-notification-verified .toast-notification-close:hover {
            color: rgba(0, 0, 0, 0.4);
        }
        .toast-notification.toast-notification-dimmed {
            opacity: .3;
        }
        .toast-notification.toast-notification-dimmed:hover, .toast-notification.toast-notification-dimmed:active {
            opacity: 1;
        }
    </style>
</head>
<body>
<div class="center">
    <div class="container">
        <div class="text">Login Form</div>

        <%--jsp error show--%>
        <%
            String errorMessage = (String) request.getParameter(StringUtils.ERROR_MESSAGE);

            if (errorMessage != null && !errorMessage.isEmpty()) {
        %>
        <script>
            const toasts = new Toasts({
                width: 300,
                timing: 'ease',
                duration: '.5s',
                dimOld: false,
                position: 'top-right' // top-left | top-center | top-right | bottom-left | bottom-center | bottom-right
            });
            toasts.push({
                title:"Error",
                content:"<%=errorMessage%>",
                style:'error'
            })
        </script>
<%--        <div class="alert alert-danger" role="alert">--%>
<%--            <i class="fa-solid fa-circle-xmark"  style="color: #ff0000; font-size: 2em; padding-left: 15px;"></i>--%>
<%--            <span style="padding-left: 5px; color: #ff0000;"><%=errorMessage%></span>--%>
<%--        </div>--%>
        <%
            }
        %>
        <%--jsp error show--%>
        <form action="<%=request.getContextPath()%>/login-servlet" method="post">
            <div class="data">
                <label>Username</label>
                <input type="text" name="username" required>
            </div>
            <div class="data">
                <label>Password</label>
                <input type="password" name="password" required>
            </div>
            <div class="btn">
                <div class="inner"></div>
                <button type="submit" style="background:  #f06412">login</button>
            </div>
            <div class="signup-link">
                Not a member? <a href="register.jsp">Register now</a>
            </div>
        </form>
    </div>
</div>

<script src="https://kit.fontawesome.com/0b8996398e.js" crossorigin="anonymous"></script>
</body>
</html>
