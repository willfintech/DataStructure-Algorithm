package OOD.SingletonPattern;

// What is Singleton?
// One class has only 1 instance

// Why Singleton?
// Master Slave, Master全局唯一，只有一个instance
// 不想new太多次，重复使用，比如Cache，which is construct expensive

// Lazy Loading: Yes
// Multi-Threading Safe: Yes
// Time: Good
// Space: Good

public class Singleton {  // Lazy Initialization
    private static Singleton instance;  // class level调用
    private Singleton() {

    }

    public Singleton getInstance() { // 不需要instance调用，class直接调用，故为static
        if (instance == null) {
            synchronized (this) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
