-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 05 Des 2022 pada 12.51
-- Versi server: 10.4.27-MariaDB
-- Versi PHP: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpustakaan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `anggota`
--

CREATE TABLE `anggota` (
  `ID_Anggota` varchar(5) NOT NULL,
  `Nama_Anggota` varchar(50) NOT NULL,
  `Tgl_Lahir` date NOT NULL,
  `Alamat` varchar(100) NOT NULL,
  `Email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku`
--

CREATE TABLE `buku` (
  `ID_Buku` varchar(5) NOT NULL,
  `Judul_Buku` varchar(50) NOT NULL,
  `Pengarang` varchar(50) NOT NULL,
  `Penerbit` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `peminjaman`
--

CREATE TABLE `peminjaman` (
  `ID_Peminjaman` varchar(5) NOT NULL,
  `ID_Anggota` varchar(5) NOT NULL,
  `ID_Buku` varchar(5) NOT NULL,
  `Tgl_Pinjam` date NOT NULL,
  `ID_Pustakawan` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengembalian`
--

CREATE TABLE `pengembalian` (
  `ID_Pengembalian` varchar(5) NOT NULL,
  `ID_Anggota` varchar(5) NOT NULL,
  `ID_Buku` varchar(5) NOT NULL,
  `Tgl_Pinjam` date NOT NULL,
  `Tgl_Pengembalian` date NOT NULL,
  `ID_Pustakawan` varchar(5) NOT NULL,
  `Denda` varchar(7) NOT NULL,
  `ID_Peminjaman` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `perpanjangan`
--

CREATE TABLE `perpanjangan` (
  `ID_Perpanjang` varchar(5) NOT NULL,
  `ID_Pengembalian` varchar(5) NOT NULL,
  `ID_Anggota` varchar(5) NOT NULL,
  `ID_Pustakawan` varchar(5) NOT NULL,
  `Tgl_Pinjam` date NOT NULL,
  `Tgl_Pengembalian` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pustakawan`
--

CREATE TABLE `pustakawan` (
  `ID_Pustakawan` varchar(5) NOT NULL,
  `Nama_Pustakawan` varchar(50) NOT NULL,
  `Tgl_Lahir` date NOT NULL,
  `Alamat` varchar(100) NOT NULL,
  `Email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`ID_Anggota`),
  ADD KEY `ID_Anggota` (`ID_Anggota`);

--
-- Indeks untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`ID_Buku`);

--
-- Indeks untuk tabel `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`ID_Peminjaman`),
  ADD KEY `ID_Anggota` (`ID_Anggota`),
  ADD KEY `ID_Buku` (`ID_Buku`),
  ADD KEY `ID_Pustakawan` (`ID_Pustakawan`);

--
-- Indeks untuk tabel `pengembalian`
--
ALTER TABLE `pengembalian`
  ADD PRIMARY KEY (`ID_Pengembalian`),
  ADD KEY `ID_Peminjaman` (`ID_Peminjaman`);

--
-- Indeks untuk tabel `perpanjangan`
--
ALTER TABLE `perpanjangan`
  ADD PRIMARY KEY (`ID_Perpanjang`),
  ADD KEY `ID_Pengembalian` (`ID_Pengembalian`);

--
-- Indeks untuk tabel `pustakawan`
--
ALTER TABLE `pustakawan`
  ADD PRIMARY KEY (`ID_Pustakawan`),
  ADD KEY `ID_Pustakawan` (`ID_Pustakawan`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD CONSTRAINT `peminjaman_ibfk_1` FOREIGN KEY (`ID_Anggota`) REFERENCES `anggota` (`ID_Anggota`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `peminjaman_ibfk_2` FOREIGN KEY (`ID_Buku`) REFERENCES `buku` (`ID_Buku`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `peminjaman_ibfk_3` FOREIGN KEY (`ID_Pustakawan`) REFERENCES `pustakawan` (`ID_Pustakawan`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `pengembalian`
--
ALTER TABLE `pengembalian`
  ADD CONSTRAINT `pengembalian_ibfk_1` FOREIGN KEY (`ID_Peminjaman`) REFERENCES `peminjaman` (`ID_Peminjaman`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `perpanjangan`
--
ALTER TABLE `perpanjangan`
  ADD CONSTRAINT `perpanjangan_ibfk_1` FOREIGN KEY (`ID_Pengembalian`) REFERENCES `pengembalian` (`ID_Pengembalian`) ON DELETE NO ACTION ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
