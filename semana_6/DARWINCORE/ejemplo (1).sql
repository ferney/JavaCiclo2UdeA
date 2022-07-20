-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-07-2022 a las 15:06:41
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ejemplo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `animales`
--

CREATE TABLE `animales` (
  `id` int(11) NOT NULL,
  `occurrenceID` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `basisOfRecord` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `institutionCode` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `collectionCode` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `catalogNumber` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `dynamicProperties` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `occurrenceRemarks` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `recordNumber` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `recordedBy` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `organismID` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `organismQuantity` double DEFAULT NULL,
  `organismQuantityType` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `sex` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `lifeStage` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `preparations` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `samplingProtocol` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `samplingEffort` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `eventDate` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `eventTime` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `habitat` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `eventRemarks` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `continent` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `country` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `countryCode` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `stateProvince` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `county` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `locality` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `minimumElevationInMeters` double DEFAULT NULL,
  `maximumElevationInMeters` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `locationRemarks` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `verbatimLatitude` double DEFAULT NULL,
  `verbatimLongitude` double DEFAULT NULL,
  `verbatimCoordinateSystem` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `verbatimSRS` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `decimalLatitude` double DEFAULT NULL,
  `decimalLongitude` double DEFAULT NULL,
  `geodeticDatum` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `georeferenceProtocol` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `coordinateUncertaintyInMeters` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `coordinatePrecision` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `identifiedBy` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `dateIdentified` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `identificationRemarks` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `identificationQualifier` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `scientificName` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `kingdom` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `phylum` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `class` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `orden` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `family` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `genus` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `specificEpithet` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `infraspecificEpithet` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `taxonRank` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `scientificNameAuthorship` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `ProjectName` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `title` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `type` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `format` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `creator` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `created` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Tipo_de_tejido` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Preparacin_del_tejido` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Colector_del_tejido` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Nmero_del_tejido` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `animales`
--

INSERT INTO `animales` (`id`, `occurrenceID`, `basisOfRecord`, `institutionCode`, `collectionCode`, `catalogNumber`, `dynamicProperties`, `occurrenceRemarks`, `recordNumber`, `recordedBy`, `organismID`, `organismQuantity`, `organismQuantityType`, `sex`, `lifeStage`, `preparations`, `samplingProtocol`, `samplingEffort`, `eventDate`, `eventTime`, `habitat`, `eventRemarks`, `continent`, `country`, `countryCode`, `stateProvince`, `county`, `locality`, `minimumElevationInMeters`, `maximumElevationInMeters`, `locationRemarks`, `verbatimLatitude`, `verbatimLongitude`, `verbatimCoordinateSystem`, `verbatimSRS`, `decimalLatitude`, `decimalLongitude`, `geodeticDatum`, `georeferenceProtocol`, `coordinateUncertaintyInMeters`, `coordinatePrecision`, `identifiedBy`, `dateIdentified`, `identificationRemarks`, `identificationQualifier`, `scientificName`, `kingdom`, `phylum`, `class`, `orden`, `family`, `genus`, `specificEpithet`, `infraspecificEpithet`, `taxonRank`, `scientificNameAuthorship`, `ProjectName`, `title`, `type`, `format`, `creator`, `created`, `Tipo_de_tejido`, `Preparacin_del_tejido`, `Colector_del_tejido`, `Nmero_del_tejido`) VALUES
(1, 'CBMUS-I-1070', 'Espécimen preservado', 'NOMBRE', 'CBMUS-I', 'CBMUS-I-1070', '', '', 'QPES-01-01', 'SANDRA QUINTERO', '', 1, 'individuos', '', '', 'Lote Líquido (ETOH)', 'Jama', '', '2016-01-21', '9:40 AM', 'quebrada', 'día Soleado', 'Sur América', 'Colombia', 'CO', 'Santander', 'Sabana de Torres', 'Quebrada pescado alto', 80, '', '', 1315807.075, 1053898.796, 'Planas', 'Magna-Sirgas: Bogota', 7.123123, -73.42348971, 'WGS84', 'GPS', '', '', 'sandra', '2019-04-15', '', '', 'Dytiscidae', 'Animalia', 'Arthropoda', 'Insecta', 'Coleoptera', 'Dytiscidae', '', '', '', 'Familia', '', 'Acta COL|ECOPETROL|2019', 'CBMUS-I-1.jpg', 'Imagen', 'JPG', 'David Sepulveda', '2019-04-11', '', '', '', '');

--
-- Disparadores `animales`
--
DELIMITER $$
CREATE TRIGGER `ELIMINAR` AFTER DELETE ON `animales` FOR EACH ROW BEGIN

DELETE FROM etiquetauno
WHERE	
	etiquetauno.id = old.id;
    
DELETE FROM etiquetados
WHERE	
	etiquetados.id = old.id;


END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `ELIMINARANIMAL` BEFORE DELETE ON `animales` FOR EACH ROW BEGIN
INSERT INTO animaleseliminados SELECT * FROM animales WHERE id=old.id;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `INSERTAR` AFTER INSERT ON `animales` FOR EACH ROW BEGIN
INSERT INTO etiquetauno (occurrenceID,collectionCode, locality,minimumElevationInMeters,maximumElevationInMeters) VALUES (new.occurrenceID,new.collectionCode, new.locality,new.minimumElevationInMeters,new.maximumElevationInMeters);

INSERT INTO etiquetados (occurrenceID,collectionCode, locality) VALUES (new.occurrenceID,new.collectionCode, new.locality);
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `MODIFICAR` AFTER UPDATE ON `animales` FOR EACH ROW BEGIN

UPDATE etiquetauno
SET
id = new.id,
occurrenceID = new.occurrenceID,
collectionCode = new.collectionCode,
locality = new.locality,
minimumElevationInMeters = new.minimumElevationInMeters,
maximumElevationInMeters= new.maximumElevationInMeters
WHERE	
	id = new.id;
    
UPDATE etiquetados
SET
id = new.id,
occurrenceID = new.occurrenceID,
collectionCode = new.collectionCode,
locality = new.locality
WHERE	
	id = new.id;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `animaleseliminados`
--

CREATE TABLE `animaleseliminados` (
  `id` int(11) NOT NULL,
  `occurrenceID` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `basisOfRecord` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `institutionCode` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `collectionCode` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `catalogNumber` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `dynamicProperties` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `occurrenceRemarks` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `recordNumber` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `recordedBy` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `organismID` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `organismQuantity` double DEFAULT NULL,
  `organismQuantityType` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `sex` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `lifeStage` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `preparations` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `samplingProtocol` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `samplingEffort` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `eventDate` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `eventTime` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `habitat` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `eventRemarks` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `continent` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `country` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `countryCode` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `stateProvince` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `county` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `locality` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `minimumElevationInMeters` double DEFAULT NULL,
  `maximumElevationInMeters` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `locationRemarks` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `verbatimLatitude` double DEFAULT NULL,
  `verbatimLongitude` double DEFAULT NULL,
  `verbatimCoordinateSystem` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `verbatimSRS` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `decimalLatitude` double DEFAULT NULL,
  `decimalLongitude` double DEFAULT NULL,
  `geodeticDatum` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `georeferenceProtocol` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `coordinateUncertaintyInMeters` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `coordinatePrecision` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `identifiedBy` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `dateIdentified` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `identificationRemarks` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `identificationQualifier` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `scientificName` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `kingdom` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `phylum` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `class` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `orden` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `family` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `genus` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `specificEpithet` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `infraspecificEpithet` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `taxonRank` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `scientificNameAuthorship` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `ProjectName` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `title` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `type` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `format` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `creator` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `created` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Tipo_de_tejido` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Preparacin_del_tejido` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Colector_del_tejido` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Nmero_del_tejido` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `animaleseliminados`
--

INSERT INTO `animaleseliminados` (`id`, `occurrenceID`, `basisOfRecord`, `institutionCode`, `collectionCode`, `catalogNumber`, `dynamicProperties`, `occurrenceRemarks`, `recordNumber`, `recordedBy`, `organismID`, `organismQuantity`, `organismQuantityType`, `sex`, `lifeStage`, `preparations`, `samplingProtocol`, `samplingEffort`, `eventDate`, `eventTime`, `habitat`, `eventRemarks`, `continent`, `country`, `countryCode`, `stateProvince`, `county`, `locality`, `minimumElevationInMeters`, `maximumElevationInMeters`, `locationRemarks`, `verbatimLatitude`, `verbatimLongitude`, `verbatimCoordinateSystem`, `verbatimSRS`, `decimalLatitude`, `decimalLongitude`, `geodeticDatum`, `georeferenceProtocol`, `coordinateUncertaintyInMeters`, `coordinatePrecision`, `identifiedBy`, `dateIdentified`, `identificationRemarks`, `identificationQualifier`, `scientificName`, `kingdom`, `phylum`, `class`, `orden`, `family`, `genus`, `specificEpithet`, `infraspecificEpithet`, `taxonRank`, `scientificNameAuthorship`, `ProjectName`, `title`, `type`, `format`, `creator`, `created`, `Tipo_de_tejido`, `Preparacin_del_tejido`, `Colector_del_tejido`, `Nmero_del_tejido`) VALUES
(2, 'CBMUS-I-1070', 'Espécimen preservado', 'NOMBRE DE LA U', 'CBMUS-I', 'CBMUS-I-1070', '', '', 'QPES-01-01', 'SANDRA QUINTERO', '', 1, 'individuos', '', '', 'Lote Líquido (ETOH)', 'Jama', '', '2016-01-21', '9:40 AM', 'quebrada', 'día Soleado', 'Sur América', 'Colombia', 'CO', 'Santander', 'Sabana de Torres', 'Quebrada pescado alto', 80, '', '', 1315807.075, 1053898.796, 'Planas', 'Magna-Sirgas: Bogota', 7.123123, -73.42348971, 'WGS84', 'GPS', '', '', 'sandra', '2019-04-15', '', '', 'Dytiscidae', 'Animalia', 'Arthropoda', 'Insecta', 'Coleoptera', 'Dytiscidae', '', '', '', 'Familia', '', 'Acta COL|ECOPETROL|2019', 'CBMUS-I-1.jpg', 'Imagen', 'JPG', 'David Sepulveda', '2019-04-11', '', '', '', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamento`
--

CREATE TABLE `departamento` (
  `id` int(5) NOT NULL,
  `nombre` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  `localizacion` varchar(20) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `departamento`
--

INSERT INTO `departamento` (`id`, `nombre`, `localizacion`) VALUES
(1, 'ventas', 'bogota'),
(2, 'rrhh', 'medellin'),
(3, 'compras', 'cali'),
(4, 'compras', 'cali'),
(5, 'compras', 'cali'),
(6, 'compras', 'cali'),
(7, 'compras', 'cali'),
(10, 'servicios', 'pereira'),
(11, 'aseo', 'bucaramanga'),
(12, 'pagos', 'aguazul'),
(13, 'archivo', 'aguachica'),
(14, 'publicos', 'bucaramanga'),
(15, 'seguridad', 'aguazul'),
(16, 'juridico', 'arauca');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `id_empleado` int(11) NOT NULL,
  `nombre` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `apellido` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `f_nacimiento` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `sexo` varchar(10) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `cargo` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `salario` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`id_empleado`, `nombre`, `apellido`, `f_nacimiento`, `sexo`, `cargo`, `salario`) VALUES
(1, 'carlos', 'castillo', '5/5/87', 'm', 'auxiliar', 1500),
(2, 'elena', 'paredes', '5/6/87', 'f', 'secretaria', 1400),
(3, 'jose', 'rodriguez', '5/7/87', 'm', 'domicilios', 1000),
(4, 'dario', 'jimenez', '5/8/87', 'm', 'tat', 1000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `etiquetados`
--

CREATE TABLE `etiquetados` (
  `id` int(11) NOT NULL,
  `occurrenceID` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `collectionCode` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `locality` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `etiquetados`
--

INSERT INTO `etiquetados` (`id`, `occurrenceID`, `collectionCode`, `locality`) VALUES
(1, 'CBMUS-I-1070', 'CBMUS-I', 'Quebrada pescado alto');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `etiquetauno`
--

CREATE TABLE `etiquetauno` (
  `id` int(11) NOT NULL,
  `occurrenceID` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `collectionCode` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `locality` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `minimumElevationInMeters` double DEFAULT NULL,
  `maximumElevationInMeters` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `etiquetauno`
--

INSERT INTO `etiquetauno` (`id`, `occurrenceID`, `collectionCode`, `locality`, `minimumElevationInMeters`, `maximumElevationInMeters`) VALUES
(1, 'CBMUS-I-1070', 'CBMUS-I', 'Quebrada pescado alto', 80, '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascotas`
--

CREATE TABLE `mascotas` (
  `id_mascotas` int(11) NOT NULL,
  `nombre` varchar(30) COLLATE utf8_spanish2_ci NOT NULL,
  `especie` varchar(1) COLLATE utf8_spanish2_ci NOT NULL,
  `sexo` varchar(1) COLLATE utf8_spanish2_ci NOT NULL,
  `ubicacion` varchar(6) COLLATE utf8_spanish2_ci NOT NULL,
  `estado` varchar(1) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `mascotas`
--

INSERT INTO `mascotas` (`id_mascotas`, `nombre`, `especie`, `sexo`, `ubicacion`, `estado`) VALUES
(1, 'pipo', 'p', 'm', 'e05', 'b'),
(2, 'nuna', 'p', 'h', 'e07', 'a'),
(3, 'ras', 'g', 'h', 'e01', 'a'),
(4, 'canela', 'p', 'h', 'e02', 'a'),
(5, 'truca', 'p', 'h', 'e04', 'a'),
(6, 'tito', 'g', 'm', 'e09', 'b'),
(7, 'sombra', 'p', 'h', 'e10', 'a'),
(8, 'CATA', 'G', 'H', 'E01', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `rubia` varchar(50) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `alta` varchar(50) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `gafas` varchar(50) COLLATE utf8_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id`, `nombre`, `rubia`, `alta`, `gafas`) VALUES
(1, 'daniela', 's', 's', 'n'),
(2, 'zaira', 'n', 'n', 's'),
(3, 'ximena', 's', 's', 's'),
(4, 'vianey', 's', 'n', 's'),
(5, 'Natalia', 'n', 's', 's');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `xyz`
--

CREATE TABLE `xyz` (
  `id` int(11) NOT NULL,
  `texto` varchar(50) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `num` float DEFAULT NULL,
  `num2` int(10) DEFAULT NULL,
  `fecha` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `xyz`
--

INSERT INTO `xyz` (`id`, `texto`, `num`, `num2`, `fecha`) VALUES
(1, 'hola mundo', 9.36, 4567, '0000-00-00'),
(2, 'hola mundo 2', 45678, 1234567890, '2003-07-30'),
(3, NULL, NULL, NULL, NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `animales`
--
ALTER TABLE `animales`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `animaleseliminados`
--
ALTER TABLE `animaleseliminados`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `departamento`
--
ALTER TABLE `departamento`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`id_empleado`);

--
-- Indices de la tabla `etiquetados`
--
ALTER TABLE `etiquetados`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `etiquetauno`
--
ALTER TABLE `etiquetauno`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `mascotas`
--
ALTER TABLE `mascotas`
  ADD PRIMARY KEY (`id_mascotas`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `xyz`
--
ALTER TABLE `xyz`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `animales`
--
ALTER TABLE `animales`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `animaleseliminados`
--
ALTER TABLE `animaleseliminados`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `departamento`
--
ALTER TABLE `departamento`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `id_empleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `etiquetados`
--
ALTER TABLE `etiquetados`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `etiquetauno`
--
ALTER TABLE `etiquetauno`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `mascotas`
--
ALTER TABLE `mascotas`
  MODIFY `id_mascotas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `xyz`
--
ALTER TABLE `xyz`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
