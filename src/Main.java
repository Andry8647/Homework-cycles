public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1 Часть 2");
        int i = 0;
        int score = 0;
        int deffered = 15000;
        while (score < 2_459_000){
            score = score + score/100;
            score = score + deffered;

            i++;
            System.out.println("Месяц "+ i + " , сумма накоплений равна " + score + " рублей");
        }
        System.out.println("Задача 2 Часть 2");
        int a = 0;
        while (a < 10){
            a++;
            System.out.print(a + " ");
        }
        System.out.println("");
        for (int s = 10;s > 0;s--){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("Задача 3 Часть 2");
        int population = 12_000_000;
        for (int l = 1; l <= 10; l++){
            population = population + population/1000 * (17 - 8);
            System.out.println("Год " + l + " , численность населения составляет " + population );
        }
        int population1 = 12_000_000;
        System.out.println("Задача 3 Часть 2 (Через while)");
        int l = 0;
        while (l < 10){
            population1 = population1/1000 * (17 - 8) + population1;
            l++;
            System.out.println("Год " + l + " , численность населения составляет " + population1);
        }
        System.out.println("Задача 4 Часть 2 ");
        double pay = 15000;
        int z = 0;
        while (pay <= 12_000_000){
            pay = pay +pay * 7 / 100;
            z++;
            System.out.println("Месяц "+ z + " , сумма накоплений равна " + pay + " рублей");
        }
        System.out.println("Месяцев "+ z);
        System.out.println("Задача 5 Часть 2 ");
        int d = 0;
        int pay1 = 15000;
        while (pay1 <= 12_000_000){
            pay1 = pay1 +pay1 * 7 / 100;
            d++;
            if (d % 6 == 0) {
                System.out.println("Месяц " +  d + " , сумма накоплений равна " + pay1 + " рублей");
            }
        }
        System.out.println("Месяцев "+ d);
        System.out.println("Задача 6 Часть 2 ");
        int money = 15000;

        for (int p = 1; p <= 12*9; p++ ){
            money = money + money * 7 / 100;
            if (p % 6 == 0){
                System.out.println(p/6 + " полугодие, вы накопили " + money);
            }
        }
        System.out.println("Задача 7 Часть 2 ");
        int friday = 3;
        int day = 1;
        while (day<=31){
            if (day == friday || day == friday +7 || day == friday + 14 || day == friday + 21|| day == friday +28){
                System.out.println("Сегодня пятница," +  day + "-е число. Необходимо подготовить отчет.");
            }
            day ++;
            }
        System.out.println("Задача 8 Часть 2 ");
        int year = 0;
        while (year <=2122){
           if (year>=1822){
               System.out.println("Комета пролетала в " + year + " в следующий раз комета прилетит в" + year+79);
           }
            year = year +79;
        }
        System.out.println("Задача 8 Часть 2 ");
        for (int y = 1;y<11;y++){
            System.out.println("2*" + y + "=" + y*2);
        }

    }
}