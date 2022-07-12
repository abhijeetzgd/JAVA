class IfDemo {

  public static void main(String [] args) {

    boolean x=true;                         //Error -only T or F
    boolean y=false;                         //boolean can not converted to int

    if(x && y){                            //false
            System.out.println("Hii");
    }
    if(x && true){                        //true
      System.out.println("Hii");

    }

    System.out.println("Hello");
  }
}
/*
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/Statement/If$ java IfDemo
Hii
Hello
*/
