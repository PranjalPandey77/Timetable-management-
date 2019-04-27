-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Dec 23, 2018 at 05:49 AM
-- Server version: 5.7.21
-- PHP Version: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `timetable`
--

-- --------------------------------------------------------

--
-- Table structure for table `timetable`
--

DROP TABLE IF EXISTS `timetable`;
CREATE TABLE IF NOT EXISTS `timetable` (
  `day` varchar(50) NOT NULL,
  `Lacture1` varchar(50) NOT NULL DEFAULT '-----',
  `Lacture2` varchar(50) NOT NULL DEFAULT '-----',
  `Lacture3` varchar(50) NOT NULL DEFAULT '-----',
  `lacture4` varchar(50) NOT NULL DEFAULT 'Break',
  `Lacture5` varchar(50) NOT NULL DEFAULT '-----',
  `Lacture6` varchar(50) NOT NULL DEFAULT '-----',
  PRIMARY KEY (`day`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `timetable`
--

INSERT INTO `timetable` (`day`, `Lacture1`, `Lacture2`, `Lacture3`, `lacture4`, `Lacture5`, `Lacture6`) VALUES
('Monday', 'cse', 'maths', 'jkb', 'jk', 'jb', 'jb'),
('Tuesday', 'ece', 'lab1', 'lab2', 'break', 'vghjbh', 'vghjbh'),
('Wednesday', 'break', 'bj', 'jTextField1', 'njnj', 'break', 'break'),
('Thursday', 'yuv', 'jTextField1', 'jTextField1', 'jTextField1', 'jTextField1', 'jTextField1'),
('Friday', 'jTextField1', 'jTextField1', 'jTextField1', 'jTextField1', 'jTextField1', 'jTextField1'),
('Saturday', 'jTextField1', 'jTextField1', 'jTextField1', 'jTextField1', 'jTextField1', 'jTextField1'),
('Sunday', 'jTextField1', 'jTextField1', 'jTextField1', 'jTextField1', 'jTextField1', 'jTextField1');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
