package composite.id.unique


import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class UniqueWithoutCompositeIdSpec extends Specification {

    void "test something"() {
        expect:
        new UniqueWithoutCompositeId(firstName: 'John', lastName: 'Doe').save(flush: true)
    }
}
