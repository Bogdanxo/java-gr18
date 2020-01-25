package inner_nested_classes;

public class MainCPU {

    public static void main(String[] args) {
        CPU cpuObject = new CPU();
        cpuObject.setPrice(1000);

        CPU.Processor processor = cpuObject.new Processor();
        System.out.println(processor.getCores());

    }
}
