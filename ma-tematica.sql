-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-11-2016 a las 16:07:37
-- Versión del servidor: 5.7.9
-- Versión de PHP: 5.6.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ma-tematica`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

DROP TABLE IF EXISTS `alumno`;
CREATE TABLE IF NOT EXISTS `alumno` (
  `usuario` varchar(30) NOT NULL,
  `contrasenia` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `puntajeAcumulado` int(30) NOT NULL,
  `numeroNivel` int(30) NOT NULL,
  `CuilProfesor` int(30) NOT NULL,
  PRIMARY KEY (`usuario`),
  KEY `numeroNivel` (`numeroNivel`),
  KEY `CuilProfesor` (`CuilProfesor`)
) ENGINE=MyISAM DEFAULT CHARSET=ascii;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`usuario`, `contrasenia`, `nombre`, `puntajeAcumulado`, `numeroNivel`, `CuilProfesor`) VALUES
('german0', 'holamundo', 'German', 103, 2, 20303400),
('cristianr', 'cristian12345', 'Cristian', 340, 4, 20303400),
('emilce00', 'emilce12345', 'Emilce', 430, 5, 20303400),
('mili123', 'milena12345', 'Milena', 405, 5, 20303400);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ejercicio`
--

DROP TABLE IF EXISTS `ejercicio`;
CREATE TABLE IF NOT EXISTS `ejercicio` (
  `codEj` int(30) NOT NULL,
  `expresion` varchar(50) NOT NULL,
  `resultado` int(30) NOT NULL,
  `numNivel` int(30) NOT NULL,
  `puntaje` int(30) NOT NULL,
  PRIMARY KEY (`codEj`),
  KEY `numNivel` (`numNivel`),
  KEY `numNivel_2` (`numNivel`)
) ENGINE=MyISAM DEFAULT CHARSET=ascii;

--
-- Volcado de datos para la tabla `ejercicio`
--

INSERT INTO `ejercicio` (`codEj`, `expresion`, `resultado`, `numNivel`, `puntaje`) VALUES
(1, '30-11', 19, 2, 5),
(2, '2*4', 8, 2, 10),
(3, '3*7', 21, 2, 10),
(676, '30-11-10+23', 32, 2, 20),
(85, '(3*4)/2', 6, 2, 30),
(28967, '3-2', 1, 2, 10),
(27981, '3*4', 12, 2, 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nivel`
--

DROP TABLE IF EXISTS `nivel`;
CREATE TABLE IF NOT EXISTS `nivel` (
  `numeroNivel` int(30) NOT NULL,
  `descripcion` varchar(30) NOT NULL,
  `rangoDesde` int(30) NOT NULL,
  `rangoHasta` int(30) NOT NULL,
  PRIMARY KEY (`numeroNivel`)
) ENGINE=MyISAM DEFAULT CHARSET=ascii;

--
-- Volcado de datos para la tabla `nivel`
--

INSERT INTO `nivel` (`numeroNivel`, `descripcion`, `rangoDesde`, `rangoHasta`) VALUES
(2, 'nivel 2', 101, 200),
(3, 'nivel 3', 201, 300),
(4, 'nivel 4', 301, 400),
(5, 'nivel 5', 401, 500),
(6, 'nivel 6', 501, 600);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

DROP TABLE IF EXISTS `profesor`;
CREATE TABLE IF NOT EXISTS `profesor` (
  `usuarioPro` varchar(30) NOT NULL,
  `contraseniaPro` varchar(30) NOT NULL,
  `nombrePro` varchar(30) NOT NULL,
  `Cuil` int(30) NOT NULL,
  PRIMARY KEY (`Cuil`)
) ENGINE=MyISAM DEFAULT CHARSET=ascii;

--
-- Volcado de datos para la tabla `profesor`
--

INSERT INTO `profesor` (`usuarioPro`, `contraseniaPro`, `nombrePro`, `Cuil`) VALUES
('juan123', 'juan12345', 'Juan', 203920200),
('luisa123', 'luisa12345', 'Luisa', 20303400);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
