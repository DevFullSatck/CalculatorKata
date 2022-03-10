public class CalculatorKata {

    static int Add(String numbers) {

        int sum = 0;

        if (numbers.isEmpty()) return 0;

        String[] numbersSplit = numbers.split(",");
        for (int i=0; i < numbersSplit.length; i++) {
            sum = sum + Integer.parseInt(numbersSplit[i]);
        }
        return sum;

    }

    public static void main(String[] args) throws Exception {

        // Step  1
        System.out.println(Add("1,2"));
        System.out.println(Add("4,10"));
        System.out.println(Add("1,8,6"));
    }
}
