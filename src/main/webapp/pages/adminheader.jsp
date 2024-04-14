<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Header</title>
</head>
<body>
<nav class="navbar navbar-expand-lg bg-white sticky-top navbar-light p-3 border-bottom max-height-78">
    <div class="container ">
        <a class="navbar-brand" href="${pageContext.request.contextPath}/pages/Dashboard.jsp"> <strong
                class="logoname fs-2">Gadget<span>.</span></strong></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown"
                aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class=" collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link mx-2  fs-5" aria-current="page" href="${pageContext.request.contextPath}/pages/Dashboard.jsp">Dashboard</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link mx-2   fs-5" href="${pageContext.request.contextPath}/pages/adminCategories.jsp">Categories</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link mx-2  fs-5" href="${pageContext.request.contextPath}/pages/adminproduct.jsp">Products</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link mx-2  fs-5" href="${pageContext.request.contextPath}/pages/adminusers.jsp">Users</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link mx-2   fs-5" href="${pageContext.request.contextPath}/pages/adminorder.jsp">Orders</a>
                </li>

            </ul>
            <ul class="navbar-nav ms-auto ">
                <div class="dropdown">
                    <button class="btn btn-outline-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                        <img src="${pageContext.request.contextPath}/assets/Icons/user.png" alt="user"
                             style="width: 20px;height: 20px;">
                    </button>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="#">Action</a></li>
                        <li><a class="dropdown-item" href="#">Another action</a></li>
                        <li><a class="dropdown-item" href="#">Something else here</a></li>
                    </ul>
                </div>
            </ul>
        </div>
    </div>

</nav>
<script src="../script/myscript.js"></script>
</body>
</html>



