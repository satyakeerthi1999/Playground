#include<iostream>
 
int main()
{
   int array[100], position, c, n, value;
  std::cout<<"Enter the number of elements in the array"<<"\n";
 std::cin>>n;
std::cout<<"Enter the elements in the array"<<"\n";
   for (c = 0; c < n; c++)
      std::cin>>array[c];
  std::cout<<"Enter the location where you wish to insert an element"<<"\n";
std::cin>>position;
  if(position>n)
    std::cout<<"Invalid Input";
  else{
std::cout<<"Enter the value to insert"<<"\n";
   std::cin>>value;
 
   for (c = n - 1; c >= position - 1; c--)
      array[c+1] = array[c];
 
   array[position-1] = value;
 
   std::cout<<"Array after insertion is"<<"\n";
 
   for (c = 0; c <= n; c++)
      std::cout<<array[c]<<"\n";
  }
 
   return 0;
}