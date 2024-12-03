#include <stdio.h>
#include <stdlib.h>
int main() {
    double l, b;
    while (1) {
        printf("Length: ");
        if (scanf("%lf", &l) != 1 || l <= 0) {
            printf("Invalid input. Please enter a valid number greater than 0.\n");
            while (getchar() != '\n');
            continue;
        }
        break;
    }
    while (1) {
        printf("Breadth: ");
        if (scanf("%lf", &b) != 1 || b <= 0) {
            printf("Invalid input. Please enter a valid number greater than 0.\n");
            while (getchar() != '\n');
            continue;
        }
        break;
    }
    double area = l * b;
    printf("The area of a rectangle with length %.2f units and breadth %.2f units is %.2f unit².\n", l, b, area);
    return 0;
}