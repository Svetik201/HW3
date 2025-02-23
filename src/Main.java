public class Main {
    public static void main(String[] args) {
        System.out.println("homeWork3");



        byte aplle = 22;
        System.out.println("в коробке яблок " + aplle + " кг");
        short oranges = 888;
        System.out.println("на складе лежит " + oranges + " кг апельсинов");
        int peper = 1999999;
        System.out.println("на заводе перерабатывают " + peper + " кг перца");
        long bananas = 3888888888777L;
        System.out.println("в Африке собрали " + bananas + " кг бананов");
        float cake = 2.5f;
        System.out.println("осталось после праздника " + cake + " куска торта");
        double milk = 3.333333333;
        System.out.println("жирность молока составляет " + milk + " %");


        float m = 27.12f;
        System.out.println(m);
        long v = 987678965549L;
        System.out.println(v);
        float u = 2.786f;
        System.out.println(u);
        short s = 569;
        System.out.println(s);
        short o = -159;
        System.out.println(o);
        float w = 27.897f;
        System.out.println(w);
        byte r = 67;
        System.out.println(r);


        byte lydmilaP = 23;
        byte annaS = 27;
        byte ekaterinaA = 30;
        int student = lydmilaP + annaS + ekaterinaA;
        System.out.println("общее количество учеников " + student);
        int sheets = 480;
        sheets = sheets / student;
        System.out.println("На каждого ученика расчитано " + sheets + " листов бумаги");


        int bottle = 16;
        byte twoMinutes = 2;
        byte twentyMinutes = 20;
        bottle = (bottle / twoMinutes) * twentyMinutes;
        System.out.println("За 20 минут машина произвела " + bottle + " штук бутылок.");
        bottle = bottle / twentyMinutes;
        System.out.println("За 1 минуту машина произвела " + bottle + " штук бутылок.");
        byte hour = 60;
        System.out.println("В одном часе " + hour + " минут.");
        int day = 24;
        day = day * hour;
        System.out.println("В сутках " + day + " минут.");
        bottle = bottle * day;
        System.out.println("За 1 сутки машина произвела " + bottle + " штук бутылок.");
        int threeDays = 3;
        bottle = bottle * 3;
        System.out.println("За 3 дня машина произвела " + bottle + " штук бутылок.");
        int oneMonth = 30;
        oneMonth = oneMonth * day;
        System.out.println("В 1 месяце " + oneMonth + " минут.");
        bottle = bottle / threeDays;
        bottle = bottle * oneMonth;
        System.out.println("За 1 месяц машина произвела " + bottle + " штук бутылок.");

        byte totalNumberPaint = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int oneClass = whitePaint + brownPaint;
        int totalClass = totalNumberPaint / oneClass;
        whitePaint = whitePaint * totalClass;
        brownPaint = brownPaint * totalClass;
        System.out.println("В школе , где " + totalClass + " классов , нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски.");


        byte quantityBananas = 5;
        byte weightBanan = 80;
        int commonWeightBananas = quantityBananas * weightBanan;
        int totalNumberMilk = 200;
        byte oneMilk = 100;
        byte weightMilk = 105;
        int commonWeightMilk = totalNumberMilk / oneMilk * weightMilk;
        byte iceCream = 2;
        byte weightOneIceCream = 100;
        int commonWeightIceCream = iceCream * weightOneIceCream;
        byte quantityEggs = 4;
        byte weightEggs = 70;
        int commonWeightEggs = quantityEggs * weightEggs;
        float kilogram = 1000f;
        int weightGrams = commonWeightBananas + commonWeightMilk + commonWeightIceCream + commonWeightEggs;
        float weightKilogram = weightGrams / kilogram;
        System.out.println("Вес в граммах " + weightGrams + " , вес в килограммах " + weightKilogram);


        int oneDay1 = 250;
        int oneDay2 = 500;
        int kilogramS = 7;
        int gramS = 1000;
        kilogramS = kilogramS * gramS;
        oneDay1 = kilogramS / oneDay1;
        oneDay2 = kilogramS / oneDay2;
        System.out.println("За " + oneDay1 + " дней спортсмен похудеет , если будет терять в весе 250 грамм в день ,  за " + oneDay2 + " дней спортсмен будет терять вес , если будет уходить по 500 грамм в день .");


        float salaryMasha = 67760.0f;
        float percentMasha = 0.10f;
        float increaseMasha = salaryMasha * percentMasha;
        float newMasha = salaryMasha + increaseMasha;
        float hourMasha = 12f;
         hourMasha = hourMasha * increaseMasha;
         System.out.println("Маша теперь получает " + newMasha + " рублей . Годовой доход вырос на " + hourMasha + " рублей .");

         float salaryDenis = 83690.0f;
         float percentDenis = 0.10f;
         float increaseDenis = salaryDenis * percentDenis;
         float newDenis = salaryDenis + percentDenis;
         float hourDenis = 12f;
         hourDenis = hourDenis * increaseDenis;
         System.out.println("Денис теперь " + newDenis + " рублей . Годовой доход вырос на " + hourDenis + " рублей .");

         float salaryKristy = 76230.0f;
         float percentKristy = 0.10f;
         float increaseKristy = salaryKristy * percentKristy;
         float newKristy = salaryKristy + percentKristy;
         float hourKristy = 12;
         hourKristy = hourKristy * increaseKristy;
         System.out.println("Кристина теперь получает " + newKristy + " рублей . Годовой доход вырос на " + hourKristy + " рублей.");






















































    }


}

