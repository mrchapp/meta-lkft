DESCRIPTION = "Packet crafting/sending/sniffing, PCAP processing tool, based on scapy"
SECTION = "devel/python"
HOMEPAGE = "https://scapy.net/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=5d764b6cb74670fe807b284f52d36ee8"

inherit pypi setuptools

PYPI_PACKAGE = "scapy"

SRC_URI[md5sum] = "469ae6f5615799a5de3f3b4eb217b18d"
SRC_URI[sha256sum] = "e2f8d11f6a941c14a789ae8b236b27bd634681f1b29b5e893861e284d234f6b0"
