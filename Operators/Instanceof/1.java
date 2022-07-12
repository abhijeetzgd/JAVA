class Cricket {

  public static void main(String [] ags){

    Cricket test = new Cricket();
    Cricket oneday = new Cricket();
    Cricket t20 = new Cricket();
    Cricket t35=null;
    boolean res;

    res = test instanceof Cricket;
    System.out.println(res);
    System.out.println(oneday instanceof Cricket);
    System.out.println(t20 instanceof Cricket);
    System.out.println(t35 instanceof Cricket);


  }
}
