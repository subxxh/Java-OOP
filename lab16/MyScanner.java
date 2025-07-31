import java.util.InputMismatchException;

public class MyScanner {
    private String str;

    public MyScanner(String str) {
        this.str = str;
    }

    private boolean isSpace(char c) {
        return c == ' ' || c == '\t' || c == '\n';
    }


   public String next() {
        int i;
        for (i = 0; i < str.length(); i++) {
            if (isSpace(str.charAt(i))) {
                break;
            }
        }
        String token = str.substring(0, i); 
        str = str.substring(i);
        return token;
    }

     public int nextInt() {
        int i;
        for (i = 0; i < str.length(); i++) {
            if (isSpace(str.charAt(i))) {
                break;
            }
        }

        String token = str.substring(0, i);
        if (!token.isEmpty()) {
            str = str.substring(i);
            return Integer.parseInt(token);
        } else {
            throw new InputMismatchException("Invalid input for integer.");
        }
    }


    public double nextDouble() {
        int lol;
        for (lol = 0; lol < str.length(); lol++) {
            if (isSpace(str.charAt(lol))) {
                break;
            }
        }
  
        String token = str.substring(0, lol);
        str = str.substring(lol);
        if (isDouble(token)) {
            return Double.parseDouble(token);
        } else {
            throw new InputMismatchException("Can't be converted into a double.");
        }
    } 



private boolean isDouble(String token) {
        return false;
    }

public boolean nextBoolean() {
    String token = next().toLowerCase(); 
    if ("true".equals(token)) {
        return true;
    } else if ("false".equals(token)) {
        return false;
    } else {
        throw new InputMismatchException("Invalid input for boolean.");
    }
}

    public String nextLine() {
        int endIndex = str.indexOf('\n');
        if (endIndex == -1) {
            endIndex = str.length();
        }
        String line = str.substring(0, endIndex);
        str = str.substring(endIndex);
        return line;
    }

}
