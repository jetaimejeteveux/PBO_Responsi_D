-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 13, 2020 at 08:24 PM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.2.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `responsi`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_admin`
--

CREATE TABLE `data_admin` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `data_admin`
--

INSERT INTO `data_admin` (`id`, `username`, `password`) VALUES
(1320, 'admin1', 'firmanfirman');

-- --------------------------------------------------------

--
-- Table structure for table `data_pegawai`
--

CREATE TABLE `data_pegawai` (
  `id_pegawai` varchar(255) NOT NULL,
  `nama_pegawai` varchar(255) NOT NULL,
  `posisi_pegawai` varchar(255) NOT NULL,
  `alamat_pegawai` varchar(255) NOT NULL,
  `no_hp` varchar(255) NOT NULL,
  `gaji_pokok` int(11) NOT NULL,
  `jam_lembur` int(11) NOT NULL,
  `tunjangan` int(11) NOT NULL,
  `pajak` int(11) NOT NULL,
  `sum_gaji` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `data_pegawai`
--

INSERT INTO `data_pegawai` (`id_pegawai`, `nama_pegawai`, `posisi_pegawai`, `alamat_pegawai`, `no_hp`, `gaji_pokok`, `jam_lembur`, `tunjangan`, `pajak`, `sum_gaji`) VALUES
('00322', 'Aulia Insani', 'Direktur', 'Karangtalun', '08122637', 10000000, 5, 450000, 100000, 10350000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_admin`
--
ALTER TABLE `data_admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `data_pegawai`
--
ALTER TABLE `data_pegawai`
  ADD PRIMARY KEY (`id_pegawai`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data_admin`
--
ALTER TABLE `data_admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1321;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
