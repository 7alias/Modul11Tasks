import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    private static Throwable e;

    public static void main(String[] args) throws MyException {
        input();
    }

    public static String input() throws MyException {
        String s = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            s = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        if (s.equals("")) {
            throw new MyException("");
        }
        return s;
    }

    private static class MyException extends Exception {
        public MyException(String s) {
            System.out.println("String can not be empty!");
        }
    }
}