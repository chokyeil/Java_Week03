public class TaxiMain {
    public static void main(String args[]){
        Taxi taxi1 = new Taxi("1234", 100, "일반");
        Taxi taxi2 = new Taxi("5678", 100, "일반");

        //.out.println(taxi1.number + ", " + taxi1.oil + ", " + taxi1.statusTaxi + ", " + taxi1.maxPassengers);
        if(taxi1.number.equals(taxi2.number))
            System.out.println("택시 번호가 같습니다");
        else
            System.out.println("택시 번호가 다릅니다");

        System.out.println("주유량 = " + taxi1.oil);
        System.out.println("상태 = " + taxi1.statusTaxi);

        taxi1.passengers = 2;
        System.out.println("");
        taxi1.takePassengers();
        taxi1.fee("서울역", 2);

        System.out.println("");
        System.out.println("주유량 = " + taxi1.oil(-80));

        System.out.println("");
        taxi1.passengers = -2;

        taxi1.passengers = 5;
        taxi1.takePassengers();

        System.out.println("");
        taxi1.passengers = -5;
        taxi1.passengers = 3;
        taxi1.fee("구로디지털단지역", 12);

        System.out.println("");
        System.out.println("주유량 = " + taxi1.oil(-20));
        System.out.println("상태 = " + taxi1.status());

        if (taxi1.status().equals("운행불가"))
            System.out.println("주유 필요");

    }
}
