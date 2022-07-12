class Football{


}

class Cricket {

  public static void main(String [] ags){

    Cricket t20 = new Cricket();
    Cricket test = new Cricket();
    Football fmatch = new Football();

    System.out.println(fmatch instanceof Object);//true
    System.out.println(fmatch instanceof Football);//true




  //  System.out.println(Football instanceof Object);//error can not find symbol football

  }
}
