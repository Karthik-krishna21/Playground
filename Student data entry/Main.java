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
  student s;
  std::cin.getline (s.name, 50);
  std::cin >> s.roll;
  std::cin >> s.marks;
  std::cout << "\nStudent Details";
  std::cout << "\nName: " << s.name;
  std::cout << "\nRoll: " << s.roll;
  std::cout << "\nMarks: " << s.marks;
}