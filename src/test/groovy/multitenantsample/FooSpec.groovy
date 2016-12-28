package multitenantsample

import grails.test.mixin.Mock
import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Specification
/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
@Mock([Foo])
class FooSpec extends Specification {

    def setup() {
        //Tenants.metaClass.static.currentId = { ConnectionSource.DEFAULT }
    }

    void "test save foo"() {
        given:
        new Foo(name: 'foo1').save(flush: true, failOnError: true)

        expect:
        Foo.count == 1
    }
}