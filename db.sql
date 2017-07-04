--DATA MANAGEMENT SIMCARD

-- CREATE DATABASE [Database management]

-- USE [Database management]

USE SIM
----------------------------------------------------------------------------------

CREATE TABLE LOGIN(
	USERNMAE varchar(32) PRIMARY KEY,
    PASSWORD varchar(32) NOT NULL, 

);

INSERT INTO LOGIN  VALUES ('Nhut', '4304');

INSERT INTO LOGIN  VALUES ('root', 'root');

----------------------------------------------------------------------------------

CREATE TABLE BILL(
	CODENO int PRIMARY KEY,
    DATE varchar(32) NOT NULL, 
);

----------------------------------------------------------------------------------

CREATE TABLE SIMCARD(
	SIMNO varchar(32) PRIMARY KEY,
    PRICE int NOT NULL, 
	TELECOM varchar(32) NOT NULL,
	KINDOF nvarchar(32) NOT NULL
);


/*
	Vinaphone
*/

INSERT INTO SIMCARD  VALUES ('01293.046.921', 75000, 'Vinaphone', N'Thường');

INSERT INTO SIMCARD  VALUES ('01293.067.814', 75000, 'Vinaphone', N'Thường');

INSERT INTO SIMCARD  VALUES ('01293.057.541', 75000, 'Vinaphone', N'Thường');

INSERT INTO SIMCARD  VALUES ('01292.853.620', 75000, 'Vinaphone', N'Thường');

INSERT INTO SIMCARD  VALUES ('0941.573.301', 120000, 'Vinaphone', N'Thường');

INSERT INTO SIMCARD  VALUES ('0942.908.851', 120000, 'Vinaphone', N'Thường');

INSERT INTO SIMCARD  VALUES ('0943.590.641', 120000, 'Vinaphone', N'Thường');

INSERT INTO SIMCARD  VALUES ('0943.490.241', 120000, 'Vinaphone', N'Thường');

INSERT INTO SIMCARD  VALUES ('091112.47.43', 300000, 'Vinaphone', N'Đẹp');

INSERT INTO SIMCARD  VALUES ('091227.17.14', 300000, 'Vinaphone', N'Đẹp');

INSERT INTO SIMCARD  VALUES ('094126.52.50', 300000, 'Vinaphone', N'Đẹp');

INSERT INTO SIMCARD  VALUES ('094133.87.80', 300000, 'Vinaphone', N'Đẹp');

/*
	Mobifone
*/

INSERT INTO SIMCARD  VALUES ('01267.421.706', 75000, 'Mobifone', N'Thường');

INSERT INTO SIMCARD  VALUES ('01267.413.294', 75000, 'Mobifone', N'Thường');

INSERT INTO SIMCARD  VALUES ('01267.629.704', 75000, 'Mobifone', N'Thường');

INSERT INTO SIMCARD  VALUES ('01265.871.742', 75000, 'Mobifone', N'Thường');

INSERT INTO SIMCARD  VALUES ('0938.124.517', 120000, 'Mobifone', N'Thường');

INSERT INTO SIMCARD  VALUES ('0932.753.826', 120000, 'Mobifone', N'Thường');

INSERT INTO SIMCARD  VALUES ('0934.163.254', 120000, 'Mobifone', N'Thường');

INSERT INTO SIMCARD  VALUES ('0937.198.314', 120000, 'Mobifone', N'Thường');

INSERT INTO SIMCARD  VALUES ('089815.69.64', 300000, 'Mobifone', N'Đẹp');

INSERT INTO SIMCARD  VALUES ('089815.74.76', 300000, 'Mobifone', N'Đẹp');

INSERT INTO SIMCARD  VALUES ('089815.54.58', 300000, 'Mobifone', N'Đẹp');

INSERT INTO SIMCARD  VALUES ('089840.18.15', 300000, 'Mobifone', N'Đẹp');

/*
	Viettel 
*/

INSERT INTO SIMCARD  VALUES ('01679.237.607', 75000, 'Viettel', N'Thường');

INSERT INTO SIMCARD  VALUES ('01653.169.174', 75000, 'Viettel', N'Thường');

INSERT INTO SIMCARD  VALUES ('01682.951.794', 75000, 'Viettel', N'Thường');

INSERT INTO SIMCARD  VALUES ('01658.380.415', 75000, 'Viettel', N'Thường');

INSERT INTO SIMCARD  VALUES ('0868.505.892', 180000, 'Viettel', N'Thường');

INSERT INTO SIMCARD  VALUES ('0868.512.843', 180000, 'Viettel', N'Thường');

INSERT INTO SIMCARD  VALUES ('0868.500.245', 180000, 'Viettel', N'Thường');

INSERT INTO SIMCARD  VALUES ('0868.500.257', 180000, 'Viettel', N'Thường');

INSERT INTO SIMCARD  VALUES ('086810.5354', 300000, 'Viettel', N'Đẹp');

INSERT INTO SIMCARD  VALUES ('086850.21.86', 300000, 'Viettel', N'Đẹp');

INSERT INTO SIMCARD  VALUES ('086851.04.01', 300000, 'Viettel', N'Đẹp');

INSERT INTO SIMCARD  VALUES ('086850.17.15', 300000, 'Viettel', N'Đẹp');

---------------------------------------------------------------------------------