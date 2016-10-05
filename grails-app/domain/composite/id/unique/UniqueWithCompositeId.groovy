package composite.id.unique

import org.apache.commons.lang.builder.HashCodeBuilder

class UniqueWithCompositeId implements Serializable {

    String firstName, lastName

    static mapping = {
        id composite: ['firstName', 'lastName']
    }

    static constraints = {
        firstName(unique: ['lastName'])
    }

    boolean equals(other) {
        if (!(other instanceof UniqueWithCompositeId)) {
            return false
        }

        other.firstName == firstName && other.lastName == lastName
    }

    int hashCode() {
        def builder = new HashCodeBuilder()
        builder.append firstName
        builder.append lastName
        builder.toHashCode()
    }
}
