public class BusMain {
    public static void main(String args[]){
        Bus bus1 = new Bus("1234");
        Bus bus2 = new Bus("5678");

        bus1.oil = 100;
        //bus1.passsenger = 30;

        if(bus1.number.equals(bus2.number))
            System.out.println("같은 번호의 버스 입니다.");
        else
            System.out.println("다른 번호의 버스 입니다.");

        System.out.println("");
        bus1.statusDrive(100, "운행");

        System.out.println("");
        bus1.passengerBus(2);

        System.out.println("");
        System.out.println("주유량 = " + bus1.oilingBus(-50));

        System.out.println("");
        bus1.statusDrive(0, "종료");
        System.out.println("주유량 = " + bus1.oilingBus(10));

        System.out.println("");
        bus1.statusDrive(60,"운행");

        System.out.println("");
        bus1.passengerBus(45);

        System.out.println("");
        bus1.passengerBus(5);

        System.out.println("");
        System.out.println("주유량 = " + bus1.oilingBus(-55));
        bus1.statusDrive(5, "종료");

    }
}
