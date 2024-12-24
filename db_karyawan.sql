/*
Navicat Premium Data Transfer
Source Server         : MariaDB
Source Server Type    : MySQL
Source Server Version : 80030 (8.0.30)
Source Host           : localhost:3306
Source Schema         : db_karyawan
Target Server Type    : MySQL
Target Server Version : 80030 (8.0.30)
File Encoding         : 65001
Date: 23/12/2024 20:29:41
*/

SET NAMES utf8mb4;

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for karyawan
-- ----------------------------
DROP TABLE IF EXISTS `karyawan`;

CREATE TABLE `karyawan` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `nama` varchar(255) CHARACTER SET utf8mb4 NOT NULL,
    `jenis_kelamin` enum('L', 'P') CHARACTER SET utf8mb4 NOT NULL,
    `divisi` varchar(255) CHARACTER SET utf8mb4 NOT NULL,
    `gaji` decimal(10, 2) NOT NULL,
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `username` varchar(50) CHARACTER SET utf8mb4 NOT NULL,
    `password` varchar(255) CHARACTER SET utf8mb4 NOT NULL,
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;