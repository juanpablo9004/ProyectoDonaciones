-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-09-2014 a las 07:39:08
-- Versión del servidor: 5.6.16
-- Versión de PHP: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `donaciones`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bolsas`
--

CREATE TABLE IF NOT EXISTS `bolsas` (
  `Codig_Bol` varchar(20) NOT NULL,
  `Grupo_Bol` varchar(4) DEFAULT NULL,
  `Rh_Bol` varchar(2) DEFAULT NULL,
  `FechRecol_Bol` varchar(20) DEFAULT NULL,
  `FechVenc_Bol` varchar(20) DEFAULT NULL,
  `Cant_Bol` int(10) DEFAULT NULL,
  `Obser_Bol` varchar(60) NOT NULL,
  `Estado_Bol` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Codig_Bol`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `bolsas`
--

INSERT INTO `bolsas` (`Codig_Bol`, `Grupo_Bol`, `Rh_Bol`, `FechRecol_Bol`, `FechVenc_Bol`, `Cant_Bol`, `Obser_Bol`, `Estado_Bol`) VALUES
('111', 'A', '+', '09/07/2014', '09/09/2016', 2340, '', 'Activo'),
('222', 'A', '+', '08/09/2014', '03/09/2016', 450, 'ninguna.', 'Activo'),
('333', 'AB', '+', '21/09/2014', '21/09/2014', 345, 'sin ninguna novena y restrinccion.', 'Inactivo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `donantes`
--

CREATE TABLE IF NOT EXISTS `donantes` (
  `TipoDoc_Donan` varchar(10) DEFAULT NULL,
  `Ident_Donan` varchar(12) NOT NULL DEFAULT '0',
  `Nombres_Donan` varchar(25) DEFAULT NULL,
  `PApell_Donan` varchar(25) DEFAULT NULL,
  `SApell_Donan` varchar(25) NOT NULL,
  `Telef_Donan` varchar(10) NOT NULL,
  `Direcc_Donan` varchar(35) NOT NULL,
  `Genero_Donan` varchar(10) DEFAULT NULL,
  `Correo_Donan` varchar(35) NOT NULL,
  `FecNac_Donan` varchar(40) DEFAULT NULL,
  `FecUltDon_Donan` varchar(40) NOT NULL,
  `Enferm_Donan` varchar(20) DEFAULT NULL,
  `Habitos_Donan` varchar(20) DEFAULT NULL,
  `Estado_Donan` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`Ident_Donan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `donantes`
--

INSERT INTO `donantes` (`TipoDoc_Donan`, `Ident_Donan`, `Nombres_Donan`, `PApell_Donan`, `SApell_Donan`, `Telef_Donan`, `Direcc_Donan`, `Genero_Donan`, `Correo_Donan`, `FecNac_Donan`, `FecUltDon_Donan`, `Enferm_Donan`, `Habitos_Donan`, `Estado_Donan`) VALUES
('Cedula', '111', 'Fabio', 'Solorzano', '', '2345676', 'diagonal 38a', 'Masculino', 'fabio@hotmail.com', '11/09/1987', '06/09/2008', 'Ninguna', 'Ninguna', 'Activo'),
('Cedula', '222', 'lina', 'lopez', 'perez', '', '', 'Femenino', '', '15/09/1994', '01/09/2000', 'Hepatitis', 'Drogas', 'Activo'),
('Cedula', '333', 'juan', 'sanchez', '', '', '', 'Masculino', '', '16/09/1995', '06/09/2013', 'Ninguna', 'Fumar', 'Inactivo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entregas`
--

CREATE TABLE IF NOT EXISTS `entregas` (
  `Codig_Entre` varchar(10) NOT NULL,
  `Grupo_Entre` varchar(4) DEFAULT NULL,
  `Rh_Entre` varchar(4) DEFAULT NULL,
  `FechVenc_Entre` varchar(20) DEFAULT NULL,
  `FechRecol_Entre` varchar(20) DEFAULT NULL,
  `Nit_Entre` varchar(20) DEFAULT NULL,
  `RazonSoc_Entre` varchar(35) DEFAULT NULL,
  `CantEntre_Entre` int(11) DEFAULT NULL,
  `Obser_Entre` varchar(60) NOT NULL,
  `Estado_Entre` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Codig_Entre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `entregas`
--

INSERT INTO `entregas` (`Codig_Entre`, `Grupo_Entre`, `Rh_Entre`, `FechVenc_Entre`, `FechRecol_Entre`, `Nit_Entre`, `RazonSoc_Entre`, `CantEntre_Entre`, `Obser_Entre`, `Estado_Entre`) VALUES
('111', 'A', '+', '20/04/2016', '20/04/2014', '111', 'Santa monica', 2450, '', 'Activo'),
('222', 'B', '+', '22/09/2014', '22/09/2014', '111', 'santa monica', 234, 'sin novedades ni nada.', 'Inactivo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hospitales`
--

CREATE TABLE IF NOT EXISTS `hospitales` (
  `TipoHosp_Hosp` varchar(15) DEFAULT NULL,
  `Nit_Hosp` varchar(20) NOT NULL DEFAULT '0',
  `RazonSoc_Hosp` varchar(35) DEFAULT NULL,
  `Direcc_Hosp` varchar(35) NOT NULL,
  `Telef_Hosp` varchar(10) NOT NULL,
  `Repre_Hosp` varchar(35) DEFAULT NULL,
  `TelRepre_Hosp` varchar(10) NOT NULL,
  `CorreoRepre_Hosp` varchar(35) NOT NULL,
  `Nivel_Hosp` varchar(10) NOT NULL,
  `Estado_Hosp` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`Nit_Hosp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `hospitales`
--

INSERT INTO `hospitales` (`TipoHosp_Hosp`, `Nit_Hosp`, `RazonSoc_Hosp`, `Direcc_Hosp`, `Telef_Hosp`, `Repre_Hosp`, `TelRepre_Hosp`, `CorreoRepre_Hosp`, `Nivel_Hosp`, `Estado_Hosp`) VALUES
('Público', '111', 'Santa monica', 'diagonal 8888', '55577', 'Carlos Ospina', '', 'carlos@hotmail.com', 'Nivel II', 'Inactivo'),
('Clínica', '222', 'Leon 13', '', '343444', 'jose luis perez', '', '', 'Nivel III', 'Inactivo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jornadas`
--

CREATE TABLE IF NOT EXISTS `jornadas` (
  `Codig_Jorn` varchar(10) NOT NULL DEFAULT '',
  `FechProg_Jorn` varchar(20) DEFAULT NULL,
  `Horas_Jorn` varchar(4) DEFAULT NULL,
  `Minut_Jorn` varchar(4) DEFAULT NULL,
  `Direcc_Jorn` varchar(35) NOT NULL,
  `CantDonan_Jorn` int(11) DEFAULT NULL,
  `CantAPos_Jorn` int(11) DEFAULT NULL,
  `CantANeg_Jorn` int(11) DEFAULT NULL,
  `CantBPos_Jorn` int(11) DEFAULT NULL,
  `CantBNeg_Jorn` int(11) DEFAULT NULL,
  `CantOPos_Jorn` int(11) DEFAULT NULL,
  `CantONeg_Jorn` int(11) DEFAULT NULL,
  `CantAbPos_Jorn` int(11) DEFAULT NULL,
  `CantAbNeg_Jorn` int(11) DEFAULT NULL,
  `Obser_Jorn` varchar(60) NOT NULL,
  `Estado_Jorn` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`Codig_Jorn`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `jornadas`
--

INSERT INTO `jornadas` (`Codig_Jorn`, `FechProg_Jorn`, `Horas_Jorn`, `Minut_Jorn`, `Direcc_Jorn`, `CantDonan_Jorn`, `CantAPos_Jorn`, `CantANeg_Jorn`, `CantBPos_Jorn`, `CantBNeg_Jorn`, `CantOPos_Jorn`, `CantONeg_Jorn`, `CantAbPos_Jorn`, `CantAbNeg_Jorn`, `Obser_Jorn`, `Estado_Jorn`) VALUES
('111', '02/03/2014', '10', '00', 'cra 45', 90, 343, 564, 345, 445, 543, 5364, 646, 5453, 'Ninguna novena', 'Activo'),
('222', '21/09/2014', '02', '20', 'diagonal 38 a # 34 37', 123, 33, 33, 33, 33, 33, 33, 33, 33, 'nofdslfnalñsnflfnlñsafnñsgsñgñsg', 'Activo'),
('333', '21/09/2014', '05', '40', '', 111, 11, 12, 33, 22, 33, 22, 112, 121, 'sin ninguna novedad.', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `Identif_Usu` int(12) NOT NULL DEFAULT '0',
  `Nombre_Usu` varchar(20) DEFAULT NULL,
  `PApellido_Usu` varchar(15) DEFAULT NULL,
  `SApellido_Usu` varchar(15) NOT NULL,
  `Correo_Usu` varchar(35) NOT NULL,
  `Usuario_Usu` varchar(20) DEFAULT NULL,
  `Contrasena_Usu` varchar(15) DEFAULT NULL,
  `CContrasena_Usu` varchar(15) DEFAULT NULL,
  `Perfil_Usu` varchar(15) DEFAULT NULL,
  `Estado_Usu` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`Identif_Usu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`Identif_Usu`, `Nombre_Usu`, `PApellido_Usu`, `SApellido_Usu`, `Correo_Usu`, `Usuario_Usu`, `Contrasena_Usu`, `CContrasena_Usu`, `Perfil_Usu`, `Estado_Usu`) VALUES
(23, 'juan', 'solis', '', 'juan23@elpoli.edu.co', 'juan22', '1234', '1234', 'Administrador', 'Activo'),
(44, 'pedro', 'ospina', 'ortiz', 'gardenpedro@hotmail.com', 'pedro', '777', '777', 'Auxiliar', 'Activo'),
(67, 'Luis', 'Sossa', 'Orozco', 'sossa4567@gmail.com', 'luis', '1234', '1234', 'Auxiliar', 'Activo'),
(892, 'Carlosdavid', 'ortiz', '', 'juan@gmail.com', 'carlos', '12', '12', 'Medico', 'Activo'),
(2424, 'kmlksjks', 'sfsf', '', '', 'lois', '34', '34', 'Enfermero', 'Inactivo'),
(890919062, 'pedro', 'ruiz', 'osoario', 'garde@productos.com', 'pedroluis', '3333', '3333', 'Auxiliar', 'Activo');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
