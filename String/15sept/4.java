class StringDemo{

  public static void main(String []args){

    String s1 = new String("Bielearn");
    String s2 = new String("BieMedia");
    String s3 = new String("CivicGen");

    System.out.println(s1.lastIndexOf('l'));
    System.out.println(s2.lastIndexOf('c'));//-1
    System.out.println(s3.lastIndexOf("i"));

  }
}
