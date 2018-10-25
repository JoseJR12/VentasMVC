<%-- 
    Document   : formPersona
    Created on : 03/10/2018, 11:47:27 AM
    Author     : LAB_SOFTWARE-DTI
--%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
<!-- Main content -->
<section class="content">    
<div class="card">

<div class="card-body">
    <c:url var="urlsave" value="${pageContext.request.contextPath}/guardarVenta" />
    <frm:form modelAttribute="modeloVenta" method="post" action="${urlsave}" class="form/horizontal">
        <table>
            <tr>
                <td><frm:label path="id_persona">id_persona</frm:label> </td>
                <td><frm:input path="id_persona" class="form-control" /></td>
            </tr>
            <tr>
                <td><frm:label path="nombre">Nombre</frm:label> </td>
                <td><frm:input path="nombre" class="form-control"  /></td>
            </tr>
            <tr>
                <td><frm:label path="apellidos">apellidos</frm:label> </td>
                <td><frm:input path="apellidos" class="form-control" /></td>
            </tr>
            <tr>
                <td><frm:label path="DNI">DNI</frm:label> </td>
                <td><frm:input path="DNI" class="form-control" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Guardar" class="btn btn-primary" /></td>
            </tr>
            
        </table>
    </frm:form>
</div>
</div>
</section>        
</div>    