package multitenantsample

import grails.gorm.MultiTenant
import grails.rest.Resource

@Resource(uri='/foos')
class Foo {

    String name

    static constraints = {
        name unique: true
    }
}
