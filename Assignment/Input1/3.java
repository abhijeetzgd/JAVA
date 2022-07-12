import java.io.*;

class Demo {

    public static void main(String[] args)throws IOException{
     int a,b,add,sub,mul,div;
     InputStreamReader isr=new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(isr);

     System.out.print("Enter First number  : ");
     a=Integer.parseInt(br.readLine());
     System.out.print("Enter Second number  : ");   
     b=Integer.parseInt(br.readLine());

     add=a+b;
     sub=a-b;
     mul=a*b;
     div=a/b;

     System.out.println("Addition of "+a+"and "+b+" is : "+add);
     System.out.println("Subtraction of "+a+"and "+b+" is : "+sub);
     System.out.println("Multiplication of "+a+"and "+b+" is : "+mul);
     System.out.println("Division of "+a+"and "+b+" is : "+div);

    }
}
