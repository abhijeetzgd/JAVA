class overload{
  int x;
  double y;
  void add(int a,int b){
    x=a+b;
  }

  void add(double c, double d){
    y=c+d;
  }
  overload(){
    this.x=0;
    this.y=0;
  }
}

class Overload_methods {

  public static void main(String args[]){
    overload obj = new overload();
    int a=2;
    double b=3.2;
    obj.add(a,a);
    obj.add(b,b);
    System.out.println(obj.x+" "+obj.y);
  }
}
