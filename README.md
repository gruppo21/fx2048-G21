fx2048 -Trudu-Fulgheri
======================
*Pr2 Project 2014*

*Gruppo21 :*<BR>
*Francesca Trudu matricola 44884*<BR>
*Fulgheri Nadia Jolanda matricola 39310*



Scopo del progetto:
Modifica dell'implementazione del gioco 2048 in modo da permettere, opzionalmente, di giocare autonomamente con un giocatore automatico. 



Strumenti utilizzati:
=
NetBeans - <BR>
GitHub - distributed version control system <BR>


Modalità di gioco:
=
All'avvio del gioco compare una finestra principale attraverso la quale il giocatore può deciderse se avviare il gioco manualmente facendo la prima mossa o premendo il pulsante apposito "Giocatore Automatico";
Se si di effettua la prima mossa si inizia a giocare in modalità manuale e si prosegue il gioco effettuando una delle quattro mosse possibili con i tasti freccia direzionali.
Se si preme il pulsante "Giocatore Automatico" il gioco si avvia e gioca in automatico un intero turno cioè esegue una sequenza di mosse fino alla fine del gioco, ossia: 
-risultato vincente 2048; <BR>
-game over se non sono disponibili ulteriori mosse.



*Game2048.java*
Classe contenente il main e il metodo start.
Implementa le funzioni e le variabili che si occupano di inizializzare e gestire l'interfaccia grafica,
da qui viene inizializzato anche un oggetto di tipo GameManager che si occupa di tutte le funzioni di gestione del gioco: 
-i meccanismi di somma e spostamento delle caselle, 
-aggiornamento della griglia (a livello grafico), 
-aggiornamento dello score, 
-conclusione del gioco in caso di game over e vittoria del gioco.


Modifiche effettuate:
-aggiunta del package giocatoreAutomatico (e giocatoreAutomatico.player);
-aggiunta delle classi implementate dalle interfacce.  //implementazione delle classi dichiarate nelle interfacce

myGriglia che viene aggiornata in base alla situazione del gioco


aggiunta di variabili , ascoltatore e Thread in Game2048 ->

giocatoreAutomatico: 
viene creato un oggetto giocatoreAutomatico tramite il suo metodo; 
button per attivare il giocatore automatico e conseguente azione che crea un Thread permettendo di simulare la pressione del tasto h tramite un oggetto di tipo Robot, evento che viene catturato da un ascoltatore apposito addBtnClicked che implementa l'azione da eseguire:

chiamata al metodo del giocatoreAutomatico prossimaMossa che restituisce un int random da 0 a 3, switch nel valore int con conseguente creazione di un valore Direction che viene passato al metodo move() del GameManager che si occupa di gestire tutto il procedimento del movimento di una casella e le sue conseguenze. 
Finchè non si ha il gameOver (e anche il gameWon) il Robot continua a premere h e ogni volta l'ascoltatore intercetta l evento permettendo l esecuzione del gioco in autonomia.

myGriglia e my giocatoreAutomatico sono le clessi che implementano le interfacce.
modifiche aggiunta del package giocatore automatico perchè dovervo mettere le interfacce
in tutto il progetto le modifiche fatte ascoltatore di eventi e un tread 
partendo dall'ascoltatore degli eventi ascolta quando viene fatto la pressione del tasto h e una volta che viene fatto questo richiama il metodo prossima mossa.è l'ascoltatore 
robot va in tred che viene mandato in esecuzione viene fatto in altro progetto che viene fatto in maniera sincronizzata.
il processo principale è l'interfaccia grafica in se lavora con l'altro thread in autonomia in modo parallelo.










