# PP Foods

## How to Add and Hide API Key
1. In main root folder create a .env file
2. Add API_KEY=key to .env file
3. In .gitignore file add .env on a new line so it won't be committed

## Tasks
1. Read the Open Prices docs and test GET /api/v1/prices in a browser or Postman
2. Set the app theme colors and font in the theme files
3. Create an empty screen for each of those four destinations and wire up navigation
4. Create the bottom navigation bar with Home, Plan meals, My Plan, and Resources
5. Build the Home screen layout with the four feature cards

6. Make each Home card open its matching screen
7. Build the Shopping list screen generated from the planned meals
8. Build the My Plan screen showing the saved meal plan
9. Build the pickup meals screen with a list of options
10. Add a food search bar to the Plan meals screen

11. Write the API service interface with the prices endpoint and query parameters
12. Write a repository class that calls the API and returns parsed results
13. Handle errors and empty results (“No prices found near you”)
14. Create the data class for a Product based on the JSON
15. Create the data class for Store (name, address, state)

16. Create the data class for a Meal (name, cost, ingredients)
17. Create the data class for a Pickup (store, priceOfProducts, date)
18. Create the data class for a plan (meals, budget, preferences)
19. Connect the search to the API and show results in a list (product, price, store)
20. Add Meal objects to Plan meals screen

21. Add sorting so the cheapest price shows first
22. Filter product results to stay under the shared budget
23. Build the “cheapest stores” view for one product, listing stores from lowest to highest price
24. Add an “Add to plan” button that saves the chosen item and its price to My Plan
25. Add an “Add to plan” button on meals and pickup options

26. Save the plan locally so it persists when the app closes
27. Show remaining budget on My Plan as meals are added
28. Add sample grocery meal/product data (10+ meals)
29. Add empty states (“No meal plan yet”) and basic error handling
30. Test filtering the prices by category, currency (USD), and location to see what comes back

31. Add the Open Food Facts data credit and link to the app and README (the data uses an open license that requires crediting the source)
32. Add a note on the pickup screen that low prices don’t always mean healthy
33. Show a loading spinner while the API call runs
34. Build the Resources screen with the assistance list
35. Create the data model for a resource (name, type, phone, link)

36. Add sample pickup data (restaurants, corner stores, mini-marts, gas-station kitchens)
37. Add sample Louisiana food assistance data (SNAP contacts, food banks)
38. Make phone numbers and links on Resources tappable
39. Check whether Louisiana stores have enough data to be useful, and write down what you find
