public class Worker extends People {
    String proff;

    public Worker(String f, int d, double m, String p){
        this.Full_Name = f;
        this.data = d;
        this.many = m;
        this.proff = p;
    }
    public void Fio() {
        System.out.println("Меня зовут "+ Full_Name);
    }
    public void Birthday() {
        System.out.println("Мой год рождения " + data);
    }
    public void Cash(){
        System.out.println("Я зарабатываю " + many + "рублей");
    }
    public void Dolgnost(){
        System.out.println("Моя профессия " + proff);
        System.out.println("");
    }

}
