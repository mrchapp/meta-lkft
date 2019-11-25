SUMMARY = "Linux Kernel Selftests (mainline)"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://www.kernel.org/pub/linux/kernel/v5.x/linux-${PV}.tar.xz"
# Patches inappropriate or not yet merged by upstream
# Some patches may have been submitted to upstream
SRC_URI += "\
    file://0001-selftests-lib-allow-to-override-CC-in-the-top-level-Makefile.patch \
"

SRC_URI[md5sum] = "ce9b2d974d27408a61c53a30d3f98fb9"
SRC_URI[sha256sum] = "bf338980b1670bca287f9994b7441c2361907635879169c64ae78364efc5f491"

S = "${WORKDIR}/linux-${PV}"

export INSTALL_PATH = "/opt/kselftests/mainline"

require kselftests-common.inc
