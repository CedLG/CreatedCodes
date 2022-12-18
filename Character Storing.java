
import java.util.Random;
import java.util.*;

public class CapchaMaking {
    public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; 
		Random r = new Random(); 
		String[] array = new String[6]; 
		for (int k=0; k<6; k++){
		array[k] = Character.toString(alphabet.charAt(r.nextInt(alphabet.length())));
		}
		System.out.println(Arrays.toString(array));
                String a = Arrays.toString(array);
                a =  a.replace("[", "");
                a = a.replace(",", "");
                a = a.replace("]", "");
                a = a.replace(" ", "");
                System.out.println(a);
    }
}
