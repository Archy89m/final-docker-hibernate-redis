Description: 

There is a MySQL relational database with a schema (country-city, language by country). 
And there is a frequent request from the city, which comes with a delay. 
I came up with a solution - to transfer all data that is frequently requested to Redis (in memory storage of the key-value type).