import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Versions {
    public int compareVersion(String version1, String version2) {
        String[] ver1 =  version1.split("\\.");
        String[] ver2 = version2.split("\\.");
        int n = Math.max(ver1.length, ver2.length);
        for (int i = 0; i < n ; i++) {
            int v1 = Integer.parseInt(i < ver1.length  ? ver1[i] : "0");
            int v2 = Integer.parseInt(i < ver2.length   ? ver2[i] : "0");
            if (v1 > v2)
                return 1;
            if (v1 < v2)
                return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Versions versions = new Versions();
        System.out.println(versions.compareVersion("0.1","1.1"));
       System.out.println(versions.compareVersion("1.01","1.001"));
        System.out.println(versions.compareVersion("1.01","1"));
        System.out.println(versions.compareVersion("3.3.0","3.3"));
    }
}
