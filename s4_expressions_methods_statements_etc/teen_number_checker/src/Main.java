public class Main {

    public static void main(String[] args) {
        boolean teenTrue = TeenNumberChecker.hasTeen(23, 15, 42);
        boolean teenFalse = TeenNumberChecker.hasTeen(22, 23, 34);
        boolean isTeenFalse = TeenNumberChecker.isTeen(9);
        boolean isTeenTrue = TeenNumberChecker.isTeen(13);

        System.out.println(teenTrue);
        System.out.println(teenFalse);
        System.out.println(isTeenTrue);
        System.out.println(isTeenFalse);
    }
}
