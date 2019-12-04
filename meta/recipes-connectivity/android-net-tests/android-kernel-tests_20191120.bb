SUMMARY = "Android kernel tests"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://all_tests.py;beginline=3;endline=15;md5=baeefd6a590bac16e3db41a85bf40907"

ANDROID_MIRROR = "android.googlesource.com"

DEPENDS = "rsync-native"
SRCREV = "277404bee6f570f078fe63a3df4f0fbeaf2d1171"
SRC_URI = "git://${ANDROID_MIRROR}/kernel/tests;protocol=https;branch=master"

S = "${WORKDIR}/git/net/test"
B = "${WORKDIR}/${BPN}"

do_install() {
    install -d ${D}/opt/android-kernel-tests
    rsync -rlpDx --exclude=.gitignore ${S}/ ${D}/opt/android-kernel-tests
}

RDEPENDS_${PN} = "bash coreutils python python-scapy"

FILES_${PN} = "/opt/android-kernel-tests/"
