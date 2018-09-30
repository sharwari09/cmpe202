CRC Cards for Lab4:

**_Class Customer_**:

Responsibilites:
 - Sign up for a table</br>
 - Receive notification for available table</br>
 - Confirm Reservation</br>
 - Cancel Reservation</br>
 - Get totol visitor along with the main customer</br></br>
 
 Collaborators:
 - ReservationHelper</br></br>
 - SignUp</br></br>
 
 _Has Customer name, number, number of people in party_
 
 ------------------------------------------------------------------------------------------------------------------------------
  **_Class SignUp_**:

Responsibilites:
 - Accept table booking request from Customer</br>
 
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
 

