package composite.id.unique

class UniqueWithoutCompositeId {

    String firstName, lastName

    static constraints = {
        firstName(unique: ['lastName'])
    }
}
