# ZadanieRekrut

Projekt zawiera rozwiązanie do Zadania Rekutacyjnego.

BackEnd napisany w Java z użyciem framework Spring, obsługuje 3 endpointy:
1) EndpointOne (path: /status/ping)
  - odpowiada na sztywno Stringiem "pong";

2) EndpointTwo (path:  /numbers/sort-command)
- przyjmuje obiekt zawierający tablice int oraz String określający kolejność sortwania liczb (asc lub desc)
- jako odp uzyskujemy posortowaną tablice liczb

3) EndpointThree (path:  /currencies/get-current-currency-value-command)
- przyjmuje obiekt zawierający String z wartością szukanej waluty
- zwraca wartość szukanej waluty z api NBP