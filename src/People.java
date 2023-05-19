/*Абстрактные классы
Дан абстрактный класс Человек с полями ФИО, год рождения,
размер зарплаты с методами выводящими значения полей.
Создать три класса директор, начальник отдела, работник,
в которых реализовать методы.
Создать по одному объекту классов*/
public abstract class People {
    String Full_Name;
    int data;
    double many;
    public abstract void Fio();
    public abstract void Birthday();
    public abstract void Cash();

}
