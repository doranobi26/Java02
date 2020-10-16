public class Null01{
    public static void main(String[] args){
        String a = "ドラえもん";
        System.out.println(a + "の文字数：" + a.length());

        a = "";
        System.out.println(a + "の文字数：" + a.length());
        a = null;
        System.out.println(a + "の文字数：" + a.length());
    }
}
