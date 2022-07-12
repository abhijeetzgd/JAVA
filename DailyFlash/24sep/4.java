import java.io.*;
import java.util.*;
class Token{

  public static void main(String [] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

for(int i=1;i<=2;i++){
    System.out.println("Enter Student  information ");
     String EmpDetail = "SWARUP,A,2,324.2";
     StringTokenizer st = new StringTokenizer(EmpDetail,",");
     String name = st.nextToken();
     String grade = st.nextToken();
     int age = Integer.parseInt(st.nextToken());
     double mark = Float.parseFloat(st.nextToken());

    System.out.println("Name = "+name);
    System.out.println("Grade = "+grade);
    System.out.println("Age = "+age);
    System.out.println("Marks = "+mark);
    System.out.println("");

    EmpDetail = "SONIA,c,23,522.05";
}
  }
}
