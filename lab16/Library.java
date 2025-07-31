public class Library {

    public static int str2Int(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            num += (c - 48);
            num *= 10;
            System.out.println(num);
        }
        num /= 10; 
        return num;
    }

    public static String thousandSeparator(int num) {
        StringBuilder nummie = new StringBuilder();
        String numStr = Integer.toString(num);
        
        int count = 0;
        for (int i = numStr.length() - 1; i >= 0; i--) {
            char digit = numStr.charAt(i);
            nummie.insert(0, digit);
            count++;
            if (count % 3 == 0 && i != 0) {
                nummie.insert(0, '.');
            }
        }
           return nummie.toString();
    }
    


    public static boolean detectCapitalUse(String word) {
        char first = word.charAt(0);
        if (Character.isUpperCase(first)) {
            char second = word.charAt(1);
            if (Character.isUpperCase(second)) {
                //all are upper
                for (char c : word.toCharArray()) {
                if (!Character.isUpperCase(c))
                return false;
            }
            } else {
                for (int i = 2; i < word.length(); i++) {
                    if (Character.isUpperCase(word.charAt(i))) 
                    return false;
                }
            }     
        } else {
            for (char c : word.toCharArray()) {
                if (Character.isUpperCase(c))
                return false;
            }
        }
        return true;
    }

    public static String makeFancyString(String s) {
        String fancyString = " ";
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            } 
            if (count <= 2) {
                fancyString += s.charAt(i - 1);
            }
        }
    
    return fancyString;
    }

    public static String capitalizeTitle(String title) {
        String capitalTitle = "";
    
        for (int i = 0; i < title.length(); i++) {
            char c = title.charAt(i); if (i == 0) {
                capitalTitle += Character.toUpperCase(c);
            } else {
                capitalTitle += Character.toLowerCase(c);
            }
        }
    return capitalTitle;
}

}
    
