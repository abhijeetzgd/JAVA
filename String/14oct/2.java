class StringDemo{

  public static void main(String []args){

    String s1 = "Shashi";
    String s2 = "Bagal";
    String s3 = "ShashiBagal";
    s1.concat(s2);

    System.out.println(s1);//shashi-scp
    System.out.println(s2);//bagal-scp

    s1 = s1.concat(s2);

    System.out.println(s1);//shashibagal-heap
    System.out.println(s2);//bagal-scp

    System.out.println(s1.concat(s2));//shashibagalbagal-heap

  }
}
