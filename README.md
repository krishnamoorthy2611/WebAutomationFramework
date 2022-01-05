# WebAutomationFramework
This is a Generic framework which can be used for most of the Web Apps

This framework contains the details in the following folder structure

main/java 
 - Contains the Page related Events and its Object details like xpath, id, name etc
 
 test/java
  - Contains the BaseTest class from where the execution starts and Test cases package where the Actual Test scripts are performed
  
  Used Extent Report which gets saved in Reports Folder after every execution
  
  Appropriate Drivers can be added in the drivers folder(as of now added the latest as on 15-Dec-2021)
  
  I have developed in Eclipse Mars2. You can also import in any version of eclipse with minimal tweaks like package name change, class name changes in testng.xml file
  
  Execution screenshots will be saved in unique date+hh+mm+ss.png as file name and it gets tagged to the report by adding a method available in BrowserMethods Class
  
  In Utilities Package The following are the fatures if the calss
  BrowserMethods.java - Contains all the methods related to Webdriver object such as geturl, refresh, switchTo etc
  ElementMethods.java - Contains all the methods related to Webelement object such as click, sendkeys, mousehover etc
  
  Just clone it and start Automating
  
  If you like it, Add a Comment and if there are any improvements feel free to reach me at krishnamoorthy2611@yahoo.co.in
