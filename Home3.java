import java.util.Scanner;
public class Home3 {


    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();
        System.out.println(returnNewWord(firstWord,secondWord));



    }static String returnNewWord(String firstWord, String secondWord){
        int mid = firstWord.length()/2;
       String first = firstWord.substring(0,mid);
       int mid2 = secondWord.length()/2;
       String second = secondWord.substring(mid2);
       String newWord = first+second;
       return newWord;
    }

static double sum (double a,double b) {
        double x = a+b;
        return x;
}
static double sum2(double d,double m){
        double y = d * m;
        return y;
}
static double sum3(double w,double r){
        double s = w - r;
        return s;

}
static double sum4(double t, double i){
        double k=t*i;
        return k;
}
static void kurs(int amountE,double currencies){
double kursD = amountE*currencies;
    System.out.println(kursD);
}

}
