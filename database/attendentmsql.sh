!#bin/bash

cat << EOF |mysql -uroot -proot
use attendent;
CREATE TABLE `attendance` (
  `id` varchar(50) NOT NULL,
  `create_at` varchar(50) DEFAULT NULL,
  `scheule_id` varchar(50) DEFAULT NULL,
  `attendance_status` tinyint(1) DEFAULT NULL,
  `image` varchar(50) DEFAULT NULL,
  `student_id` varchar(50) DEFAULT NULL,
  `lat` double DEFAULT NULL,
  `lng` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
CREATE TABLE `studentinclass` (
  `id` varchar(50) NOT NULL,
  `student_id` varchar(50) DEFAULT NULL,
  `subject_id` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
CREATE TABLE `students` (
  `ma_sv` varchar(50) NOT NULL,
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
CREATE TABLE `subjects` (
  `id` varchar(50) NOT NULL,
  `name` text DEFAULT NULL,
  `credit` int(11) DEFAULT NULL,
  `term` int(11) DEFAULT NULL,
  `description` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
CREATE TABLE `teachers` (
  `id` varchar(50) NOT NULL,
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
CREATE TABLE `users` (
  `id` varchar(50) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `role` varchar(20) DEFAULT NULL,
  `uid` varchar(50) DEFAULT NULL,
  `create_at` varchar(50) DEFAULT NULL,
  `update_at` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
ALTER TABLE `attendance` ADD PRIMARY KEY (`id`);
ALTER TABLE `studentinclass` ADD PRIMARY KEY (`id`);
ALTER TABLE `students` ADD PRIMARY KEY (`ma_sv`);
ALTER TABLE `subjects` ADD PRIMARY KEY (`id`);
ALTER TABLE `teachers` ADD PRIMARY KEY (`id`);
ALTER TABLE `users` ADD PRIMARY KEY (`id`);
COMMIT;
EOF