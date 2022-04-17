package hello.core.singoleton;

public class StatefulService {


    public int order(String name, int price){
        // 무상태 설계
        System.out.println("name : " + name +" price : "+price);
        return price;

    }
    // 무상태 설계 x
//    private int price;

//    public void order(String name, int price){
//        System.out.println("name : " + name +" price : "+price);
//        this.price = price; // 여기가 문제
//    }

//    public int getPrice(){
//        return price;
//    }
}

