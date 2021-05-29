import java.util.Scanner;
public class week5b {
    static void countCharacterType(String str)
    {
        int vowels = 0, consonant = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ( (ch >= 'a' && ch <= 'z') ||
                (ch >= 'A' && ch <= 'Z') ) {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonant++;
            }
        } 
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonant: " + consonant);
        
    }
    static public void main (String[] args)
    {    
        Scanner s = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter the String : ");
        str = s.nextLine();
        countCharacterType(str);
    }
}