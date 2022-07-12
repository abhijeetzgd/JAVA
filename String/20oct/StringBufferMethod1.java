class StringBufferDemo{

  public static void main(String []args){

      StringBuffer sb1 = new StringBuffer("Shashi");
      StringBuffer sb = new StringBuffer("Biencaps");

      System.out.println(sb1.length());//6
      System.out.println(sb1.capacity());//empty 16 + sizeof("shashi") = 22s

      StringBuffer sb2 = new StringBuffer();

      System.out.println(sb2.length());//0
      System.out.println(sb2.capacity());//empty 16 + null = 16

//charAt
      System.out.println(sb1.charAt(3));//s

//append
      sb1.append("bagal");
      System.out.println(sb1);

      sb1.append(28);
      System.out.println(sb1);//shashibagal28

      sb1.append(sb);
      System.out.println(sb1);//shashibagal28biencaps
//insert

      sb1.insert(13,"core2web");
      System.out.println(sb1);//shashibagal28core2webbiencaps

//delete

      sb1.deleteCharAt(11);
      sb1.deleteCharAt(11);
      System.out.println(sb1);//shashibagalcore2webbiencaps

      sb1.delete(6,11);//shashicore2webbiencaps
      System.out.println(sb1);//shashicore2webbiencaps

//reverse
      sb1.reverse();
      System.out.println(sb1);//reverse
      sb1.reverse();

//setLength
      sb1.setLength(10);
      System.out.println(sb1);//shashicore


  }
}
