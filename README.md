# Candidate Backend

To run the docker compose enter "docker-compse up -d" command from your terminal.

## Endpoints

GET localhost:8080/api/candidate returns all the candidates.
GET localhost:8080/api/candidate/{id} returns the candidate with given id.
POST localhost:8080/api/candidate adds the candidate with given body.
PUT localhost:8080/api/candidate/{id} updates the candidate with given id and JSON body.
DELETE localhost:8080/api/candidate/{id} deletes the candidate with given id.

## Info

I didn't give the container's name of database in application.properties in case of you are using Windows.




