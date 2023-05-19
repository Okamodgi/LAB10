public class Main {
    public static void main(String[] args) {
        Director Dir1 = new Director("Омаров Сергей Олегович", 1992, 80000, 6);                           //конструктор
        Department_head Dep1 = new Department_head("Руслова Алёна Евгеньевна", 2000, 40000, 8);
        Worker work1 = new Worker("Коровкин Андрей Константинович", 1998,  32000, "укладчик" );

        Dir1.Fio();
        Dir1.Birthday();
        Dir1.Cash();
        Dir1.Stag();

        Dep1.Fio();
        Dep1.Birthday();
        Dep1.Cash();
        Dep1.Otdel();

        work1.Fio();
        work1.Birthday();
        work1.Cash();
        work1.Dolgnost();
    }
}