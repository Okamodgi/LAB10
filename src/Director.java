public class Director extends People{

    int stag;

    public Director(String f, int d, double m, int s){
        this.Full_Name = f;
        this.data = d;
        this.many = m;
        this.stag = s;
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
    public void Stag(){
        System.out.println("Мой стаж " + stag + " лет");
        System.out.println("");
    }

}
