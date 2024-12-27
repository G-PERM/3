double l;
while (true) {
    Console.Write("Length: ");
    string input = Console.ReadLine();
    if (double.TryParse(input, out l) && l > 0) {
        break;
    }
    else {
        Console.WriteLine("Invalid input. Please enter a valid number greater than 0.");
    }
}
double b;
while (true) {
    Console.Write("Breadth: ");
    string input = Console.ReadLine();
    if (double.TryParse(input, out b) && b > 0) {
        break;
    }
    else {
        Console.WriteLine("Invalid input. Please enter a valid number greater than 0.");
    }
}
double area = l * b;
Console.WriteLine($"The area of a rectangle with length {l} units and breadth {b} units is {area} unit².");