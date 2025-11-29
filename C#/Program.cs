using System;

class Program
{
    static double GetPositive(string name)
    {
        while (true)
        {
            Console.Write($"{name}: ");
            if (double.TryParse(Console.ReadLine(), out double value) && value > 0)
                return value;

            Console.WriteLine("Invalid input. Please enter a number > 0.");
        }
    }

    static void Main()
    {
        double l = GetPositive("Length");
        double b = GetPositive("Breadth");
        double area = l * b;

        Console.WriteLine($"The area of a rectangle with length {l} units and breadth {b} units is {area} unit².");
    }
}
