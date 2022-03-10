public class CalculatorKata {

    static int Add(String numbers) throws Exception {

        int sum = 0;

        if (numbers.isEmpty()) return 0;

        String[] numbersSplit = numbers.split(",");
        StringBuilder NotANumbersException = new StringBuilder("Not a number");
        for (int i=0; i < numbersSplit.length; i++) {
            try {
                sum = sum + Integer.parseInt(numbersSplit[i]);

            } catch (NumberFormatException e) {
                throw new Exception(NotANumbersException.append(" ").append(numbersSplit[i]).toString());
            }
        }
        return sum;

    }

    public static void main(String[] args) throws Exception {

        // Step  1
        System.out.println(Add("1,2"));
        System.out.println(Add("4,10"));
        System.out.println(Add("1,8,6"));

        // Step  2
        System.out.println(Add("?,1,8,="));
    }
}
