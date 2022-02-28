Collina-MS showing example of how Springboot and Dynamo Coexists.
=======

Next Steps
-----------

  1. REST-Controller
     * Add layer to translage JSON Body from Request to POJO Files
     * Add Version control as Header attribute to be backward compatible
     * Implement batch load for GET players end-point

  2. Repository
     - Create an abstration layer where GoodRepo is the the Abstraction for Repo and manage Product be an concrete object.
     - Add a Service layer to manage excptions and Business Rules control in terms to prevent faulty service request.

  3. Service Layer
     - Create Service Layer to implement business rules
     - Better Logging
     - Unit Test
      
  4. Config
     - Create Request to the Mock Server.
