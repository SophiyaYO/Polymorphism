# **Vehicles**
***************

Write a program that models 2 vehicles \(Car and Truck) and will be able to simulate driving and refueling them in the summer. Car and truck both have fuel quantity, fuel consumption in liters per km and can be driven given distance and refueled with given liters. But in the summer both vehicles use air conditioner and their fuel consumption per km is increased by 0.9 liters for the car and with 1.6 liters for the truck. Also the truck has a tiny hole in his tank and when it gets refueled it gets only 95% of given fuel. The car has no problems when refueling and adds all given fuel to its tank. If vehicle cannot travel given distance its fuel does not change.

**Input**

   -	On the first line - information about the car in format "Car {fuel quantity} {liters per km}"
   -	On the second line – info about the truck in format "Truck {fuel quantity} {liters per km}"
   -	On third line - number of commands N that will be given on the next N lines
   -	On the next N lines – commands in format:
        -	Drive Car {distance}
        -	Drive Truck {distance}
        -	Refuel Car {liters}
        -	Refuel Truck {liters}
        
**Output**

After each Drive command print whether the Car/Truck was able to travel given distance in format if it’s successful. Print the distance with two digits after the decimal separator except trailing zeros. Use the DecimalFormat class:

>"Car/Truck travelled {distance} km"

Or if it is not:

>"Car/Truck needs refueling"

Finally print the remaining fuel for both car and truck rounded 2 digits after floating point in format:

>"Car: {liters}

>Truck: {liters}"

| Input | Output |
| --- | --- |
| Car 15 0.3 | Car travelled 9 km |
| Truck 100 0.9 | Car needs refueling |
| 4 |  Truck travelled 10 km |
| Drive Car 9 | Car: 54.20 |
| Drive Car 30 | Truck: 75.00 |
| Refuel Car 50 |  |
| Drive Truck 10 |  |
|||
| Car 30.4 0.4 | Car needs refueling |
| Truck 99.34 0.9 | Car travelled 13.5 km |
| 5 | Truck needs refueling |
| Drive Car 500 | Car: 113.05  |
| Drive Car 13.5 | Truck: 109.13 |
| Refuel Truck 10.300 |  |
| Drive Truck 56.2 |  |
| Refuel Car 100.2             |  |  

