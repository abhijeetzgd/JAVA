class StringBufferDemo{

  public static void main(String []args){

      StringBuffer sb1 = new StringBuffer("Shashi28Bagal");

      StringBuffer sb2 = new StringBuffer();


      //deleteCharAt

            sb1.deleteCharAt(6);
            sb1.deleteCharAt(6);
            System.out.println(sb1);//ShashiBagal
//delete
            sb1.delete(6,9);
            System.out.println(sb1);


  }
}
