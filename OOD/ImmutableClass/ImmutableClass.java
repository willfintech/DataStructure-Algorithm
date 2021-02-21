package OOD.ImmutableClass;

public final class ImmutableClass { // final enforces the class cannot be inherited.
    // all fields are private, not accessible for other classes
    // add final to all fields, once assigned by constructor, cannot be changed anymore
    private final int num;
    private final String str;
    private final ImmutableList list;  // Space: O(1), only its address
    // cannot use a List<Integer>, because final can guarantee its address not be changed, but cannot guarantee that its content won't be changed
    // So, we have to use a Immutable List

    public ImmutableClass(int num, String str, ImmutableList list) {
        this.num = num;
        this.str = str;
        this.list = list;
    }

    // Only Getter, No Setter
    public String getStr() {
        return str;
    }

    public int getNum() {
        return num;
    }

    public ImmutableList getList() {
        return list;
    }
}

// Immutable Class的意义：多线程的bottle neck，加减锁。如果用不加减锁实现的话，需要Read-Only。所有多线程的variable要enforce immutable，否则必须加锁，performance会降低
// Guava: A Google's Java library: Immutable List, Immutable Map