package composite.id.unique


import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class UniqueWithCompositeIdSpec extends Specification {

    void "test something"() {
        expect:
        new UniqueWithCompositeId(firstName: 'John', lastName: 'Doe').save(flush: true)
    }
}
