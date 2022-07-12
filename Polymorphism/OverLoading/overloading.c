#include<stdio.h>

void add(int a){

  printf("Add = %d",a);
}


void add(int a,int b){

  printf("Add = %d",a+b);
}

/*
void add(char a){

  printf("Add = ",a);
}
*/
void main(){

  add(9);
  add(9,9);
  add('a');
}
