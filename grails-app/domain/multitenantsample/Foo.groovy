package multitenantsample

import grails.gorm.MultiTenant
import grails.gorm.multitenancy.Tenants
import grails.rest.Resource

@Resource(uri='/foos')
class Foo implements MultiTenant<Foo> {

    String tenantId = Tenants.currentId()
    String name

    static constraints = {
        name unique: true
    }
}
