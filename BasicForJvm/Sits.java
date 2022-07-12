class Computer{

  static int studentCnt=100;
  int teacherCnt=10;
  static void studentInfo(){

    System.out.println("no of student in Computer department = "+studentCnt);
  }

  void teacherInfo(){

    System.out.println("no of teacher in Computer department = "+teacherCnt);
  }
}

class Mechanical{

  static int studentCnt=200;
  int teacherCnt=15;
  static void studentInfo(){

    System.out.println("no of student in Mechanical department = "+studentCnt);
  }

  void teacherInfo(){

    System.out.println("no of teacher in Mechanical department = "+teacherCnt);
  }
}

class Collage{
  public static void main(String args[]){
      Computer hod1 = new Computer();
      hod1.teacherCnt = 6;
      hod1.studentInfo();
      hod1.teacherInfo();

      Computer hod2 = new Computer();
      hod2.teacherCnt = 4;
      hod2.studentInfo();
      hod2.teacherInfo();

      Mechanical h1 = new Mechanical();
      h1.teacherCnt = 10;
      h1.studentInfo();
      h1.teacherInfo();

      Mechanical h2 = new Mechanical();
      h2.teacherCnt = 5;
      h2.studentInfo();
      h2.teacherInfo();
  }
}
