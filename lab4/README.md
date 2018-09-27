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
 ------------------------------------------------------------------------------------------------------------------------------
 
 **_Class ReservationHelper_**:

Responsibilites:
 - Accept table booking request from Customer</br>
 - Notify Customer for availability of table</br>
 - Assign table to the eligible customer</br>
 - Get unoccupied tables</br>
 
 Collaborators:
 - WaitingListHelper</br>
 - Customer</br>
 - TableHelper</br>
 ------------------------------------------------------------------------------------------------------------------------------
 
 **_Class TableHelper_**:

Responsibilites:
 - Retreive unoccupied table</br>
 
 Collaborators:
 - Table</br>
 ------------------------------------------------------------------------------------------------------------------------------
 
  **_Class Table_**:
 
 Responsibilites:
 - Get table occupied status</br>
 - Get table chair count</br>

 ------------------------------------------------------------------------------------------------------------------------------
 

