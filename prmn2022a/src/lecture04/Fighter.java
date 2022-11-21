package lecture04;

public class Fighter {
    private int hitPoint;
    private int power;
    private String name;

    public Fighter(int hitPoint, int power, String name){
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    public void attack(Fighter enemy){
        int hp = enemy.getHitPoint()-power;
        enemy.setHitPoint(hp);
        System.out.println(name+"　は　"+enemy.getName()+"　に　"+power+"ダメージを与えた。");
    }

    public boolean isAlive(){
        return hitPoint>=0;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public String getName() {
        return name;
    }
}
