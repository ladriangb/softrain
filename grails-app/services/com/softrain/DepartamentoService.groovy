package com.softrain

import grails.transaction.Transactional

/**
 * DepartamentoService
 * A service class encapsulates the core business logic of a Grails application
 */

@Transactional(readOnly = true)
class DepartamentoService {

    @Transactional(rollbackFor=Exception.class)
    def serviceMethod() {

    }
    def obtenerUbicacion () {
        return "Ubicación: Torre Exa. Softrain"
    }
    public guardarUbicacion(){
        return "Guardado"
    }
    
}
