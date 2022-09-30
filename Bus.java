public class Bus {
    String number;
    int oil;

    Bus(String number){
        this.number = number;
    }

    int oilingBus(int addOil){
        this.oil += addOil;
        return this.oil;
    }


    void statusDrive(int oilStatus, String status){

        if(oilStatus >= 10 && status.equals("운행"))
            System.out.println("운행 중");
        else if((oilStatus < 0 || oilStatus < 10) && status.equals("운행"))
            System.out.println("주유 필요");
        else if(oilStatus == 0 || status.equals("종료"))
            System.out.println("차고지행");


    }

    void passengerBus(int passsenger){
        int maxPasssenger = 30;
        maxPasssenger -= passsenger;
        int reSultFee = passsenger * 1000;

        if(maxPasssenger < 0)
            System.out.println("최대 승객 수 추과");
        else {
            System.out.println("탑승 승객 수 = " + passsenger);
            System.out.println("잔여 승객 수 = " + maxPasssenger);
            System.out.println("요금 확인 = " + reSultFee);
        }


    }

}
