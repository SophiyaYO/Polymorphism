# **Wild Farm**

Your task is to **create a class hierarchy** like the picture below. All the classes _**except Vegetable**_, **Meat, Mouse, Tiger, Cat & Zebra should be abstract.**

![HierarchyUML](https://github.com/SophiyaYO/Polymorphism/blob/master/src/wildFarm/uml.png)

Input should be read from the console. **Every even line** will **contain information about the Animal** in following format:
{AnimalType} {AnimalName} {AnimalWeight} {AnimalLivingRegion} \[{CatBreed} = Only if its cat]
On the **odd lines** you will receive **information about the food** that you should give to the Animal. The line will consist of FoodType and quantity separated by a whitespace.
You should build the logic to determine if the animal is going to eat the provided food. **The Mouse and Zebra should check if the food is a Vegetable**. If it is they will eat it. Otherwise you should print a message in the format:
{AnimalType} are not eating that type of food!
**Cats eat any kind of food, but Tigers accept only Meat**. If Vegetable is provided to a tiger message like the one above should be printed on the console.
After you read information about the Animal and Food then invoke makeSound\() method of the current animal and then feed it. At the end print the whole object and proceed reading information about the next animal/food. The input will continue until you receive "End". After that print the information of all received animals in format:
{AnimalType} \[{AnimalName}, {CatBreed}, {AnimalWeight}, {AnimalLivingRegion}, {FoodEaten}]
Print all AnimalWeight with no trailing zeroes after the decimal separator. Use the DecimalFormat class.
**Note:** consider overriding toString\() method.

### **Example**

| Input | Output |
| --- | --- |
| Cat Gray 1.1 Home Persian | Meowwww |
| Vegetable 4 | Cat\[Gray, Persian, 1.1, Home, 4] |
| End | |
|||
| Tiger Tom 167.7 Asia | ROAAR!!! |
| Vegetable 1 | Tigers are not eating that type of food! |
| End | Tiger\[Tom, 167.7, Asia, 0] |
|||
| Zebra Jaguar 500 Africa | Zs |
| Vegetable 150 | Zebra\[Jaguar, 500, Africa, 150] |
| End | |
|||
| Mouse Jerry 0.5 Anywhere | SQUEEEAAAK! |
| Vegetable 0 | Mouse\[Jerry, 0.5, Anywhere, 0] |
| End                                    | |

