package example2;
import java.util.regex.*;

public class RegUser extends User {
    private int region;

    public RegUser(int level, int region) {
        super(level);
        this.region = region;
    }

    private boolean checkIPValidity(String ip) {
        Pattern p = Pattern.compile("99\\d*\\.\\d+\\.\\d+\\.\\d+");
        Matcher m = p.matcher(ip);
        if(!m.matches()) {
            return false;
        }

        System.out.println(ip);
        String[] str = ip.split("\\.");
        Pattern p1 = Pattern.compile("111");
        Matcher m1;
        for (int i = 0; i < str.length; i++) {
            m1 = p1.matcher(str[i]);
            if (m1.matches()) {
                return false;
            }
        }

        return true;

    }

    @Override
    public void setIP(String ip) {
        if (checkIPValidity(ip)) {
            super.setIP(ip);
        }    
    }

    
}
