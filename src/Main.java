import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names;
        names = new ArrayList<>();
        names.add("田中");
        names.add("鈴木");
        names.add("平川");
//        System.out.println(names.get(0));
//        System.out.println(names.get(2));
//        System.out.println(names.get(1));
        int i = 0;
        for (; i < 5; i++) {
            try {
                if (i < 0 || 2 < i) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                System.out.println(names.get(i));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("この数値は存在しません；"+ i);
            }

        }
    }
}