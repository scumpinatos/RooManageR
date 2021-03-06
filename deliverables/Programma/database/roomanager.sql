-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Creato il: Apr 09, 2016 alle 16:11
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
('CODICEFISCALE1', 'Luca', 'Monesi', '18/09/1985', 'Via Ferrara 5', 'ITA', 'Documento1', 1, '0805553312', '3339955642', 'monesi@hotel.it'),
('CODICEFISCALE2', 'Nome2', 'Cognome2', '27/02/1993', 'Indirizzo2', 'ITA', 'Ndoc2', 1, '0815368956', ' 323243243242', 'prova'),
('CODICEFISCALE3', 'Robert', 'Kubica', '27/01/1991', 'Via Viosa 4', 'FRA', 'Ndoc3', 1, '0000001', '00000002', 'em@ail.it'),
('PORTINAIO', 'Nicola', 'Il Portinaio', '05/05/1958', 'Portineria', 'FRA', 'NESS00N0', 1, '00155', '393555111', 'mail@mail.it');

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
('CODICEFISCALE1', '123stella', '', 'CODICEFISCALE1', 2),
('PORTINAIO', '123stella', 'Hotel Sole', 'CODICEFISCALE1', 1);

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

--
-- Dump dei dati per la tabella `anagraficastanza`
--

INSERT INTO `anagraficastanza` (`codicefiscaleanagrafica`, `numerostanza`, `nomestruttura`, `codicefiscaleproprietario`, `tipo`, `ingresso`, `uscita`, `costo`) VALUES
('CODICEFISCALE5', '1A', 'Hotel Luna', 'CODICEFISCALE1', 1, '12:09 - 03/04/2016', '12:28 - 03/04/2016', 10),
('CODICEFISCALE3', '1A', 'Hotel Sole', 'CODICEFISCALE1', 1, '12:33 - 03/04/2016', '', 0);

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

--
-- Dump dei dati per la tabella `stanza`
--

INSERT INTO `stanza` (`nomestruttura`, `codicefiscaleproprietario`, `numero`, `tipo`, `descrizione`, `mq`, `agibile`, `permanenza`, `visita`) VALUES
('Hotel Sole', 'CODICEFISCALE1', '1A', 1, 'Prova', 20, 1, 1, 0);

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
-- Dump dei dati per la tabella `struttura`
--

INSERT INTO `struttura` (`nome`, `codicefiscaleanagrafica`, `indirizzo`, `nstanze`, `descrizione`, `agibile`) VALUES
('Hotel Sole', 'CODICEFISCALE1', 'Indirizzo Hotel Sole', 1, 'Descrizione Hotel Sole', 1);

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
