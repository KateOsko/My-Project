import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String first = "listen";
        String second= "silence";

        char [] f = first.toCharArray();
        char [] s = second.toCharArray();

        Arrays.sort(f);
        Arrays.sort(s);

        if(Arrays.equals(f,s)) { //Arrays.equals(f,s)
            System.out.println("Anagram");
        }else{
            System.out.println("NOT");

        }
    }
}
