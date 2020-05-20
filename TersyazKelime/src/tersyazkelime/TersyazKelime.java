
package tersyazkelime;
import java.util.Scanner;
public class TersyazKelime {
 public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        String kelime; //String türünde değişkenimiz
        System.out.println("kelime:"); //kullanıcıdan girmesini kelime girmesini istiyoruz.
        kelime=oku.next().toUpperCase(); //boşluğa kadar alıp,büyük harflere çeviriyoruz.
     
        for(int i=kelime.length()-1;i>=0;i--) //i'yi kelime uzunluğu kadar tanımlıyoruz.
        {
            System.out.print(kelime.charAt(i));
        }
     
    }
  
}
