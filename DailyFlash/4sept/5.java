import java .io.*;
class Demo{

public static void main(String []arg)throws IOException{

  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);

  System.out.print("Enter day");
  int d = Integer.parseInt(br.readLine());

  System.out.print("Enter Month");
  int m = Integer.parseInt(br.readLine());

  System.out.print("Enter year");
  int y = Integer.parseInt(br.readLine());

  if(d>=28&&m==2&&y%4!=0){
    System.out.print("Date is Invalid\n");
    System.exit(0);
  }

  if(d>31){
    System.out.print("Date is Invalid\n");
      System.exit(1);
}

  if(m>12){
    System.out.print("Date is Invalid\n");
      System.exit(1);
  }

  if(y<0){
      System.out.print("Date is Invalid\n");
        System.exit(1);
  }

  if(d<=30   && (m==2 ||m==4||m==6||m==7||m==9||m==11))
  {
      System.out.print("Date is valid\n");
        System.exit(1);
  }
  if(d<=30   && (m==1 ||m==3||m==5||m==6||m==8||m==10||m==12)){
    System.out.print("Date is valid\n");
      System.exit(1);
  }
    //System.exit(1);
}
}
