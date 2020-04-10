#include<iostream>
#include<string>
int main() 
{ 
	std::string fnum;
  std::string str ;
	//Type your code here
  std::cin>>fnum ;
   int pos = fnum.find("."); 
  if(pos == -1)
    std::cout<<"Floating part is : "<<str ;
  else
  {
     str = fnum.substr(pos+1) ;
   std::cout<<"Floating part is : "<<str ;
  } 
}