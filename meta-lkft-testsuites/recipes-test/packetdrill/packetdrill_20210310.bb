SUMMARY = "Packetdrill: Network stack testing tool"
DESCRIPTION = "The packetdrill scripting tool enables quick, precise tests for \
entire TCP/UDP/IPv4/IPv6 network stacks, from the system call layer down to \
the NIC hardware."
HOMEPAGE = "https://github.com/google/packetdrill.git"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://gtests/net/packetdrill/COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/google/packetdrill.git;protocol=https"

SRCREV = "75fe342a88a74bb610a921a3090b3611a2624ff4"

S = "${WORKDIR}/git"

DEPENDS = "bison-native flex-native rsync-native libpcap"
RDEPENDS_${PN} = "bash ethtool net-tools python-core \
    iproute2-devlink \
    iproute2-genl \
    iproute2-ifstat \
    iproute2-ip \
    iproute2-lnstat \
    iproute2-nstat \
    iproute2-rtacct \
    iproute2-ss \
    iproute2-tc \
    iproute2-tipc \
"

do_compile() {
    cd ${S}/gtests/net/packetdrill
    oe_runmake
}

do_install() {
    cd ${S}/gtests/net/packetdrill
    install -D -m 0755 -t ${D}/opt/packetdrill/packetdrill/ \
        checksum_test \
        in_netns.sh \
        packet_parser_test \
        packet_to_string_test \
        packetdrill \
        run_all.py

    rsync -rLpDx ${S}/gtests/net/packetdrill/tests/ ${D}/opt/packetdrill/packetdrill/tests/
    rsync -rLpDx ${S}/gtests/net/common/ ${D}/opt/packetdrill/common/
    rsync -rLpDx ${S}/gtests/net/tcp/ ${D}/opt/packetdrill/tcp/
}

FILES_${PN} = "/opt/packetdrill/"
