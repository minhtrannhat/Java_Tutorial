package IOandExceptionHandling;

public class TestException {
    public static void main(String[] args) {
        try{
            System.out.println(sum(new int[] {1, 2, 3, 4, 5}));
        }
        catch (Exception ex){

            // Index 5 out of bounds for length 5
            ex.printStackTrace();
            // java.lang.ArrayIndexOutOfBoundsException
            System.out.println("\n" + ex.getMessage());
            // Index 5 out of bounds for length 5
            System.out.println("\n" + ex.toString());

            System.out.println("\n Trace Info Obtained from getStackTrace");
            StackTraceElement[] traceElements = ex.getStackTrace();

            for(int i = 0; i < traceElements.length; i++){

                System.out.println("method " + traceElements[i].getMethodName());
                System.out.println("(" + traceElements[i].getClassName() + ":");
                System.out.println(traceElements[i].getLineNumber() + ")");
            }
        }
    }

    private static int sum(int[] list){
        int result = 0;

        for(int i = 0; i <= list.length; i++){
            result += list[i];
        }

        return result;
    }
}
