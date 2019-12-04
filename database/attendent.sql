-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 24, 2019 at 03:31 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `attendent`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE `attendance` (
  `id` bigint(20) NOT NULL,
  `create_at` varchar(50) DEFAULT NULL,
  `scheule_id` varchar(50) DEFAULT NULL,
  `attendance_status` tinyint(1) DEFAULT NULL,
  `image` varchar(50) DEFAULT NULL,
  `student_id` varchar(50) DEFAULT NULL,
  `lat` double DEFAULT NULL,
  `lng` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

-- --------------------------------------------------------

--
-- Table structure for table `studentinclass`
--

CREATE TABLE `studentinclass` (
  `id` bigint(20) NOT NULL,
  `student_id` varchar(50) DEFAULT NULL,
  `subject_id` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `ma_sv` bigint(20) NOT NULL,
  `first_name` text DEFAULT NULL,
  `last_name` text DEFAULT NULL,
  `sex` tinyint(1) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `country` text DEFAULT NULL,
  `city` text DEFAULT NULL,
  `wards` text DEFAULT NULL,
  `street` text DEFAULT NULL,
  `district` text DEFAULT NULL,
  `learn_start` text DEFAULT NULL,
  `learn_end` text DEFAULT NULL,
  `create_at` varchar(20) DEFAULT NULL,
  `update_at` varchar(20) DEFAULT NULL,
  `telephone` varchar(15) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `identification` varchar(20) DEFAULT NULL,
  `image` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE `subjects` (
  `id` bigint(20) NOT NULL,
  `name` text DEFAULT NULL,
  `credit` int(11) DEFAULT NULL,
  `term` int(11) DEFAULT NULL,
  `description` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `teachers`
--

CREATE TABLE `teachers` (
  `id` bigint(20) NOT NULL,
  `first_name` text DEFAULT NULL,
  `last_name` text DEFAULT NULL,
  `department` text DEFAULT NULL,
  `regency` text DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `country` text DEFAULT NULL,
  `city` text DEFAULT NULL,
  `district` text DEFAULT NULL,
  `create_at` varchar(50) DEFAULT NULL,
  `update_at` varchar(50) DEFAULT NULL,
  `telephone` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `uid` varchar(50) DEFAULT NULL,
  `create_at` varchar(50) DEFAULT NULL,
  `update_at` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--
CREATE TABLE 'roles' (
  'id' bigint(20) NOT NULL AUTO_INCREMENT,
  'description' varchar(255) DEFAULT NULL,
  'role_name' varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for table `attendance`
--
ALTER TABLE `attendance`
  ADD PRIMARY KEY (`id`);


--
-- Indexes for table `studentinclass`
--
ALTER TABLE `studentinclass`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`ma_sv`);

--
-- Indexes for table `subject`
--
ALTER TABLE `subjects`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `teachers`
--
ALTER TABLE `teachers`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
