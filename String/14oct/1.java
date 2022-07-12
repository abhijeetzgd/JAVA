class StringDemo{

  public  static void main(String []args){

    String s1 = "Shashi";
    String s2 = new String ("Shashi");
    String s5 = new String ("SHASHI");
    String s3 = "Biencaps";
    String s4 = new String ("Bielern");
    String s6 = "ShashiKant";
    String s7 = "ShashiKataa";
    System.out.println(s1.equals(s2));//true
    System.out.println(s1.equals(s5));//

    System.out.println(s1.equalsIgnoreCase(s2)); //ignore case

    //scenario1:

    System.out.println(s1.compareTo(s2)); //0
    System.out.println(s1.compareTo(s3)); //0
    System.out.println(s1.compareTo(s6)); //-4
    System.out.println(s6.compareTo(s7)); //6

  }
}
