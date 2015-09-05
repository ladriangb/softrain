package com.softrain


import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * DepartamentoController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Transactional(readOnly = true)
class DepartamentoController {

    def departamentoService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

	def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Departamento.list(params), model:[departamentoInstanceCount: Departamento.count()]
    }

	def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Departamento.list(params), model:[departamentoInstanceCount: Departamento.count()]
    }

    def show(Departamento departamentoInstance) {
        respond departamentoInstance
    }

    def create() {
        respond new Departamento(params)
    }

    def obtenerUbicacion() {
        render departamentoService.obtenerUbicacion()
    }

    @Transactional
    def save(Departamento departamentoInstance) {
        if (departamentoInstance == null) {
            notFound()
            return
        }

        if (departamentoInstance.hasErrors()) {
            respond departamentoInstance.errors, view:'create'
            return
        }

        departamentoInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'departamentoInstance.label', default: 'Departamento'), departamentoInstance.id])
                redirect departamentoInstance
            }
            '*' { respond departamentoInstance, [status: CREATED] }
        }
    }

    def edit(Departamento departamentoInstance) {
        respond departamentoInstance
    }

    @Transactional
    def update(Departamento departamentoInstance) {
        if (departamentoInstance == null) {
            notFound()
            return
        }

        if (departamentoInstance.hasErrors()) {
            respond departamentoInstance.errors, view:'edit'
            return
        }

        departamentoInstance.save flush:true
        Thread t= new Thread( new Runnable(){
            public void run(){}   
        });
        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Departamento.label', default: 'Departamento'), departamentoInstance.id])
                redirect departamentoInstance
            }
            '*'{ respond departamentoInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Departamento departamentoInstance) {

        if (departamentoInstance == null) {
            notFound()
            return
        }

        departamentoInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Departamento.label', default: 'Departamento'), departamentoInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'departamentoInstance.label', default: 'Departamento'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
