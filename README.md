# Project Work - Sito Agente 007

> Link del progetto su GitHub: [https://github.com/Emacost96/projectwork-007-topsecret](https://github.com/Emacost96/projectwork-007-topsecret)  

<p align="center">
  <img src="https://i.imgur.com/NTm2Rzm.png" alt="007 logo" />
</p>

Il sito Agente 007 è un sito realizzato per la consegna finale del corso di Generation Italy: Junior Java Developer.  

In questo sito, è possibile (lato cliente) noleggiare dei film/libri sulla serie di James Bond. Sul lato admin, è possibile aggiungere nuove opere (che sono film oppure libri) tramite la sezione dashboard admin.

## Consegna
Si vuole realizzare il portale di un fan club dedicato all'agente James Bond che intende promuovere le proprie attività sul web.   

Dalla home del sito dev'essere possibile accedere ai cataloghi relativi alle opere letterarie di Ian Fleming sull'agente segreto e ai film realizzati; ogni voce del catalogo è cliccabile per accedere ai dettagli del prodotto, che è possibile prendere in prestito presso il fan club previa registrazione al sito; i prodotti al momento già in prestito saranno presenti in catalogo ma con un'etichetta "Non disponibile".  

La piattaforma dev'essere liberamente navigabile da parte di un visitatore non registrato e in più deve dare la possibilità di registrarsi agli utenti che vogliano prendere in prestito un'opera in possesso del club o ricevere aggiornamenti dal negozio tramite newsletter. Deve essere inoltre data la possibilità allo staff, che da apposito pannello di back-office ha a disposizione l'elenco degli utenti e quello delle opere, di effettuare le classiche operazioni su tutti i modelli presenti.

## Installazione

> Scaricare [Spring Tool Suite](https://spring.io/tools), [XAMPP](https://www.apachefriends.org/) e [GitHub desktop](https://desktop.github.com/).
### Primi passi
- Su GitHub desktop, fare un clone del progetto dentro al workspace di default di Spring Boot.
- Su Spring Tool Suite, fare un importazione per aprire il file che contiene il seguente progetto (in questo caso la cartella è chiamata `projectwork-007-topsecret`).
- Su GitHub desktop, fare il pull del progetto.
- Su localhost:phpmyadmin, fare un nuovo database chiamata **james_bond**. 
    - Dal database, fare l'importazione del file `james_bond.sql` dentro il workspace.

- Far partire XAMPP come amministratore, startando Apache e MySQL.
- Far partire il progetto su Spring Tool Suite come Spring Boot App.
- Andare nel browser e sulla barra degli indirizzi digitare `localhost:8051`.

## Funzioni del sito
1. Possibilità di navigare e vedere la lista dei film/opere presenti sul sito senza fare il login/registrazione.
2. Possibilità di fare il login ed eventualmente avere una dashboard per ciascun utente
    - **Sezione Profilo** - elenco delle opere prenotate dal cliente stesso e anche la possibilità di vedere i suoi dati.
    - **Sezione Logout** - possibilità di fare il logout
3. Una dashboard soltanto per l'admin
    - **Sezione Dashboard**, dove si vedono le liste degli utenti iscritti, le opere inserite, e le opere prenotate. Si vedono anche gli ordini. C'è anche la possibilità di eliminare un'opera oppure ripristinarla
    - **Sezione Clienti** - elenco degli utenti iscritti con la possibilità di eliminarli
    - **Sezione Ordini** - elenco delle opere prenotate, visualizzando anche la persona che ha prenotato l'opera stessa.
    - **Sezione Prodotti** - elenco di tutte le opere e anche la possibilità di eliminarle.
    - **Sezione Aggiungi Opera** - possibilità di aggiungere un'opera che verrà poi messo nel database una volta inserita e messa anche nella pagina catalogo.
    - **Sezione Logout** - possibilità di fare il logout

## Autori

### Front End
- Cristina Di Mauro
- Fabrizio Vignati
- Letizia Bergero

### Back End
- Emanuele Costantini
- Hannah Gabrielle Santos
- Nicola Stasi

