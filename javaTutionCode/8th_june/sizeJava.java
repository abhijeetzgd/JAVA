class sizeDemo{

  public static void main(String args []){

    System.out.println(sizeof(byte.class)); //1
    System.out.println(sizeof(short.class));//2
    System.out.println(sizeof(int.class));//4
    System.out.println(sizeof(long.class));//8

    System.out.println(sizeof(char.class));//2
    System.out.println(sizeof(float.class));//4
    System.out.println(sizeof(double.class));//8
    System.out.println(sizeof(boolean.class));//1,JVM depend

  }
}
