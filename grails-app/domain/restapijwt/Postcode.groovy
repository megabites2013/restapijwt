package restapijwt

import grails.plugin.springsecurity.annotation.Secured
import grails.rest.*

@Secured(['ROLE_ADMIN'])
@Resource(readOnly = false, formats = ['json'])
class Postcode {

    String name

    static constraints = {
        name nullable: false
    }

}