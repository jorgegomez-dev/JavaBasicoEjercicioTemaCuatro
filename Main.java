public class Main {
    public static void main(String[] args) {
        SmartDevice iPhone = new SmartPhone(8.2, "Amoled", "mcOs", 2022, "China", "iPhone 13Max","Apple", 3, 20.0, 50,15);
        SmartDevice J7 = new SmartPhone(7.1, "Led", "Android", 2017, "Malasia", "Galaxy J7","Samsung", 1, 2.0, 6,2);
        SmartDevice GalaxyFit2 = new SmartWatch(1.1, "Amoled", "Android", 2021, "Korea", "Galaxy Fit2","Samsung", 11, true, false, true);

        System.out.println(iPhone);
        System.out.println(J7);
        System.out.println(GalaxyFit2);
    }
}