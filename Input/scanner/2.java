import java.util.*;

class Scannerdemo {
public static void main(String []args){
  Scanner sc = new Scanner(System.in);

  int x = sc.nextInt();
  String s = sc.next();
  char ch = sc.next().charAt(0);
  float f = sc.nextFloat();

System.out.println(x);
System.out.println(s);
System.out.println(f);
System.out.println(ch);
System.out.println(x/0);

}}
