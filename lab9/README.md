# **ReImplementation of Strategy Pattern using Lambda in Java8**

## Comparison between Strategy Pattern and Lambda Implementation

### Strategy Pattern Implementation
------------------------------------------------------------------------------------------------------------------------------
In the Pattern source code, Strategy Pattern is used to change the behavior of an algorithm at runtime. To apply different types of discounts to a purchase, based on the Festival such as Diwali, Christmas or New Year. For Strategy pattern, created a Discount interface which will be implemented by the following strategies:

- ChistmasDiscount.java

- DiwaliDiscount.java

Then a Context class is used to set the desired Discount strategy and execute the "Apply Discount" operation in the Discount Strategy implementation. 

From the Client class, the desired strategy is passed and the discount is calculated according to the Festival Strategy. Thus, by creating various strategy implementations we can get discounts according to the Festival.

### Lambda Implementation
------------------------------------------------------------------------------------------------------------------------------
In the Lambda implementation, it is less verbose to implement the same functionality as above. By leveraging Lambda in Java8, we can get the same work done by creating a Discount interface class and provide **no** implementations to it.

By creating a Client.java, we will create a List (_of type Discount interface_) of all our desired Strategies and provide their complete implementations in a lambda function. Once the List of Strategies is created, iterate over each strategy and invoke the method declared in the Discount interface. 

Thus we are reducing the number of classes, as we are avoiding implementations of the Discount interface. Less verbose in contrast to Strategy pattern.
