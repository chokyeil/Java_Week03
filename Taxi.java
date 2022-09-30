public class Taxi {
    String number;
    int oil;
    String statusTaxi;
    int passengers;

    Taxi(String number, int oil, String statusTaxi){
        this.number = number;
        this.oil = oil;
        this.statusTaxi = statusTaxi;

    }

//    void statusDrive(int oil){
//
//        if(oil >= 10)
//            System.out.println("운행 시작");
//
//    }



    void takePassengers(){
        int maxPassengers = 4;      //최대 승객
        int remainingPassengers;    //잔여 승객

        remainingPassengers = maxPassengers - this.passengers;

        if(remainingPassengers < 0)
            System.out.println("최대 승객 수 초과");
        else{
            System.out.println("탑승 승객 수 = " + passengers);
            System.out.println("잔여 승객 수 = " + remainingPassengers);
        }

    }

    void fee(String place, int km){
        int defalutFee = 3000;
        int resultFee = (km * 500) + defalutFee;

        System.out.println("기본 요금 확인 = " + defalutFee);
        System.out.println("목적지 = " + place);
        System.out.println("목적지까지 거리 = " + km +"km");
        System.out.println("지불함 요금 = " + resultFee);
    }

    String status(){

        if (this.passengers > 0)
            this.statusTaxi = "운행중";

         if(this.oil == 0)
            this.statusTaxi = "운행불가";

        return this.statusTaxi;
    }

    int oil(int oil){
        return this.oil += oil;
    }

}
