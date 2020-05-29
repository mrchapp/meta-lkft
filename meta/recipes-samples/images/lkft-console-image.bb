SUMMARY = "Basic console image for LKFT"

IMAGE_FEATURES += "debug-tweaks hwcodecs package-management splash ssh-server-openssh tools-debug"

# Add 1 GB of extra space on image, but not on X15, only
# add 256 MB there; more than that might exceed the
# userdata partition capacity.
IMAGE_ROOTFS_EXTRA_SPACE = "1048576"
IMAGE_ROOTFS_EXTRA_SPACE_am57xx-evm = "262144"

LICENSE = "MIT"

inherit core-image features_check extrausers

CORE_IMAGE_BASE_INSTALL += " \
    kernel-modules \
    packagegroup-lkft-testsuites \
    packagegroup-lkft-tools \
    "

EXTRA_USERS_PARAMS = "\
useradd -p '' linaro; \
"
