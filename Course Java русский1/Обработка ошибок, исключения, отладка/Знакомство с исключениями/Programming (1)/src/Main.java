

public class Main {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        String str = new String();
        StackTraceElement[] tracer;
        tracer = new Throwable().getStackTrace();
        if(tracer.length > 2) {
            str = tracer[2].getClassName() + "#" + tracer[2].getMethodName();
            return str;
        }
        return null;
    }
}