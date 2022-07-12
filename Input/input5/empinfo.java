import java.io.*;
import java.util.*;
class Token{

  public static void main(String [] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String EmpDetail = br.readLine();
     StringTokenizer st = new StringTokenizer(EmpDetail,",");
/*
     name.trim();
     id.trim();
     sal.trim();
*/
     String name = (st.nextToken()).trim();
     int id = Integer.parseInt(st.nextToken());
     int  sal = Integer.parseInt(st.nextToken());

    System.out.println("Id = "+id);
    System.out.println("Name = "+name);
    System.out.println("sal= "+sal);

  }
}
