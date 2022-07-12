class eh{
  public static void main(String args[]){
    try{
      System.out.println("Hello"+" "+1/0);
    }
    catch(ArithmaticException e){
      System.out.println("World");
    }
  }
}
