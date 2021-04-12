SUMMARY = "Organize packages to avoid duplication across all images"

inherit packagegroup

SUMMARY_RDEPENDS_packagegroup-lkft-testsuites = "Test suites used by LKFT"
RDEPENDS_packagegroup-lkft-testsuites = "\
    ${@bb.utils.contains("TUNE_ARCH", "arm", "", "fwts", d)} \
    igt-gpu-tools \
    igt-gpu-tools-benchmarks \
    igt-gpu-tools-tests \
    kernel-selftests \
    kselftests-mainline \
    kselftests-next \
    libhugetlbfs-tests \
    ltp \
    ${@bb.utils.contains_any("TUNE_ARCH", "arm i686", "", "packetdrill", d)} \
    perf-tests \
    s-suite \
    "
