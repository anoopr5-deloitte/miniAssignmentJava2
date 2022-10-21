public class arithmeticException {
    public static void main(String[] args) {

        int firstNum = 10;
        int secondNum = 0;
        try{
            int res = firstNum/secondNum;
            System.out.println("Result : "+ res);
        }catch(ArithmeticException ae ){
            System.out.println("Arithmetic Exception occurred in code");
        }
        finally {
            System.out.println("Thank you");
        }


    }
}
