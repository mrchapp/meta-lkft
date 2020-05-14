SUMMARY = "Organize packages to avoid duplication across all images"

inherit packagegroup

PROVIDES = "${PACKAGES}"
PACKAGES = "\
    packagegroup-lkft-tools \
    packagegroup-lkft-tools-basic-tools \
    packagegroup-lkft-tools-python \
    packagegroup-lkft-tools-python3 \
    "

RDEPENDS_packagegroup-lkft-tools = "\
    packagegroup-core-buildessential \
    packagegroup-lkft-tools-basics \
    packagegroup-lkft-tools-python \
    packagegroup-lkft-tools-python3 \
    "

SUMMARY_RDEPENDS_packagegroup-lkft-tools = "Basic tools and libraries for LKFT"
RDEPENDS_packagegroup-lkft-tools-basics = "\
    cpupower \
    git \
    grep \
    haveged \
    jq \
    libgpiod \
    ${@bb.utils.contains("TUNE_ARCH", "arm", "", "numactl", d)} \
    perf \
    qemu \
    tzdata \
    usbutils \
    xz \
    "

SUMMARY_packagegroup-lkft-tools-python = "Python support for running tests"
RDEPENDS_packagegroup-lkft-tools-python = "\
    python \
    python-misc \
    python-modules \
    python-pexpect \
    python-pip \
    python-pyyaml \
    "

SUMMARY_packagegroup-lkft-tools-python3 = "Python3 support for running tests"
RDEPENDS_packagegroup-lkft-tools-python3 = "\
    python3 \
    python3-misc \
    python3-modules \
    "
