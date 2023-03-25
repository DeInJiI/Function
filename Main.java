public class Main {
    public static void main (String[] args){
        byte[] mas1 = new byte [] {5, 6, 8};
        short num = 7;
        int result1 = summa ((short)5, num);
        info (String.valueOf(result1));
        int res1 = summaArray(mas1);
        System.out.println(res1);
    }
    public static int summa (short a, short b){
        int res = a + b;
        String result = "Результат первого и второго сложения = ";
        info (result);
        return (res);
    }
    public static int summaArray (byte[] arr){
        int summa = 0;
        for (byte b : arr) summa += b;
        return summa;
    }
    public static void info (String word){
        System.out.println(word);
    }
}
