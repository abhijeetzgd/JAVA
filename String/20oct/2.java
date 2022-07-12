class StringBufferDemo{

  public static void main(String []args){

      StringBuffer sb1 = new StringBuffer("Shashi");

      StringBuffer sb2 = new StringBuffer();

System.out.println(sb1.charAt(3));//s
System.out.println(sb2.charAt(3));//exception because lenght is 0

  }
}
