-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Creato il: Dic 02, 2015 alle 16:37
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
  `codicefiscale` varchar(20) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `cognome` varchar(50) NOT NULL,
  `datanascita` bigint(20) NOT NULL,
  `indirizzo` varchar(255) NOT NULL,
  `nazionalita` varchar(3) NOT NULL,
  `numerodocumento` varchar(100) NOT NULL,
  `tipodocumento` int(11) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `cellulare` varchar(20) NOT NULL,
  `email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `anagrafica`
--

INSERT INTO `anagrafica` (`codicefiscale`, `nome`, `cognome`, `datanascita`, `indirizzo`, `nazionalita`, `numerodocumento`, `tipodocumento`, `telefono`, `cellulare`, `email`) VALUES
('CODICEFISCALE', 'Proprietario', 'Cognome', 1111111111111, 'Via/Strada/Piazza', 'ITA', '', 0, '', '', ''),
('ZZIGDM93B27C129E', 'Giandomenico', 'Izzo', 733186800000, 'Via Manzoni 61', 'ITA', 'A111110', 1, '0815367825', '3931135161', 'g.izzo24@studenti.unisa.it');

-- --------------------------------------------------------

--
-- Struttura della tabella `anagraficamansione`
--

CREATE TABLE IF NOT EXISTS `anagraficamansione` (
  `id` int(11) NOT NULL,
  `codicefiscaleanagrafica` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL,
  `idstruttura` int(11) NOT NULL,
  `tipomansione` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `anagraficamansione`
--

INSERT INTO `anagraficamansione` (`id`, `codicefiscaleanagrafica`, `password`, `idstruttura`, `tipomansione`) VALUES
(1, 'ZZIGDM93B27C129E', '123stella', 1, 1);

-- --------------------------------------------------------

--
-- Struttura della tabella `anagraficastanza`
--

CREATE TABLE IF NOT EXISTS `anagraficastanza` (
  `codicefiscaleanagrafica` varchar(20) NOT NULL,
  `numerostanza` varchar(10) NOT NULL,
  `idstruttura` int(11) NOT NULL,
  `ingresso` bigint(20) NOT NULL,
  `uscita` bigint(20) NOT NULL,
  `costo` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `nazionalita`
--

CREATE TABLE IF NOT EXISTS `nazionalita` (
  `abbreviazione` varchar(3) NOT NULL,
  `valore` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `nazionalita`
--

INSERT INTO `nazionalita` (`abbreviazione`, `valore`) VALUES
('ITA', 'Italiana, Italian');

-- --------------------------------------------------------

--
-- Struttura della tabella `stanza`
--

CREATE TABLE IF NOT EXISTS `stanza` (
  `idstruttura` int(11) NOT NULL,
  `numero` varchar(10) NOT NULL,
  `tipo` int(11) NOT NULL,
  `agibile` tinyint(1) NOT NULL,
  `libera` tinyint(1) NOT NULL,
  `descrizione` text NOT NULL,
  `mq` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `stanza`
--

INSERT INTO `stanza` (`idstruttura`, `numero`, `tipo`, `agibile`, `libera`, `descrizione`, `mq`) VALUES
(1, '1A', 1, 1, 1, 'Bella stanza 1', 25.5),
(1, '2A', 1, 1, 1, 'Bella stanza 2', 25.5),
(1, '3A', 1, 1, 1, 'Bella stanza 3', 25.5),
(1, '4A', 1, 1, 1, 'Bella stanza 4', 25.5),
(1, '5A', 1, 1, 1, 'Bella stanza 5', 25.5);

-- --------------------------------------------------------

--
-- Struttura della tabella `struttura`
--

CREATE TABLE IF NOT EXISTS `struttura` (
  `id` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `indirizzo` varchar(255) DEFAULT NULL,
  `codicefiscaleanagrafica` varchar(20) NOT NULL,
  `descrizione` text NOT NULL,
  `agibile` tinyint(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `struttura`
--

INSERT INTO `struttura` (`id`, `Nome`, `indirizzo`, `codicefiscaleanagrafica`, `descrizione`, `agibile`) VALUES
(1, 'Hotel Luna', 'Via Gerardo d''Orsi', 'CODICEFISCALE', '', 0);

-- --------------------------------------------------------

--
-- Struttura della tabella `visita`
--

CREATE TABLE IF NOT EXISTS `visita` (
  `id` int(11) NOT NULL,
  `numerostanza` varchar(10) NOT NULL,
  `idstruttura` int(11) NOT NULL,
  `codicefiscaleanagrafica` varchar(20) NOT NULL,
  `ingresso` bigint(20) NOT NULL,
  `uscita` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `anagrafica`
--
ALTER TABLE `anagrafica`
  ADD PRIMARY KEY (`codicefiscale`),
  ADD KEY `fk_nazionalita` (`nazionalita`);

--
-- Indici per le tabelle `anagraficamansione`
--
ALTER TABLE `anagraficamansione`
  ADD PRIMARY KEY (`id`),
  ADD KEY `codicefiscaleanagrafica` (`codicefiscaleanagrafica`),
  ADD KEY `idstruttura` (`idstruttura`);

--
-- Indici per le tabelle `anagraficastanza`
--
ALTER TABLE `anagraficastanza`
  ADD KEY `codicefiscaleanagrafica` (`codicefiscaleanagrafica`,`numerostanza`,`idstruttura`),
  ADD KEY `fk_numerostanza2` (`numerostanza`),
  ADD KEY `fk_idstruttura2` (`idstruttura`);

--
-- Indici per le tabelle `nazionalita`
--
ALTER TABLE `nazionalita`
  ADD PRIMARY KEY (`abbreviazione`);

--
-- Indici per le tabelle `stanza`
--
ALTER TABLE `stanza`
  ADD PRIMARY KEY (`numero`),
  ADD KEY `idstruttura` (`idstruttura`);

--
-- Indici per le tabelle `struttura`
--
ALTER TABLE `struttura`
  ADD PRIMARY KEY (`id`),
  ADD KEY `codicefiscaleanagrafica` (`codicefiscaleanagrafica`);

--
-- Indici per le tabelle `visita`
--
ALTER TABLE `visita`
  ADD PRIMARY KEY (`id`),
  ADD KEY `numerostanza` (`numerostanza`,`idstruttura`,`codicefiscaleanagrafica`),
  ADD KEY `fk_anag3` (`codicefiscaleanagrafica`),
  ADD KEY `fk_idstruttra` (`idstruttura`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `anagraficamansione`
--
ALTER TABLE `anagraficamansione`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT per la tabella `struttura`
--
ALTER TABLE `struttura`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT per la tabella `visita`
--
ALTER TABLE `visita`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
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
  ADD CONSTRAINT `fk_anag2` FOREIGN KEY (`codicefiscaleanagrafica`) REFERENCES `anagrafica` (`codicefiscale`),
  ADD CONSTRAINT `fk_struttura` FOREIGN KEY (`idstruttura`) REFERENCES `struttura` (`id`);

--
-- Limiti per la tabella `anagraficastanza`
--
ALTER TABLE `anagraficastanza`
  ADD CONSTRAINT `fk_anag4` FOREIGN KEY (`codicefiscaleanagrafica`) REFERENCES `anagrafica` (`codicefiscale`),
  ADD CONSTRAINT `fk_idstruttura2` FOREIGN KEY (`idstruttura`) REFERENCES `stanza` (`idstruttura`),
  ADD CONSTRAINT `fk_numerostanza2` FOREIGN KEY (`numerostanza`) REFERENCES `stanza` (`numero`);

--
-- Limiti per la tabella `stanza`
--
ALTER TABLE `stanza`
  ADD CONSTRAINT `fk_idstruttura` FOREIGN KEY (`idstruttura`) REFERENCES `struttura` (`id`);

--
-- Limiti per la tabella `struttura`
--
ALTER TABLE `struttura`
  ADD CONSTRAINT `fk_anag` FOREIGN KEY (`codicefiscaleanagrafica`) REFERENCES `anagrafica` (`codicefiscale`);

--
-- Limiti per la tabella `visita`
--
ALTER TABLE `visita`
  ADD CONSTRAINT `fk_anag3` FOREIGN KEY (`codicefiscaleanagrafica`) REFERENCES `anagrafica` (`codicefiscale`),
  ADD CONSTRAINT `fk_idstruttra` FOREIGN KEY (`idstruttura`) REFERENCES `stanza` (`idstruttura`),
  ADD CONSTRAINT `fk_numerostanza` FOREIGN KEY (`numerostanza`) REFERENCES `stanza` (`numero`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
