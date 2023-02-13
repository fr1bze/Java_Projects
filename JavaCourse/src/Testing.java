import java.security.MessageDigest;

public class Testing {

    public static void main(String[] args) throws Exception {
        System.out.println( "A" + ('\t' + '\u0003') );
        System.out.println( "A" + 12 );
        System.out.println( 'A' + "12" );
        System.out.println( 'А' + '1' + '2' );
    }
}