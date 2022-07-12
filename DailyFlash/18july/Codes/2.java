/*Program 2: Write a Java Program, which will contain one number ‘num’. Use the
following operators on it and print the output.
1. num >>>= 2
2. num <<= 3
3. num ^= 2
4. num = ++num
5. num = ~num
*/
class Demo{

  public static void main(String []args){
    int num =2;
    System.out.println(num >>>=2);
    System.out.println(num <<=2);
    System.out.println(num ^=2);
    System.out.println(++num );
    System.out.println(~num );

  }
}
