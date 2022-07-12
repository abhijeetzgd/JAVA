/*
Program 3: What will be the output of the statement if i=5, j=4
1. (i++ >= j++) && (--j < i++)
2. (--i < j--) || (j++ >= ++i)
*/
class Demo{
public static void main(String []args){
  int i=5,j=4;
  boolean ans;

  ans = (i++ >= j++) && (--j < i++);
      //  (5 >= 4) && (--j < i++)  i=6  j=5
      // true && (4 <  6)            i=7  j= 4
      // true && true
      // true

      System.out.println(ans);
      System.out.println(i);
      System.out.println(j);

      i=5;
      j=4;


ans = (--i < j--) || (j++ >= ++i);//i = 4  j = 3
    //  (4 < 4)||(3 >= 5)          //i = 5  j = 4
    //  false  || false
    //  false

    System.out.println(ans);
    System.out.println(i);
    System.out.println(j);


}
}
