#include <iostream>
struct com {int i, j;};
com sum (com a, com b) {
  com c;
  c.i = a.i+b.i;
  c.j = a.j+b.j;
  return c;
}
com dif (com a, com b) {
  com c;
  c.i = a.i-b.i;
  c.j = a.j-b.j;
  return c;
}
com pro (com a, com b) {
  com c;
  c.i = a.i*b.i - a.j*b.j;
  c.j = a.i*b.j + a.j*b.i;
  return c;
}
int main () {
  com a, b, d;
  int c;
  std::cin >> c;
  std::cin >> a.i;
  std::cin >> a.j;
  std::cin >> b.i;
  std::cin >> b.j;
  switch (c) {
    case 1: d = sum (a, b);
      break;
    case 2: d = dif (a, b);
      break;
    case 3: d = pro (a, b);
      break;
    default: std::cout << "Invalid choice";
      c = 4;
      break;
  }
  if (c!=4)
    (d.j>=0)?std::cout << d.i << "+" << d.j << "i" : std::cout << d.i << d.j << "i";
}