package lecture02;

public class Car {
    int fuel;

    Car (){
        fuel = 0;
    }

    public void run(){
        if(fuel <= 0) {
            System.out.println("燃料が足りないため走れませんでした。");
        }else {
            System.out.println("燃料を1消費して走りました。");
            fuel-=1;
        }
    }
}
