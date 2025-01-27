-- phpMyAdmin SQL Dump
-- version 4.7.1
-- https://www.phpmyadmin.net/
--
-- Servidor: sql10.freesqldatabase.com
-- Tiempo de generación: 28-01-2025 a las 00:58:07
-- Versión del servidor: 5.5.62-0ubuntu0.14.04.1
-- Versión de PHP: 7.0.33-0ubuntu0.16.04.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sql10759513`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `becas`
--

CREATE TABLE `becas` (
  `nombre_beca` varchar(255) NOT NULL,
  `requisitos` varchar(255) NOT NULL,
  `promedio_requerido` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `becas`
--

INSERT INTO `becas` (`nombre_beca`, `requisitos`, `promedio_requerido`) VALUES
('Beca Cultural', 'Participar en actividades culturales', 80),
('Beca de Desempeño Académico', 'Mantener un promedio mínimo', 84),
('Beca de Excelencia', 'Promedio mayor a 90', 92),
('Beca de Honor', 'Estudiantes destacados en su área', 100),
('Beca de Innovación', 'Proyectos innovadores', 85),
('Beca de Investigación', 'Participar en un proyecto', 88),
('Beca de Liderazgo', 'Demostrar habilidades de liderazgo', 87),
('Beca de Servicio Comunitario', 'Voluntariado comprobado', 82),
('Beca Deportiva', 'Ser parte del equipo de fútbol', 70),
('Beca Técnica', 'Tener habilidades técnicas', 75);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `becas`
--
ALTER TABLE `becas`
  ADD PRIMARY KEY (`nombre_beca`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
