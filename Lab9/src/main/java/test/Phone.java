package test;

public abstract class Phone {
    private String model;

    public Phone(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void showModel(){
        System.out.println("Модель телефона: " + model);
    }

    public abstract void call();
}
