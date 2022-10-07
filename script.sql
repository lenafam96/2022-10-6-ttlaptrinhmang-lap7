DROP DATABASE IF EXISTS `qlhs`;

CREATE DATABASE `qlhs`;

DROP TABLE IF EXISTS `qlhs`.`hocsinh`;

CREATE TABLE `qlhs`.`hocsinh` (
  `ma` varchar(20) NOT NULL,
  `hoten` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `diemtoan` float(5),
  `diemviet` float(5),
  PRIMARY KEY (`ma`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `qlhs`.`hocsinh` (`ma`, `hoten`,`diemtoan`,`diemviet`) VALUES
('19103200001','Nguyễn Thị Nga',8,9),
('19103200002','Nguyễn Minh Thành',9,9),
('19103200003','Nguyễn Thanh Tâm',10,9);