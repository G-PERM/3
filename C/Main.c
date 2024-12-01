#include <stdio.h>
int main() {
  int l, b, a;
  printf("Length: "); 
  scanf("%d", &l);
  printf("Breadth: "); 
  scanf("%d", &b);
  a = l * b;
  printf("The area of a rectangle with length %d units and breadth %d units is %d unit².", l, b, a);
  return 0;
}