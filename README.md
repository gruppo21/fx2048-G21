fx2048
======
*Pr2 Project 2014*
==================
*Gruppo21 :*<BR>
*Francesca Trudu matricola 44884*<BR>
*Fulgheri Nadia Jolanda matricola 39310*


The game 2048 built using JavaFX and Java 8. 
This is a fork based on the Javascript version: https://github.com/atzori/fx2048.git




Scopo del progetto
==================
Modifica dell'implementazione del gioco 2048 in modo da permettere, opzionalmente, di giocare autonomamente con un giocatore automatico. 



Strumenti utilizzati
====================
NetBeans - <BR>
GitHub - <BR>


Modalità di gioco:
=================
All'avvio del gioco compare una finestra principale attraverso la quale il giocatore può decidere se avviare il gioco manualmente facendo la prima mossa o se giocare tramite l'ausilio di un giocatore automatico premendo il pulsante apposito.
Se si di effettua la prima mossa si inizia a giocare in modalità manuale e si prosegue il gioco effettuando una delle quattro mosse possibili con i tasti freccia direzionali.
Se si preme il pulsante "Giocatore Automatico" si avvia il gioco in modalità automatica o si prosegue il gioco con tale modalità se si è precedentemente iniziata la manche in modalità giocatore standard; 
il giocatore automatico eseguirà un intero turno di gioco, ossia esegue una sequenza consecutiva di mosse fino alla fine della partita, ossia: 
-risultato vincente 2048; <BR>
-game over se non sono disponibili ulteriori mosse.



*Classi principali del gioco e modifiche effettuate*

*Game2048.java*

Implementa le funzioni e le variabili che si occupano di inizializzare e gestire l'interfaccia grafica,
da qui viene inizializzato anche un oggetto di tipo GameManager che si occupa di tutte le funzioni di gestione del gioco:<BR>
-meccanismi di somma e spostamento delle caselle;<BR>
-aggiornamento della griglia (a livello grafico);<BR> 
-aggiornamento dello score;<BR>
-conclusione del gioco in caso di game over o vittoria del gioco.

Modifiche effettuate:

—>  inserimento del button 'Giocatore Automatico':<BR> 
al click del bottone viene azionato il gioco automatico;

—>  creazione dell'oggetto Robot:<BR> 
tramite l'oggetto robot viene simulata la pressione del tasto SHIFT finchè non si ha il gameOver o il gameWon, il Robot continua a premere SHIFT e ogni volta l'ascoltatore intercetta l'evento permettendo l'esecuzione del gioco in autonomia;

—>  creazione Thread:<BR> 
creazione di un Thread che lavora parallelarmente al processo principale e si occupa di far funzionare il l'oggetto Robot e di sincronizzare il gioco;


*GameManager*
Nella classe GameManager il metodo move() si occupa di gestire tutto il procedimento del movimento di una casella e le sue conseguenze. 
Aggiornamento MyGriglia

*MyGiocatoreAutomatico*
Implementa l'interfaccia GiocatoreAutomatico.
Implimenta il metodo prossimaMossa dichiarato nell'interfaccia; tale metodo è utilizzato nel Game2048 su un oggetto GiocatoreAutomatico (memorizzato nella variabile myPlayer) e restituisce un int random da 0 a 3 con conseguente creazione di un valore Direction che viene passato al metodo move() del GameManager. 

*MyGriglia*
Implementa l'interfaccia Griglia.


License
===================

The project is licensed under GPL 3. See [LICENSE](https://raw.githubusercontent.com/brunoborges/fx2048/master/LICENSE)
file for the full license.
