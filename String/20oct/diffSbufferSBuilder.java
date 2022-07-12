import java.util.GregorianCalendar;

class Dif{

  public static void main(String []args){

    long startTime = new GregorianCalendar().getTimeInMillis();
    long startMemory = Runtime.getRuntime().freeMemory();

    //StringBuffer sb = new StringBuffer("shashi");
    StringBuilder sb = new StringBuilder("Shashi");
    for(int i=1;i<10000000;i++){

        sb.append("Hello");
    }

    long endTime = new GregorianCalendar().getTimeInMillis();
    long endMemory = Runtime.getRuntime().freeMemory();

    System.out.println("Time  = "+ (endTime - startTime));
    System.out.println("Memory  = "+( endMemory - startMemory));

  }
}
