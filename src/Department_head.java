public class Department_head extends People{
    int otdel;

    public Department_head(String f, int d, double m, int o){
        this.Full_Name = f;
        this.data = d;
        this.many = m;
        this.otdel = o;
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
    public void Otdel(){
        System.out.println("Отделов под моим руководством - " + otdel);
        System.out.println("");
    }

}
