package OOD.SingletonPattern;

// Lazy Loading: Yes
// Multi-Threading Safe: No
// Time: Good
// Space: Good

// 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
// 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。

public class SingletonBad {
    private static SingletonBad instance;
    private SingletonBad() {}

    public SingletonBad getInstance() {
        if (instance == null) {
            instance = new SingletonBad();
        }
        return instance;
    }
}