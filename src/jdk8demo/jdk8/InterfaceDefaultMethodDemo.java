package jdk8demo.jdk8;

public class InterfaceDefaultMethodDemo {
    public static void main(String[] args) {
        Mob1 a = new Mob1();
        a.action();
    }
}


interface Mob {
    void action();
    
    default String doSome(){
        return "doSome";
    }
    
    static void actionStatic(){
        System.out.println("actionStatic");
    }
}

interface MobTwo {
    void action();
    
    default String doSome(){
        return "doSome";
    }
}



class Mob1 implements Mob, MobTwo{

    @Override
    public void action() {
        System.out.println("action");
        System.out.println(doSome());
        
    }
    
    public String doSome(){
        return "mydoSome";
    }
    
}
