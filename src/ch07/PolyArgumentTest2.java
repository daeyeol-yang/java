package ch07;

import java.util.Vector;

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();
        Tv2 tv =new Tv2();
        Computer2 computer = new Computer2();
        Computer2 computer1 = new Computer2();
        Audio audio = new Audio();

        b.buy(tv);
        b.buy(computer);
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(computer);
        b.summary();
    }
}


class Product2{
    int price;
    int bonusPoint;

    Product2(int price){
        this.price = price;
        this.bonusPoint =(int) (price/10.0);
    }

    Product2() {}
}

class Buyer2{
    int money = 1000;
    int bonusPoint =0;
    Vector item = new Vector();
    int i =0;

    void buy(Product2 p){
        if(money<p.price){
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p+ "을 / 를  구매하셨습니다.");
    }

    void refund(Product2 p){
        if(item.remove(p)){
            money+= p.price;
            bonusPoint -=p.bonusPoint;
            System.out.println(p + "을 반품했습니다.");
        }else {
            System.out.println("구입하신 제품이 없습니다.");
        }
    }

    void summary(){
        int sum =0;
        String itemList = "";

        if(item.isEmpty()){
            System.out.println("구입하신 물품이 없습니다.");
            return;
        }

        for (int i = 0; i <item.size() ; i++) {
            Product2 p = (Product2) item.get(i);
            sum += p.price;
            itemList += (i==0)? " "+p :  ", "+p;

        }
        System.out.println("구입하신 물품의 총 금액은 "+sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

class Tv2 extends Product2{
    Tv2() {super(100);}

    @Override
    public String toString() {
        return "Tv";
    }
}

class Computer2 extends Product2{
    Computer2() {super(200);}

    @Override
    public String toString() {
        return "Computer";
    }
}

class Audio extends Product2{
    Audio() {super(50);}

    @Override
    public String toString() {
        return "Audio";
    }
}