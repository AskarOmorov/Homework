       //                   РАБОТУ ВЫПОЛНИЛ ОМОРОВ АСКАР

        /*1 уровень сложности: в этом приложении вы должны будете написать логику для простого бота.
        Ваш бот будет работать в почтовом отделении и служить для того,
        чтобы заранее заполнить все поля и выдать готовый квиток для отправления посылки.
        посылка может быть сборной, но обязательно из одинаковых коробок одинакового веса,
        поэтому мы спрашиваем нашего пользователя:


        сколько коробок вы хотите отправить?


        при помощи сканнера считать количество коробок и и сохранить в переменную определенного типа<

        сколько весит каждая коробка в киллограммах? при помощи сканнера считать вес коробки. Дробное число, и сохранить в переменную определенного типа<
        Введите имя получателя посылки на этом этапе могут возникнуть ошибки при считывании строки после считвания числа, то есть считается пустая строка, проверьте и подумайте, как это решить
        при помощи сканнера считать имя получателя <

        Введите фамилию получателя посылки при помощи сканнера считать фамилию получателя <
        Введите адрес получателя посылки при помощи сканнера считать адрес получателя <

        После чего ваш бот должен написать следующее сообщение:
        Получатель: "…"    // подумайте, как распечатать ковычки
        Адрес получателя: "…" // имя и адрес получателя должны быть выведены в верхнем регистре, даже если пользователь ввел их в нижнем регистре
        вес посылки: … кг // вес посылки целиком, а не от дельной коробки, те если было 3 коробки по 3.5 кг, то вес посылки 10.5 кг


        -Все верно?


        при помощи сканнера считать ответ получателя в переменную типа boolean */

import java.util.Scanner;

public class Home2 {
    public static void main(String[] args) {
        tryScanner();
    }

    public static void tryScanner() {
        Scanner qw = new Scanner(System.in);
        System.out.println("Введите данные");

        System.out.println("Количество коробок");
        int ab = qw.nextInt();
        System.out.println("У вас " + ab + " коробок");
        System.out.println("Вес посылки");
        double bc = qw.nextDouble();
        System.out.println("Ваша посылка весит " + bc * 1.0 + "кг");
        System.out.println("Ваше имя");
        String de = qw.next();
        System.out.println(de);
        System.out.println("Ваша фамилия");
        String ef = qw.next();

        System.out.println(ef);
        qw.nextLine();
        System.out.println("Введите имя и фамилию получателя");
        String fg = qw.nextLine();
        System.out.println(fg);
        System.out.println("Введите адрес получателя");
        String gh = qw.nextLine();
        System.out.println(gh);
        System.out.println();
        String hj = "\n";
        System.out.println("Получатель: " + fg.toUpperCase() + hj + "Адрес получателя: " + gh.toUpperCase() + hj + "Вес посылки:" + ab * bc * 1.0 + "кг");
        System.out.println("Проверьте внесеннные даннные, если все верно нажмите 0 и Enter, если нет то позовите сотрудника");
        int kl = qw.nextInt();
        int jk = 1;
        boolean zx = jk > kl;

    }
}
