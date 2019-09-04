SUMMARY = "Linux Kernel Selftests (mainline)"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://www.kernel.org/pub/linux/kernel/v5.x/linux-${PV}.tar.xz"
# Patches inappropriate or not yet merged by upstream
# Some patches may have been submitted to upstream
SRC_URI += "\
    file://0001-selftests-lib-allow-to-override-CC-in-the-top-level-Makefile.patch \
"

SRC_URI[md5sum] = "338635887688b6563f3b9e57d41ed73f"
SRC_URI[sha256sum] = "56495f82314f0dfb84a3fe7fad78e17be69c4fd36ef46f2452458b2fa1e341f6"

S = "${WORKDIR}/linux-${PV}"

export INSTALL_PATH = "/opt/kselftests/mainline"

require kselftests-common.inc
