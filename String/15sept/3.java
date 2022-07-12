class StringDemo{

  public static void main(String []args){

    String s1 = new String("Bielearn");
    String s2 = new String("BieMedia");
    String s3 = new String("CivicGen");

    System.out.println(s1.indexOf('l'));       //3
    System.out.println(s1.indexOf('e',3));       //4
    System.out.println(s1.indexOf("earn"));       //3

  }
}
