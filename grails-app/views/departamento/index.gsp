
<%@ page import="com.softrain.Departamento" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'departamento.label', default: 'Departamento')}" />
	<title><g:message code="default.index.label" args="[entityName]" /></title>
</head>

<body>

<section id="index-departamento" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<g:sortableColumn property="nombre" title="${message(code: 'departamento.nombre.label', default: 'Nombre')}" />
			
				<g:sortableColumn property="detalle" title="${message(code: 'departamento.detalle.label', default: 'Detalle')}" />
			
				<g:sortableColumn property="webPage" title="${message(code: 'departamento.webPage.label', default: 'Web Page')}" />
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${departamentoInstanceList}" status="i" var="departamentoInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${departamentoInstance.id}">${fieldValue(bean: departamentoInstance, field: "nombre")}</g:link></td>
			
				<td>${fieldValue(bean: departamentoInstance, field: "detalle")}</td>
			
				<td>${fieldValue(bean: departamentoInstance, field: "webPage")}</td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${departamentoInstanceCount}" />
	</div>
</section>

</body>

</html>
