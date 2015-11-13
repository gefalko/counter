**Create counter**
----
  Create new counter and add to the list
  
* **URL**

  /users?name=:name

* **Method:**

  `POST`
  
*  **URL Params**

  **Required:**
 
  `name=[string]`

* **Data Params**

  None
  
* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{ status : "ok" }` 
    
* **Error Response:**

  * **Code:** 200 <br />
    **Content:** `{ status : "error", data : "Counter name exist" }`
    
  OR
    
  * **Code:** 200 <br />
    **Content:** `{ status : "error", data : "null can't be as name" }`

 
* **Sample Call:**

  ```javascript
    $.ajax({
      url: "/rest/create?name=firstCounter",
      dataType: "json",
      type : "POST",
      success : function(r) {
        console.log(r);
      }
    });
  ```
  
**Create counter**
----
  Create new counter and add to the list with initial value 
  
* **URL**

  /insert

* **Method:**

  `POST`
  
*  **URL Params**

  none

* **Data Params**

  `{
	  name : [string]
	  value : [integer]
  }`
  
* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{ status : "ok" }` 
    
* **Error Response:**

  * **Code:** 200 <br />
    **Content:** `{ status : "error", data : "Counter name exist" }`
    
  OR
    
  * **Code:** 200 <br />
    **Content:** `{ status : "error", data : "null can't be as name" }`

 
* **Sample Call:**

  ```javascript
    $.ajax({
      url: "/insert",
      data: {name:"firstCounter",value:10}
      dataType: "json",
      type : "POST",
      success : function(r) {
        console.log(r);
      }
    });
  ```
    
**Delete counter**
----
Delete counter from list
  
* **URL**

  /delete?name=:name

* **Method:**

  `DELTE`
  
*  **URL Params**

  **Required:**
 
  `name=[string]`

* **Data Params**

  None
  
* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{ status : "ok" }` 
    
* **Error Response:**

  * **Code:** 200 <br />
    **Content:** `{ status : "error", data : "Counter name not exist" }`
    
* **Sample Call:**

  ```javascript
    $.ajax({
      url: "/rest/delete?name=firstCounter",
      dataType: "json",
      type : "DELTE",
      success : function(r) {
        console.log(r);
      }
    });
  ```
  
**Set value**
----
Set counter value
  
* **URL**

  /setValue?name=:name&value:value

* **Method:**

  `PUT`
  
*  **URL Params**

  **Required:**
 
  `name=[string]`

  `value=[integer]`

* **Data Params**

  None
  
* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{ status : "ok" }` 
    
* **Error Response:**

  * **Code:** 200 <br />
    **Content:** `{ status : "error", data : "Counter name not exist" }`
    
 OR
 
  * **Code:** 200 <br />
    **Content:** `{ status : "error", data : "Value cannot be negative" }`   
    
* **Sample Call:**

  ```javascript
    $.ajax({
      url: "/rest/setValue?name=firstCounter&value=value",
      dataType: "json",
      type : "PUT",
      success : function(r) {
        console.log(r);
      }
    });
  ```
  
**Increase value**
----
Increase counter value 
  
* **URL**

  /increase?name=:name&value:value

* **Method:**

  `PUT`
  
*  **URL Params**

  **Required:**
 
  `name=[string]`

  `value=[integer]`

* **Data Params**

  None
  
* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{ status : "ok" }` 
    
* **Error Response:**

  * **Code:** 200 <br />
    **Content:** `{ status : "error", data : "Counter name not exist" }`
    
 OR
 
  * **Code:** 200 <br />
    **Content:** `{ status : "error", data : "Value cannot be negative" }`   
    
* **Sample Call:**

  ```javascript
    $.ajax({
      url: "/rest/increase?name=firstCounter&value=value",
      dataType: "json",
      type : "PUT",
      success : function(r) {
        console.log(r);
      }
    }); 
 ```
**Get counter**
----
 Return counter from list
  
* **URL**

  /get?name=:name

* **Method:**

  `GET`
  
*  **URL Params**

  **Required:**
 
  `name=[string]`

* **Data Params**

  None
  
* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{ status : "ok" , {name:"counter1",value:10}` 
  
 * **Error Response:**

  * **Code:** 200 <br />
    **Content:** `{ status : "error", data : "Counter name not exist" }`  

 
* **Sample Call:**

  ```javascript
    $.ajax({
      url: "/rest/get?name=firstCounter",
      dataType: "json",
      type : "GET",
      success : function(r) {
        console.log(r);
      }
    });
  ```
    
**Get all counters**
----
Return list of all counter
  
* **URL**

  /getall

* **Method:**

  `GET`
  
*  **URL Params**

  none

* **Data Params**

  None
  
* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{ status : "ok" , data: [{name:"counter1",value:10},{name:"counter2",value:20}]}` 
    
* **Sample Call:**

  ```javascript
    $.ajax({
      url: "/rest/getall",
      dataType: "json",
      type : "GET",
      success : function(r) {
        console.log(r);
      }
    });
  ```
