# adidas-test

### Case Study Software Engineer in Test
Consider you have been hired to be the technical lead to implement a test solution for a
modern web application, and you must automate the following scenario:
* Navigate to adidas.co
* Go to the “Tendencias” section and select Ultraboost
* Once you are in the shoe, confirm that you are on the right URL
* Click in “Guia de tallas” and verify that the size 28.8 cm values are properly present in the table
* Close the window and add the product to your wish list
* Navigate to the wish list and give a click in “Iniciar session”
* Enter the data to login and verify that you are logged correctly, and you still have the product in your wish list.

**Note**: If you go to the trends section and ultraboost is not present, select another trend.

### Run test
```
mvn clean verify
```