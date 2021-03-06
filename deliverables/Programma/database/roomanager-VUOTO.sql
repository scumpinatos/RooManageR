-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Creato il: Apr 06, 2016 alle 12:05
-- Versione del server: 5.6.26
-- Versione PHP: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `roomanager`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `anagrafica`
--

CREATE TABLE IF NOT EXISTS `anagrafica` (
  `codicefiscale` varchar(255) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `cognome` varchar(255) NOT NULL,
  `datanascita` varchar(255) NOT NULL,
  `indirizzo` varchar(255) NOT NULL,
  `nazionalita` varchar(255) NOT NULL,
  `numerodocumento` varchar(255) NOT NULL,
  `tipodocumento` int(11) NOT NULL,
  `telefono` varchar(255) NOT NULL,
  `cellulare` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `anagrafica`
--

INSERT INTO `anagrafica` (`codicefiscale`, `nome`, `cognome`, `datanascita`, `indirizzo`, `nazionalita`, `numerodocumento`, `tipodocumento`, `telefono`, `cellulare`, `email`) VALUES
('CODICEFISCALE1', '', '', '', '', 'ITA', '', 0, '', '', '');

-- --------------------------------------------------------

--
-- Struttura della tabella `anagraficamansione`
--

CREATE TABLE IF NOT EXISTS `anagraficamansione` (
  `codicefiscaleanagrafica` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `nomestruttura` varchar(255) NOT NULL,
  `codicefiscaleproprietario` varchar(255) NOT NULL,
  `tipomansione` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `anagraficamansione`
--

INSERT INTO `anagraficamansione` (`codicefiscaleanagrafica`, `password`, `nomestruttura`, `codicefiscaleproprietario`, `tipomansione`) VALUES
('CODICEFISCALE1', '123stella', '', 'CODICEFISCALE1', 2);

-- --------------------------------------------------------

--
-- Struttura della tabella `anagraficastanza`
--

CREATE TABLE IF NOT EXISTS `anagraficastanza` (
  `codicefiscaleanagrafica` varchar(255) NOT NULL,
  `numerostanza` varchar(255) NOT NULL,
  `nomestruttura` varchar(255) NOT NULL,
  `codicefiscaleproprietario` varchar(255) NOT NULL,
  `tipo` int(11) NOT NULL,
  `ingresso` varchar(255) NOT NULL,
  `uscita` varchar(255) NOT NULL,
  `costo` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `nazionalita`
--

CREATE TABLE IF NOT EXISTS `nazionalita` (
  `abbreviazione` varchar(255) NOT NULL,
  `valore` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `nazionalita`
--

INSERT INTO `nazionalita` (`abbreviazione`, `valore`) VALUES
('DEU', 'Tedesca'),
('ENG', 'Inglese'),
('FRA', 'Francese'),
('ITA', 'Italiana');

-- --------------------------------------------------------

--
-- Struttura della tabella `stanza`
--

CREATE TABLE IF NOT EXISTS `stanza` (
  `nomestruttura` varchar(255) NOT NULL,
  `codicefiscaleproprietario` varchar(255) NOT NULL,
  `numero` varchar(255) NOT NULL,
  `tipo` int(11) NOT NULL,
  `descrizione` varchar(255) NOT NULL,
  `mq` float NOT NULL,
  `agibile` tinyint(1) NOT NULL,
  `permanenza` tinyint(1) NOT NULL,
  `visita` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `struttura`
--

CREATE TABLE IF NOT EXISTS `struttura` (
  `nome` varchar(255) NOT NULL,
  `codicefiscaleanagrafica` varchar(255) NOT NULL,
  `indirizzo` varchar(255) NOT NULL,
  `nstanze` int(11) NOT NULL,
  `descrizione` varchar(255) NOT NULL,
  `agibile` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `anagrafica`
--
ALTER TABLE `anagrafica`
  ADD PRIMARY KEY (`codicefiscale`),
  ADD KEY `codicefiscale` (`codicefiscale`),
  ADD KEY `nazionalita` (`nazionalita`);

--
-- Indici per le tabelle `anagraficamansione`
--
ALTER TABLE `anagraficamansione`
  ADD KEY `codicefiscaleanagrafica` (`codicefiscaleanagrafica`),
  ADD KEY `nomestruttura` (`nomestruttura`),
  ADD KEY `codicefiscaleproprietario` (`codicefiscaleproprietario`);

--
-- Indici per le tabelle `anagraficastanza`
--
ALTER TABLE `anagraficastanza`
  ADD KEY `codicefiscaleanagrafica` (`codicefiscaleanagrafica`),
  ADD KEY `numerostanza` (`numerostanza`),
  ADD KEY `nomestruttura` (`nomestruttura`);

--
-- Indici per le tabelle `nazionalita`
--
ALTER TABLE `nazionalita`
  ADD PRIMARY KEY (`abbreviazione`);

--
-- Indici per le tabelle `stanza`
--
ALTER TABLE `stanza`
  ADD KEY `nomestruttura` (`nomestruttura`),
  ADD KEY `numero` (`numero`),
  ADD KEY `codicefiscaleproprietario` (`codicefiscaleproprietario`);

--
-- Indici per le tabelle `struttura`
--
ALTER TABLE `struttura`
  ADD KEY `nome` (`nome`),
  ADD KEY `codicefiscaleanagrafica` (`codicefiscaleanagrafica`);

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `anagrafica`
--
ALTER TABLE `anagrafica`
  ADD CONSTRAINT `fk_nazionalita` FOREIGN KEY (`nazionalita`) REFERENCES `nazionalita` (`abbreviazione`);

--
-- Limiti per la tabella `struttura`
--
ALTER TABLE `struttura`
  ADD CONSTRAINT `fk_anag2` FOREIGN KEY (`codicefiscaleanagrafica`) REFERENCES `anagrafica` (`codicefiscale`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
