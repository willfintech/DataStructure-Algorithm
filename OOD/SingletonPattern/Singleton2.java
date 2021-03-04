package OOD.SingletonPattern;

// Lazy Loading: Yes
// Multi-Threading Safe: Yes
// Time: Good
// Space: Good

// 这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。这种方式只适用于静态域的情况，
// 双检锁方式可在实例域需要延迟初始化时使用。
// 这种方式同样利用了classloader机制来保证初始化instance时只有一个线程，它跟第SingletonBad3方式不同的是：SingletonBad3只要
// Singleton类被装载了，那么instance就会被实例化（没有达到 lazy loading 效果），而这种方式是Singleton类被装载了，instance
// 不一定被初始化。因为SingletonHolder类没有被主动使用，只有通过显式调用getInstance方法时，才会显式装载SingletonHolder类，
// 从而实例化instance。想象一下，如果实例化instance很消耗资源，所以想让它延迟加载，另外一方面，又不希望在Singleton类加载时就实例化，
// 因为不能确保Singleton类还可能在其他的地方被主动使用从而被加载，那么这个时候实例化instance显然是不合适的。这个时候，
// 这种方式相比SingletonBad3方式就显得很合理

public class Singleton2 {
    private static class SingletonHolder {
        private static final Singleton2 INSTANCE = new Singleton2();
    }

    private Singleton2() {}

    public static final Singleton2 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
