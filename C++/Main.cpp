#include <iostream>
#include <limits>
int main() {
    double l, b;
    while (true) {
        std::cout << "Length: ";
        std::cin >> l;
        if (std::cin.fail() || l <= 0) {
            std::cout << "Invalid input. Please enter a valid number greater than 0.\n";
            std::cin.clear();
            std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
            continue;
        }
        break;
    }
    while (true) {
        std::cout << "Breadth: ";
        std::cin >> b;
        if (std::cin.fail() || b <= 0) {
            std::cout << "Invalid input. Please enter a valid number greater than 0.\n";
            std::cin.clear();
            std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
            continue;
        }
        break;
    }
    double area = l * b;
    std::cout << "The area of a rectangle with length " << l << " units and breadth " << b << " units is " << area << " unit².\n";
    return 0;
}