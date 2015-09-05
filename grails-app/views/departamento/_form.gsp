<%@ page import="com.softrain.Departamento" %>



			<div class="${hasErrors(bean: departamentoInstance, field: 'nombre', 'error')} required">
				<label for="nombre" class="control-label"><g:message code="departamento.nombre.label" default="Nombre" /><span class="required-indicator">*</span></label>
				<div>
					<g:textField class="form-control" name="nombre" maxlength="15" required="" value="${departamentoInstance?.nombre}"/>
					<span class="help-inline">${hasErrors(bean: departamentoInstance, field: 'nombre', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: departamentoInstance, field: 'detalle', 'error')} ">
				<label for="detalle" class="control-label"><g:message code="departamento.detalle.label" default="Detalle" /></label>
				<div>
					<g:textField class="form-control" name="detalle" value="${departamentoInstance?.detalle}"/>
					<span class="help-inline">${hasErrors(bean: departamentoInstance, field: 'detalle', 'error')}</span>
				</div>
			</div>

			<div class="${hasErrors(bean: departamentoInstance, field: 'webPage', 'error')} ">
				<label for="webPage" class="control-label"><g:message code="departamento.webPage.label" default="Web Page" /></label>
				<div>
					<g:field class="form-control" type="url" name="webPage" value="${departamentoInstance?.webPage}"/>
					<span class="help-inline">${hasErrors(bean: departamentoInstance, field: 'webPage', 'error')}</span>
				</div>
			</div>

