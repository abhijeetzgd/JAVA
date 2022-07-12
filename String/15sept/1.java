class StringDemo{

  public static void main(String []args){

    String s1 = new String("Kanhaiya");
    System.out.println(s1);//Kanhaiya
    s1.replace('a','p');
    System.out.println(s1.replace('a','p'));//Kpnhaiyp
    System.out.println(s1);//Kanhaiya

  }
}
