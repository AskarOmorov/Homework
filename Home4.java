public class Home4 {
    public static void main(String[] args) {
        System.out.println("Ямогу купить это " + canBuy);

        System.out.println(n);
        System.out.println(time);

    }

    static boolean isWeekend;
    static boolean isRain;
    static boolean canWalk = isRain ^ isWeekend;




    static boolean isEdekaOpen;
    static boolean isReweOpen;
   static boolean canBuy = isEdekaOpen || isReweOpen;



    static boolean is100orMore;
   static boolean is100orLess;
    static boolean temperature1 = is100orMore;
     static boolean temperature2 =is100orLess;
     static boolean canOn = temperature1 && temperature2;

    static int n;

    static int time = n / 3600;}



