package example2;

import java.util.regex.*;

public class User {
    private String userIP;
    private int level;
    
    public User(int level) {
        this.level = level;
    }

    private boolean checkIPValidity(String ip) {
        Pattern p = Pattern.compile("99\\d*\\.\\d+\\.\\d+\\.\\d+");
        Matcher m = p.matcher(ip);
        return m.matches();

    }

    public void setIP(String ip) {
        if (checkIPValidity(ip)) {
            userIP = ip;
        }    
    }
        
}
