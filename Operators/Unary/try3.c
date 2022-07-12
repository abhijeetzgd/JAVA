#include<stdio.h>
void main(){
  int ans=0;
  int num=10;

  ans = num++ + num++;

  printf("%d\n",ans );
  printf("%d\n",num );

}
