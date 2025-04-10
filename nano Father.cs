using System;

class PoliceChase
{
    static void Main()
    {
        int police = 0, thief = 40, time = 0;
        Console.WriteLine("🚨 CHASE BEGINS!");
        while (police < thief)
        {
            time++;
            police += 5;
            thief += 2;
            Console.WriteLine($"After {time}s: Police={police}m, Thief={thief}m");
        }
        Console.WriteLine($"🏁 CAUGHT AFTER {time} SECONDS!");
    }
}