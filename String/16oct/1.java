class StringBufferDemo{

  public static void main(String [] args){

    StringBuffer sb = new StringBuffer();

    System.out.println(sb); //
    System.out.println(sb.capacity());//16

    sb.append("Core2web");

    System.out.println(sb);//Core2web
    System.out.println(sb.capacity());//16

    sb.append("Technology");

    System.out.println(sb);//34
    System.out.println(sb.capacity());//core2webTechnology

    sb.append("Powered by");

    System.out.println(sb);//34
    System.out.println(sb.capacity());//core2webTechnology

    sb.append("Biencapsy");

    System.out.println(sb);//34
    System.out.println(sb.capacity());//core2webTechnology

  }
}
