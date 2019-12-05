SUMMARY = "Organize packages to avoid duplication across all images"

inherit packagegroup

# contains basic dependencies for LKFT
RDEPENDS_packagegroup-rpb-lkft = "\
    android-kernel-tests \
    git \
    grep \
    haveged \
    jq \
    kernel-selftests \
    kselftests-mainline \
    kselftests-next \
    libgpiod \
    ${@bb.utils.contains("TUNE_ARCH", "arm", "", "numactl", d)} \
    perf \
    qemu \
    tzdata \
    xz \
    "
