-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Creato il: Dic 05, 2015 alle 17:06
-- Versione del server: 5.6.26
-- Versione PHP: 5.5.28

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
('CODICEFISCALE1', 'Nome1', 'Cognome1', '27/02/1993', 'Indirizzo1', 'ITA', 'Ndoc1', 1, 'Telefono1', 'Cellulare1', 'Email1'),
('CODICEFISCALE2', 'Nome2', 'Cognome2', '28/06/1992', 'Indirizzo2', 'ITA', 'Ndoc2', 1, 'Telefono2', 'Cellulare2', 'Email2'),
('CODICEFISCALE3', 'Nome3', 'Cognome3', '29/08/1996', 'Indirizzo3', 'ITA', 'Ndoc3', 1, 'Telefono3', 'Cellulare3', 'Email3');

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
('CODICEFISCALE1', '123stella', 'Hotel Luna', 'CODICEFISCALE2', 1);

-- --------------------------------------------------------

--
-- Struttura della tabella `anagraficastanza`
--

CREATE TABLE IF NOT EXISTS `anagraficastanza` (
  `codicefiscaleanagrafica` varchar(255) NOT NULL,
  `numerostanza` varchar(255) NOT NULL,
  `nomestruttura` varchar(255) NOT NULL,
  `codicefiscaleproprietario` varchar(255) NOT NULL,
  `ingresso` varchar(255) NOT NULL,
  `uscita` varchar(255) NOT NULL,
  `costo` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `anagraficastanza`
--

INSERT INTO `anagraficastanza` (`codicefiscaleanagrafica`, `numerostanza`, `nomestruttura`, `codicefiscaleproprietario`, `ingresso`, `uscita`, `costo`) VALUES
('CODICEFISCALE3', '1A', 'Hotel Luna', 'CODICEFISCALE2', '25/05/2015', '30/05/2015', 150);

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
  `libera` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `stanza`
--

INSERT INTO `stanza` (`nomestruttura`, `codicefiscaleproprietario`, `numero`, `tipo`, `descrizione`, `mq`, `agibile`, `libera`) VALUES
('Hotel Luna', 'CODICEFISCALE2', '1A', 1, 'DescrizioneStanza1', 25, 1, 0),
('Hotel Luna', 'CODICEFISCALE2', '2A', 1, 'DescrizioneStanza2', 25, 1, 1),
('Hotel Luna', 'CODICEFISCALE2', '3A', 1, 'DescrizioneStanza3', 25, 1, 1),
('Hotel Luna', 'CODICEFISCALE2', '4A', 1, 'DescrizioneStanza4', 25, 1, 1),
('Hotel Luna', 'CODICEFISCALE2', '5A', 1, 'DescrizioneStanza5', 25, 1, 1);

-- --------------------------------------------------------

--
-- Struttura della tabella `struttura`
--

CREATE TABLE IF NOT EXISTS `struttura` (
  `nome` varchar(255) NOT NULL,
  `codicefiscaleanagrafica` varchar(255) NOT NULL,
  `indirizzo` varchar(255) NOT NULL,
  `descrizione` varchar(255) NOT NULL,
  `agibile` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `struttura`
--

INSERT INTO `struttura` (`nome`, `codicefiscaleanagrafica`, `indirizzo`, `descrizione`, `agibile`) VALUES
('Hotel Luna', 'CODICEFISCALE2', 'IndirizzoStruttura', 'DescrizioneStruttura', 1);

-- --------------------------------------------------------

--
-- Struttura della tabella `visita`
--

CREATE TABLE IF NOT EXISTS `visita` (
  `codicefiscaleanagrafica` varchar(255) NOT NULL,
  `numerostanza` varchar(255) NOT NULL,
  `nomestruttura` varchar(255) NOT NULL,
  `codicefiscaleproprietario` varchar(255) NOT NULL,
  `ingresso` varchar(255) NOT NULL,
  `uscita` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `visita`
--

INSERT INTO `visita` (`codicefiscaleanagrafica`, `numerostanza`, `nomestruttura`, `codicefiscaleproprietario`, `ingresso`, `uscita`) VALUES
('CODICEFISCALE3', '4A', 'Hotel Luna', 'CODICEFISCALE2', '25/08/2015 09:00', '25/08/2015 17:00');

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
-- Indici per le tabelle `visita`
--
ALTER TABLE `visita`
  ADD KEY `codicefiscaleanagrafica` (`codicefiscaleanagrafica`),
  ADD KEY `nomestruttura` (`nomestruttura`),
  ADD KEY `numerostanza` (`numerostanza`);

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `anagrafica`
--
ALTER TABLE `anagrafica`
  ADD CONSTRAINT `fk_nazionalita` FOREIGN KEY (`nazionalita`) REFERENCES `nazionalita` (`abbreviazione`);

--
-- Limiti per la tabella `anagraficamansione`
--
ALTER TABLE `anagraficamansione`
  ADD CONSTRAINT `fk_anag1` FOREIGN KEY (`codicefiscaleanagrafica`) REFERENCES `anagrafica` (`codicefiscale`),
  ADD CONSTRAINT `fk_strutt4` FOREIGN KEY (`nomestruttura`) REFERENCES `struttura` (`nome`);

--
-- Limiti per la tabella `anagraficastanza`
--
ALTER TABLE `anagraficastanza`
  ADD CONSTRAINT `fk_anag3` FOREIGN KEY (`codicefiscaleanagrafica`) REFERENCES `anagrafica` (`codicefiscale`),
  ADD CONSTRAINT `fk_stanza1` FOREIGN KEY (`numerostanza`) REFERENCES `stanza` (`numero`),
  ADD CONSTRAINT `fk_strutt2` FOREIGN KEY (`nomestruttura`) REFERENCES `struttura` (`nome`);

--
-- Limiti per la tabella `struttura`
--
ALTER TABLE `struttura`
  ADD CONSTRAINT `fk_anag2` FOREIGN KEY (`codicefiscaleanagrafica`) REFERENCES `anagrafica` (`codicefiscale`);

--
-- Limiti per la tabella `visita`
--
ALTER TABLE `visita`
  ADD CONSTRAINT `fk_anag4` FOREIGN KEY (`codicefiscaleanagrafica`) REFERENCES `anagrafica` (`codicefiscale`),
  ADD CONSTRAINT `fk_stanza2` FOREIGN KEY (`numerostanza`) REFERENCES `stanza` (`numero`),
  ADD CONSTRAINT `fk_strutt3` FOREIGN KEY (`nomestruttura`) REFERENCES `struttura` (`nome`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
