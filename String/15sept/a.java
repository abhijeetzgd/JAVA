class StringBuf{

  public static void main(String []args){

    StringBuffer sb1 = new StringBuffer("Pune");
    StringBuffer sb2 = new StringBuffer("Phaltan");
    StringBuffer sb3 = new StringBuffer("Baramati");
    StringBuffer sb = new StringBuffer();

System.out.println(sb);
System.out.println(sb1);
System.out.println(sb2);
System.out.println(sb3);

  sb.append("core2web");
  sb1.append("mh-12");
  sb2.append("mh-11");
  sb3.append("mh-42");

System.out.println(sb);
System.out.println(sb1);
System.out.println(sb2);
System.out.println(sb3);

  }
}
