# Task

Suppose that the RecipeBook class is not yet finished and you are tasked with testing the rest of the application.  We wish to construct unit tests for a subset of the user stories using a stubbed version of the RecipeBook.  During the grading phase, we will run a version of the Coffee Maker that leaves the RecipeBook as an abstract interface.   In this instance, we can't test the Recipe class, so there is no point in trying to modify tests relating to AddRecipe, DeleteRecipe, and EditRecipe.

# Deliverable

Your task is to use Mockito to create a mocked/stubbed version of RecipeBook and re-run the unit tests that are not focused on RecipeBook, such as PurchaseBeverage.  We want to find the bugs in the CoffeeMaker and Inventory classes using the stubbed RecipeBook, and to check that RecipeBook is being used appropriately using the mocking support of Mockito.

For the purchaseBeverage scenarios, this would involve checking that the  getAmtChocolate(), getAmtCoffee(), getAmtMilk(), and getPrice() methods are being called appropriately for the scenario. We will add some mutant versions of the CoffeeMaker that will check this aspect of the system.
