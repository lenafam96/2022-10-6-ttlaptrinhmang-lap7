DROP DATABASE IF EXISTS `qlct`;

CREATE DATABASE `qlct`;

DROP TABLE IF EXISTS `qlct`.`congto`;

CREATE TABLE `qlct`.`congto` (
  `SoCT` varchar(20) NOT NULL,
  `ChuHo` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `SoCu` int(11),
  `SoMoi` int(11),
  `DonGia` int(11),
  PRIMARY KEY (`SoCT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `qlct`.`congto` (`SoCT`, `ChuHo`,`SoCu`,`SoMoi`,`DonGia`) VALUES
('001','Nguyễn Thị Thuý',100,200,1300),
('002','Nguyễn Văn Minh',50,200,1300);