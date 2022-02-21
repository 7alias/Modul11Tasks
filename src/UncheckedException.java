public class UncheckedException {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;
        try {
            if (n2 == 0) {
                throw new DivisionByZero("Нельзя делить на 0");
            }
            System.out.println(n1 / n2);

        } catch (DivisionByZero a) {
            System.err.println("Произошла ошибка");
        } finally {
            System.out.println("Программа завершает работу");
        }
    }

}

