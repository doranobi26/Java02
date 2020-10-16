public class Switch01 {
    public static void main(String[] args) {
        int x = 2;
        switch (x) {
        case 1:
            System.out.println("よくできました！");
            break;
        case 2:
            System.out.println("おおむねよくでした！");
            break;
        case 3:
            System.out.println("ふつうでした！");
        default:
            System.out.println("がんばりましょう！");
        }
    }
}
