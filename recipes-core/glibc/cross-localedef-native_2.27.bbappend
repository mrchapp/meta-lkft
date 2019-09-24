FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = " file://0032-argp-do-not-call-_IO_fwide-if-_LIBC-is-not-defined.patch"
