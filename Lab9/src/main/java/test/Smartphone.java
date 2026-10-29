package test;

public class Smartphone extends Phone implements Chargable{
    public Smartphone(String model){
        super(model);
    }

    @Override
    public void call(){
        System.out.println("Набираем номер телефона со смартфона ");
    }

    @Override
    public void charge(int percent){
        System.out.println(getModel() + "зарядился на " + percent + "%");
    }
}
