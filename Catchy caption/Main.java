#include <cstring>
#include <iostream>
#include <string>
int main()
{
   //Your code goes here
   std::string s;
   getline(std::cin,s);
   int l = 0 ;
   for(int i=0;s[i]!='\0';i++)
   {
       if(s[i] == ' ')
         l = l+1 ;
   }
  if(l>10)
    std::cout<<"Caption not eligible for the contest";
  else
    std::cout<<"Caption eligible for the contest" ;
   
}