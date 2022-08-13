import java.security.MessageDigest;

public class Quiz {
    public Quiz() {
    }

    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
        byte[] var3 = digest;
        int var4 = digest.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            byte b = var3[var5];
            System.out.printf("%02x", b);
        }

    }
}
