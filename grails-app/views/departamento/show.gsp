
<%@ page import="com.softrain.Departamento" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'departamento.label', default: 'Departamento')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-departamento" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="departamento.nombre.label" default="Nombre" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: departamentoInstance, field: "nombre")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="departamento.detalle.label" default="Detalle" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: departamentoInstance, field: "detalle")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="departamento.webPage.label" default="Web Page" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: departamentoInstance, field: "webPage")}</td>
				
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
