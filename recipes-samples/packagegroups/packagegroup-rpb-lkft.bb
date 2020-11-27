SUMMARY = "Organize packages to avoid duplication across all images"

inherit packagegroup

# contains basic dependencies for LKFT
RDEPENDS_packagegroup-rpb-lkft = "\
    android-kernel-tests \
    fwts \
    git \
    grep \
    haveged \
    igt-gpu-tools \
    igt-gpu-tools-benchmarks \
    igt-gpu-tools-tests \
    jq \
    kernel-selftests \
    kselftests-mainline \
    kselftests-next \
    libgpiod \
    net-snmp \
    ${@bb.utils.contains("TUNE_ARCH", "arm", "", "numactl", d)} \
    perf \
    qemu \
    tzdata \
    xz \
    "
