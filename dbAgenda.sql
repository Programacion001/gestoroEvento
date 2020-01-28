-- --------------------------------------------------------
-- Host:                         localhost
-- Versión del servidor:         10.2.14-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para gestorevento
CREATE DATABASE IF NOT EXISTS `gestorevento` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `gestorevento`;

-- Volcando estructura para tabla gestorevento.asisten
CREATE TABLE IF NOT EXISTS `asisten` (
  `id_Evento` int(11) NOT NULL,
  `id_invitado` int(11) NOT NULL,
  `Status` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_Evento`,`id_invitado`),
  KEY `FK_invitado` (`id_invitado`),
  CONSTRAINT `FK_evento` FOREIGN KEY (`id_Evento`) REFERENCES `evento` (`id_Evento`),
  CONSTRAINT `FK_invitado` FOREIGN KEY (`id_invitado`) REFERENCES `invitados` (`id_Invitados`),
  CONSTRAINT `ck_status` CHECK (`Status` in ('Presente','Ausente'))
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla gestorevento.evento
CREATE TABLE IF NOT EXISTS `evento` (
  `id_Evento` int(11) NOT NULL AUTO_INCREMENT,
  `Ubicacion` varchar(45) NOT NULL,
  `Fecha` date NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Status` varchar(20) NOT NULL,
  `Tipo_Evento` int(11) NOT NULL,
  `id_Usuario` int(11) NOT NULL,
  `hora` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_Evento`),
  KEY `id_usuario` (`id_Usuario`),
  KEY `id_tipo` (`Tipo_Evento`),
  CONSTRAINT `id_tipo` FOREIGN KEY (`Tipo_Evento`) REFERENCES `tipo_evento` (`id_Tipo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `id_usuario` FOREIGN KEY (`id_Usuario`) REFERENCES `usuario` (`id_Usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `ch_status` CHECK (`Status` in ('Finalizado','Proximamente'))
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla gestorevento.invitados
CREATE TABLE IF NOT EXISTS `invitados` (
  `id_Invitados` int(11) NOT NULL AUTO_INCREMENT,
  `Apellido` varchar(20) NOT NULL,
  `Sexo` varchar(20) NOT NULL,
  `Direccion` varchar(45) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Telefono` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_Invitados`),
  CONSTRAINT `ch_sexo` CHECK (`Sexo` in ('M','F'))
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla gestorevento.tipo_evento
CREATE TABLE IF NOT EXISTS `tipo_evento` (
  `id_Tipo` int(11) NOT NULL AUTO_INCREMENT,
  `Tipo` varchar(20) NOT NULL,
  PRIMARY KEY (`id_Tipo`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla gestorevento.tipo_user
CREATE TABLE IF NOT EXISTS `tipo_user` (
  `id_Tipo` int(11) NOT NULL AUTO_INCREMENT,
  `Tipo` varchar(20) NOT NULL,
  PRIMARY KEY (`id_Tipo`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla gestorevento.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `id_Usuario` int(11) NOT NULL AUTO_INCREMENT,
  `Contraseña` varchar(20) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Apellido` varchar(20) NOT NULL,
  `Nom_usuario` varchar(20) NOT NULL,
  `Tipo_user` int(11) NOT NULL,
  PRIMARY KEY (`id_Usuario`),
  KEY `tipo_user` (`Tipo_user`),
  CONSTRAINT `tipo_user` FOREIGN KEY (`Tipo_user`) REFERENCES `tipo_user` (`id_Tipo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
