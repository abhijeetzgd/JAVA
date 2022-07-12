/*//with object
class BCCI{
 void niyam(){
    System.out.println("BCCI RULES");
  }

}

class Ipl{
public static void main(String[] args){
    System.out.println("Icc rules");
    BCCI rule=new BCCI();
    rule.niyam();
    }
}
*/

//without object 
class BCCI{
 static void niyam(){
    System.out.println("BCCI RULES");
  }

}

class Ipl{
public static void main(String[] args){
    System.out.println("Icc rules");
    BCCI.niyam();
    }
}

