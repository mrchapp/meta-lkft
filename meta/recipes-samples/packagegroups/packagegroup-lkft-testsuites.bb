SUMMARY = "Organize packages to avoid duplication across all images"

inherit packagegroup

SUMMARY_RDEPENDS_packagegroup-lkft-testsuites = "Test suites used by LKFT"
RDEPENDS_packagegroup-lkft-testsuites = "\
    igt-gpu-tools \
    igt-gpu-tools-benchmarks \
    igt-gpu-tools-tests \
    kernel-selftests \
    kselftests-mainline \
    kselftests-next \
    libhugetlbfs-tests \
    ltp \
    s-suite \
    "
