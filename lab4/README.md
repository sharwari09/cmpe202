 CRC Cards for Lab4:

**_Class Customer_**:

Responsibilites:
 - Sign up for a table</br>
 - Receive notification for available table</br>
 - Confirm Reservation</br>
 - Cancel Reservation</br>
 - Get totol visitor along with the main customer</br></br>
 
 Collaborators:
 - ReservationHelper</br>
 - SignUp</br>
 
 _Has Customer name, number, number of people in party_
 
 ------------------------------------------------------------------------------------------------------------------------------
  **_Class SignUp_**:

Responsibilites:
 - Gets reservation details from customers</br>
 
 Collaborators:
 - Customer</br>
 - TableHelper</br>
 ------------------------------------------------------------------------------------------------------------------------------
 
 **_Class ReservationHandler_**:

Responsibilites:
 - Accept table booking request from Customer</br>
 - Notify Customer for availability of table</br>
 - Allocate table to the eligible (_first in waiting queue and matching chair count of the table_) customer</br>
 - Get available table status</br>
 
 Collaborators:
 - WaitingListHandler</br>
 - Customer</br>
 - TableHandler</br>
 ------------------------------------------------------------------------------------------------------------------------------
 **_Class WaitingListHandler_**:

Responsibilites:
 - Add customer to waiting queue</br>
 - Remove customer to waiting queue</br>
 
 Collaborators:
 - ReservationHandler</br>
 
  _Has Wait List Queue_

 ------------------------------------------------------------------------------------------------------------------------------
 
 **_Class TableHandler_**:

Responsibilites:
 - Get unoccupied/available table</br>
 - Get unoccupied/available table chair count</br>
 
 Collaborators:
 - Table</br>
 ------------------------------------------------------------------------------------------------------------------------------
 
  **_Class Table_**:

 _Has Table ID, number of chairs of table_

 ------------------------------------------------------------------------------------------------------------------------------
 
 Design Patterns used:
 
 - _Singleton Pattern_:</br>
 Single configuration manager/handler that is ReservationHandle is used here that handles all problems instead of creating multiple managers. Also, this pattern restricts the instantiation of a class to one object which ReservationHandle that will is the driver class and handles all the reservation work. 

- _State Pattern_:</br>
In this scenario, the WaitlistHandler executes different behaviors according to the Table State. If the state returned by TableHandler is _available_, then the WaitlistHandler will perform _addcustomerToWaitlist_ operation and the state will get changed to _unavailable_, and if the state returned is _unavailable_ then WaitlistHandler will perform _allocateTableToCustomer_ operation and the state will change to _available_. In this State design pattern, an WaitlistHandler object’s behavior is the result of state returned by TableHandler, and the behavior gets changed at runtime depending on the state.


