SUMMARY = "netsniff-ng is a Swiss army knife for your daily Linux network plumbing"
DESCRIPTION = "netsniff-ng is a free, performant Linux network analyzer and networking toolkit. If you will, the Swiss army knife for network packets."
HOMEPAGE = "http://netsniff-ng.org/"
SECTION = "console/utils"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=9dd40dfb621eed702c0775577fbb7011"

DEPENDS = "bison \
    flex \
    libcli \
    libnet \
    libpcap \
    ncurses \
"

SRCREV = "4c641508fbc500e57b55609b60b17870c158c70c"
SRC_URI = "git://github.com/netsniff-ng/netsniff-ng.git;protocol=https"

S = "${WORKDIR}/git"

inherit pkgconfig

PACKAGECONFIG ??= "libnl zlib"
PACKAGECONFIG[libnl] = "--enable-libnl,--disable-libnl,libnl"
PACKAGECONFIG[geoip] = "--enable-geoip,--disable-geoip,geoip"
PACKAGECONFIG[zlib] = "--enable-zlib,--disable-zlib,zlib"

do_configure() {
    ${S}/configure ${CONFIGUREOPTS} --prefix=${D}${prefix}
}

do_compile() {
    oe_runmake 'CC=${CC}' 'LD=${LD}' 'LDFLAGS=${LDFLAGS}'
}

do_install() {
    install -d ${D}${sbindir}
    install -d -m 0700 ${D}${sysconfdir}/netsniff-ng
    oe_runmake ETCDIR=${D}${sysconfdir} install
}

FILES_${PN} = "${sbindir} ${sysconfdir} ${datadir}"
