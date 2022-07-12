class Demo{

  public static void main(String [] args){
    int a=10;
    int b=5;
    int result=0;
    char ch = '*';

    switch (ch){

      case '+':
        result = a + b;
        System.out.println("result of a+b is = "+result );
        break;

        case '-':
          result = a - b;
          System.out.println("result of a-b is = "+result );
          break;

          case '*':
            result = a * b;
            System.out.println("result of a*b is = "+result );
            break;

            case '/':
              result = a / b;
              System.out.println("result of a/b is = "+result );
              break;

    }

  }
}
