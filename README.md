# Incantesimi

Questo è un progetto realizzato con Spring Boot
<br>alcune delle librerie importate:
- lombok - per creare in modo automatico costruttori e metodi (setters, getters, override del toString())
- h2 - provider di persistenza, ci permette di visualizzare il database generato grazie alle rotte che di trovano nel file del package restController
<br><br>In questo progetto viene consumata un'API (https://wizard-world-api.herokuapp.com/Spells/)
<br><br>
<img width="738" alt="Schermata 2023-03-22 alle 21 32 02" src="https://user-images.githubusercontent.com/91018701/227030963-8ad53e11-88ae-417c-a235-b8b022195ee0.png">
<br><br><br>
il file viene convertito da un formato JSON a un formato Java
<br><br>
<img width="723" alt="Schermata 2023-03-22 alle 21 36 16" src="https://user-images.githubusercontent.com/91018701/227031856-1b9fea2b-7c59-4495-8d60-2be3b781c519.png">
<br><br><br>
la classe pojo viene inserita nel package .models, ci servirà per decodificare i dati ricevuti dalla chiamata al metodo generate() inserito nel package .services, grazie al metodo .getForEntity dell'elemento di tipo RestTemplate, al quale vengono passati sia l'url dell'API, che la classe (in questo caso vettore di elementi istanziati dalla classe pojo) per decodificare il JSON
<br>
successivamente viene creato un package .repository
nel quale viene creata un'interfaccia che servirà per poter usare i metodi CRUD 
<br>
viene poi creato un package .services
nel quale viene creata una classe che contiene la logica business che poi verrà richiamata dalle varie rotte inseriti nella classe prensente nel package .restController


