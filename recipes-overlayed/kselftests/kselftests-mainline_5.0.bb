SUMMARY = "Linux Kernel Selftests (mainline)"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://www.kernel.org/pub/linux/kernel/v4.x/linux-${PV}.tar.xz"
# Patches inappropriate or not yet merged by upstream
# Some patches may have been submitted to upstream
SRC_URI += "\
    file://0001-selftests-lib-allow-to-override-CC-in-the-top-level-Makefile.patch \
"

SRC_URI[md5sum] = "7381ce8aac80a01448e065ce795c19c0"
SRC_URI[sha256sum] = "437b141a6499159f5a7282d5eb4b2be055f8e862ccce44d7464e8759c31a2e43"

S = "${WORKDIR}/linux-${PV}"

export INSTALL_PATH = "/opt/kselftests/mainline"

require kselftests-common.inc
