#include <iostream>
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   //Your code goes here
   struct student s ;
   //std::cin >> s.name;
  std::cin.getline(s.name,50) ;
  std::cin >> s.roll;
  std::cin >> s.marks;
   std::cout<<"\nStudent Details\n";
  std::cout<<"Name: "<<s.name<<"\n" ;
  std::cout<<"Roll: "<<s.roll<<"\n";
  std::cout<<"Marks: "<<s.marks;
}