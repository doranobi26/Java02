public class Chapter07 {
    public static void main(String[] args) {
        String color = "blue";
        switch (color) {
        case "red":
            System.out.println("赤信号です");
            break;
        case "yellow":
            System.out.println("黄信号です");
            break;
        case "blue":
            System.out.println("青信号です");
        default:
            System.out.println("信号の色ではありません");
        }

        int how_long = 26;
        if (how_long <= 5) {
            System.out.println("とても近いです" );
        } else if (how_long <= 10) {
            System.out.println("近いです");
        } else if (how_long <= 15) {
            System.out.println("遠いです");
        } else {
            System.out.println("とても遠いです");
        }
    }
}
