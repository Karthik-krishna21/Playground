#include<iostream>
#include<cstring>
using namespace std;
struct Student { char name[30]; char department[20]; int yearOfStudy; float cgpa; };
int main()
{
  //Type your code here.
  int n, i, j;
  std::cout << "Enter the number of students";
  std::cin >> n;
  Student a[n], t;
  for (i=0; i<n; i++) {
    std::cout << "\nEnter the details of student " <<i+1;
    std::cout << "\nEnter name";
    std::cout << "\nEnter department";
    std::cout << "\nEnter year of study";
    std::cout << "\nEnter cgpa";
    std::cin >> a[i].name;
    std::cin >> a[i].department;
    std::cin >> a[i].yearOfStudy;
    std::cin >> a[i].cgpa;
  }
  for (i=0; i<n; i++)
    for (j=i+1; j<n; j++) {
      if (strcmp (a[i].name, a[j].name) > 0) {
        t = a[i];
        a[i] = a[j];
        a[j] = t;
      }
    }
  std::cout << "\nDetails of students";
  for (i=0; i<n; i++) {
    std::cout << "\nStudent " << i+1;
    std::cout << "\nName:" << a[i].name;
    std::cout << "\nDepartment:" << a[i].department;
    std::cout << "\nYear of study:" << a[i].yearOfStudy;
    std::cout << "\nCGPA:" << a[i].cgpa;
  }
}