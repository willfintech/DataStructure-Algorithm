package OOD.BuilderPattern;

// 在Computer 中创建一个静态内部类 Builder，然后将Computer 中的参数都复制到Builder类中。
// 在Computer中创建一个private的构造函数，参数为Builder类型
// 在Builder中创建一个public的构造函数，参数为Computer中必填的那些参数，cpu 和ram。
// 在Builder中创建设置函数，对Computer中那些可选参数进行赋值，返回值为Builder类型的实例
// 在Builder中创建一个build()方法，在其中构建Computer的实例并返回

public final class Computer {
    // Required Fields
    private final String cpu;
    private final String ram;
    // Optional Fields
    private final int usbCount;
    private final String keyboard;
    private final String display;

    private Computer(ComputerBuilder computerBuilder) {
        this.cpu = computerBuilder.cpu;
        this.ram = computerBuilder.ram;
        this.usbCount = computerBuilder.usbCount;
        this.keyboard = computerBuilder.keyboard;
        this.display = computerBuilder.display;
    }

    public ComputerBuilder toBuilder() {
        return new ComputerBuilder(this.cpu, this.ram)
                .setUsbCount(this.usbCount)
                .setKeyboard(this.keyboard)
                .setDisplay(this.display);
    }

    public static class ComputerBuilder {
        private final String cpu;
        private final String ram;
        private int usbCount;
        private String keyboard;
        private String display;

        public ComputerBuilder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public ComputerBuilder setUsbCount(int usbCount) {
            this.usbCount = usbCount;
            return this;
        }

        public ComputerBuilder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public ComputerBuilder setDisplay(String display) {
            this.display = display;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
