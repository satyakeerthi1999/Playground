#include <iostream>
void fun(int *a, int *b)
{
     int t;
     t = *a;
     *a = *b;
     *b = t;
}
int main()
{
   int a,b;
   std::cin>>a>>b ;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b ;
  fun(&a,&b);
  std::cout<<"\nAfter swapping a= "<<a<<" and b="<<b ;

}
