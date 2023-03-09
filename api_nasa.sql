-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-03-2023 a las 05:59:34
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `api_nasa`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_images`
--

CREATE TABLE `tb_images` (
  `id_image` int(11) NOT NULL,
  `href` varchar(255) DEFAULT NULL,
  `center` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `nasa_id` varchar(255) DEFAULT NULL,
  `date_create` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `tb_images`
--

INSERT INTO `tb_images` (`id_image`, `href`, `center`, `title`, `nasa_id`, `date_create`) VALUES
(1, 'https://images-assets.nasa.gov/video/Apollo 11 Overview/collection.json', 'HQ', 'Apollo 11 Overview', 'Apollo 11 Overview', '2023-03-08 22:44:47'),
(2, 'https://images-assets.nasa.gov/video/Apollo 11 Overview/collection.json', 'HQ', 'Apollo 11 Overview', 'Apollo 11 Overview', '2023-03-08 22:54:57'),
(3, 'https://images-assets.nasa.gov/video/Apollo 11 Overview/collection.json', 'HQ', 'Apollo 11 Overview', 'Apollo 11 Overview', '2023-03-08 22:55:01'),
(4, 'https://images-assets.nasa.gov/video/Apollo 11 Overview/collection.json', 'HQ', 'Apollo 11 Overview', 'Apollo 11 Overview', '2023-03-08 22:55:06'),
(5, 'https://images-assets.nasa.gov/video/Apollo 11 Overview/collection.json', 'HQ', 'Apollo 11 Overview', 'Apollo 11 Overview', '2023-03-08 22:55:11'),
(6, 'https://images-assets.nasa.gov/video/Apollo 11 Overview/collection.json', 'HQ', 'Apollo 11 Overview', 'Apollo 11 Overview', '2023-03-08 22:55:16'),
(7, 'https://images-assets.nasa.gov/video/Apollo 11 Overview/collection.json', 'HQ', 'Apollo 11 Overview', 'Apollo 11 Overview', '2023-03-08 22:55:21'),
(8, 'https://images-assets.nasa.gov/video/Apollo 11 Overview/collection.json', 'HQ', 'Apollo 11 Overview', 'Apollo 11 Overview', '2023-03-08 22:57:35');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tb_images`
--
ALTER TABLE `tb_images`
  ADD PRIMARY KEY (`id_image`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tb_images`
--
ALTER TABLE `tb_images`
  MODIFY `id_image` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
