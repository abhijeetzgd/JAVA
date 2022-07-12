class Demo {

  public static void main(String [] args){

    int year = 3;
    int marks = 80;

    switch (year){

      case 3:

        switch(marks){

            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:


                System.out.println("Student eligible for Educational Scholarship");
                break;

            default:
                System.out.println("Student not eligible for Educational Scholarship");
                break;

        }

        break;
      case 1:
        System.out.println("Student not eligible for Educational Scholarship");
        break;

      case 2:
        System.out.println("Student not eligible for Educational Scholarship");
        break;

      case 4:
        System.out.println("Student not eligible for Educational Scholarship");
        break;
    }
  }
}
