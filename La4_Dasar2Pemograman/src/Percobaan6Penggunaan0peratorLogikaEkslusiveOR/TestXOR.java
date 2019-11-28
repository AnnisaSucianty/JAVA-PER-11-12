package Percobaan6Penggunaan0peratorLogikaEkslusiveOR;

public class TestXOR 
{
 public static void main(String[] args)
 {
     boolean va11 = true;
     boolean va12 = true;
     System.out.println(va11 ^ va12);
     
     va11 = false;
     va12 = true;
     System.out.println(va11 ^ va12);
     
     va11 = false;
     va12 = false;
     System.out.println(va11 ^ va12);
     
     va11 = true;
     va12 = false;
     System.out.println(va11 ^ va12);
 }   
}
