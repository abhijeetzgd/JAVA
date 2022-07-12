#include<stdio.h>
void main(){

  printf("%ld\n",sizeof(int));  //4
  printf("%ld\n",sizeof(long));//8
  printf("%ld\n",sizeof(char));//1
  printf("%ld\n",sizeof(float));//4
  printf("%ld\n",sizeof(double));//8
  printf("%ld\n",sizeof(_Bool));//1

}
/*
Output
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/javaTutionCode/6th_june$ cc pr1.c
abhijeetzgd@abhijeetzgd-ThinkPad-E490:~/Java/javaTutionCode/6th_june$ ./a.out
4
8
1
4
8
1
*/
