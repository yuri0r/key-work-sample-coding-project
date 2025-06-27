Do as many tasks as possible from the following list


# Fullstack (frontend + backend)
- [x] Get the app to run on your local machine
  - windows was a pita my jdk path was borked (ofc)
  - added dockerfile to have mysql db 
  - added [bruno](https://docs.usebruno.com/) to work with the backend (its a free oss alternative to postman, and pretty cool!)
- [ ] There are bugs - find and fix them
  - do along the way
- [x] To display better ads we need more data - extend the form with more inputs and store the data in the database
  - fav color will do?
- [ ] At the moment anyone can use our app - implement authentication with a registration process
- [ ] Filling in the same data over and over again is annoying - prefill some of the form from the login data
- [ ] Who wrote that code? - Improve the code quality

# Frontend
- [ ] The cancel button does not do anything - implement it
- [ ] Navigation is bad - add a back to start link on all pages
- [ ] Why can I enter my name in the phone input? - Restrict the input to only allow E.164 phone numbers
- [ ] The text "Game" might not be a game - create a game the user has to win to get to the price
- [ ] We need to proudly present our company - add a header banner with our company logo and a link to our website
- [ ] Who implemented that ugly UI? - make it beautiful

# Backend
- [x] To get more people to use our app we need a good jackpot - add an entity + table for the price and fill it with different jackpots during the next startup
- [x] Fetch a random Jackpot
- [x] Something is wrong with the JackpotHistory - save formdata and a reference to the jackpot entity in the database
- [x] Be gone hackers! - Verify in the backend if the user is allowed to get a jackpot
  - technically needs auth from fullstack, instead checked for retries na dif "user" aka formdata exists
- [ ] The user can just fill any game in the frontend and the result is lost - add the full mvc for the game inputs
  - this confuses me since i never looked at the frontend
- [ ] What is currently broken and what is working? - Implement some junit tests