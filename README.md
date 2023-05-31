# Project Work - Sito Agente 007

> Link al progetto su GitHub: [https://github.com/Emacost96/projectwork-007-topsecret](https://github.com/Emacost96/projectwork-007-topsecret)

<p align="center">
  <img src="https://i.imgur.com/NTm2Rzm.png" alt="007 logo" />
</p>

Il sito Agente 007 è stato creato come consegna finale del corso Generation Italy: Junior Java Developer.

Su questo sito è possibile (come cliente) noleggiare film/libri della serie di James Bond. Sul lato amministratore, è possibile aggiungere nuove opere (sia film che libri) tramite la sezione dashboard admin.

## Descrizione

L'obiettivo è creare il portale di un fan club dedicato all'agente James Bond che intende promuovere le proprie attività sul web.

Dalla homepage del sito sarà possibile accedere ai cataloghi delle opere letterarie di Ian Fleming sull'agente segreto e ai film realizzati. Ogni voce del catalogo sarà cliccabile per accedere ai dettagli del prodotto, che potrà essere preso in prestito presso il fan club previa registrazione al sito. I prodotti attualmente in prestito saranno presenti nel catalogo, ma con l'etichetta "Non disponibile".

La piattaforma sarà liberamente navigabile da parte di un visitatore non registrato e offrirà la possibilità di registrarsi agli utenti che desiderano prendere in prestito un'opera di proprietà del club o ricevere aggiornamenti dal negozio tramite newsletter. Lo staff avrà a disposizione un pannello di back-office con l'elenco degli utenti e delle opere, e potrà effettuare le classiche operazioni su tutti i modelli presenti.

## Installazione

> Scaricare [Spring Tool Suite](https://spring.io/tools), [XAMPP](https://www.apachefriends.org/) e [GitHub Desktop](https://desktop.github.com/).

### Primi passi

- Utilizzare GitHub Desktop per clonare il progetto nella cartella di default di Spring Boot.
- Utilizzare Spring Tool Suite per importare il file che contiene il progetto (la cartella sarà chiamata `projectwork-007-topsecret` in questo caso).
- Eseguire il pull del progetto utilizzando GitHub Desktop.
- Accedere a localhost:phpmyadmin e creare un nuovo database chiamato **james_bond**.
    - Importare il file `james_bond.sql` nel database all'interno del workspace.

- Avviare XAMPP come amministratore, avviando Apache e MySQL.
- Avviare il progetto su Spring Tool Suite come Spring Boot App.
- Nel browser, digitare `localhost:8051` nella barra degli indirizzi.

## Funzionalità del sito

1. Possibilità di navigare e visualizzare l'elenco dei film/opere presenti sul sito senza effettuare il login/registrazione.
2. Possibilità di effettuare il login e, eventualmente, accedere a una dashboard per ogni utente.
    - **Sezione Profilo**: elenco delle opere prenotate dal cliente e la possibilità di visualizzare i propri dati.
    - **Sezione Logout**: possibilità di effettuare il logout.
3. Una dashboard dedicata all'amministratore.
    - **Sezione Dashboard**: visualizzazione delle liste degli utenti registrati, delle opere inserite e delle opere prenotate. Saranno anche visibili gli ordini. Inoltre, sarà possibile eliminare un'opera o ripristinarla.
    - **Sezione Clienti**: elenco degli utenti registrati con la possibilità di eliminarli.
    - **Sezione Ordini**: elenco delle opere prenotate, mostrando anche la persona che ha effettuato la prenotazione.
    - **Sezione Prodotti**: elenco di tutte le opere con la possibilità di eliminarle.
    - **Sezione Aggiungi Opera**: possibilità di aggiungere un'opera che verrà inserita nel database e visualizzata nella pagina del catalogo.
    - **Sezione Logout**: possibilità di effettuare il logout.

## Autori

### Front End
- Cristina Di Mauro
- Fabrizio Vignati
- Letizia Bergero

### Back End
- Emanuele Costantini
- Hannah Gabrielle Santos
- Nicola Stasi