package com.company;

public class Main {

    public static void main(String[] args) {
	// Задание 1
        byte q = 44;
        short w = 129;
        int e = -32769;
        long r = 1234L;
        float t = 0.25f;
        double y = 125.35;
        char symbol = 36;
        boolean isAdult =q>18;
        System.out.println(isAdult);
        System.out.println (symbol);
        //Задание 2
        double a = 78.2;
        double b =82.7;
        System.out.println(a+b);//Общий вес боксёров
        System.out.println(b-a);//Разница между весом бойцов
        //Задание 3
        double banans = 80;
        double milk = 105;
        double iceCream = 100;
        double eggs = 70;
        double breakfast =(5*banans)+(2*milk)+(2*iceCream)+(4*eggs);//Вес в граммах
        System.out.println(breakfast/1000);//Вес в киллограмм
        //задание 4
        int weight = 7000;// Вес который должен сбросить
        int max = 7000/250;// Максимум дней сколько потребуется
        int min = 7000/500;// Минимальное колличество дней которые потребуется
        System.out.println((max+min)/2);
        //Задание 5
        int maria = 67760;// зарплаты до повышения
        int denis = 83690;
        int kristina = 76230;
        var m = maria * 0.1;// На сколько повысили
        var d = denis * 0.1;
        var  k = kristina * 0.1;
        var mariaFin = maria+m;// Их новая зарплата
        var denisFin = denis+d;
        var kristinaFin = kristina+k;
        var mariaLastYear = 67760 * 12;//Их прошлая годовая зарплата
        var denisLastYear = 83690 * 12;
        var kristinaLastYear = 76230 * 12;
        var mariaYear = mariaFin * 12;// Новая годовая зарплата
        var denisYear = denisFin * 12;
        var kristinaYear = kristinaFin * 12;
        var mariaDifference = mariaYear-mariaLastYear;//Разница в годовых зарплатах
        var denisDifference = denisYear-denisLastYear;
        var kristinaDifference = kristinaYear-kristinaLastYear;
        System.out.println("Маша теперь получает"+ mariaFin + "Годовой доход вырос на " + mariaDifference);
        System.out.println("Денис теперь получает"+ denisFin + "Годовой доход вырос на" + denisDifference);
        System.out.println("Кристина теперь получает"+  kristinaFin+ "Годовой доход вырос на" + kristinaDifference);


    }
}
