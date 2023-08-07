package task_2_3_4;

public class Main {
    public static void main(String[] args) {
        Device device = new Device ("Samsung", 120, "AB1234567CD");
        Monitor monitor = new Monitor("Samsung",120, "AB1234567CD", 1280, 1024);
        System.out.println(device);
        System.out.println(monitor);
        System.out.println();


        Device device1 = new Device("Samsung", 120, "AB1234567CD");
        Device device2 = new Device("Samsung", 120, "AB1234567CD");

        Monitor monitor1 = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        Monitor monitor2 = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);

        EthernetAdapter adapter1 = new EthernetAdapter("Samsung", 50, "AB1234567CD", 100, "AB1234567CD");
        EthernetAdapter adapter2 = new EthernetAdapter("Samsung", 50, "AB1234567CD", 100, "AB1234567CD");

        System.out.println(device1.equals(device2));
        System.out.println((device1.hashCode() == device2.hashCode()));

        System.out.println(monitor1.equals(monitor2));
        System.out.println((monitor1.hashCode() == monitor2.hashCode()));

        System.out.println(adapter1.equals(adapter2));
        System.out.println((adapter1.hashCode() == adapter2.hashCode()));

        System.out.println(device1.equals(adapter2));
        System.out.println((device1.hashCode() == adapter2.hashCode()));

    }
}
