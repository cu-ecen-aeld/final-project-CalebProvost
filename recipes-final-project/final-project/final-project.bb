SUMMARY = "AESD Course Project Layer"
HOMEPAGE = "https://aesd-course-project.github.io/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/cu-ecen-5013/final-project-ZachTurner07.git;branch=develop;lfs=0"
SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"
S = "${WORKDIR}/git"

do_configure () {
	:
}

do_compile () {
	oe_runmake
}

# TODO: Uncomment and adjust when init-scripts are finished
# inherit update-rc.d
# INITSCRIPT_PACKAGES = "${PN}"
# INITSCRIPT_NAME_${PN} = "uartserver-start-stop"

# TODO: Uncomment and adjust when init-scripts are finished
# do_install () {
#     install -d ${D}${bindir}
#     install -m 0755 ${S}/uartserver ${D}${bindir}/
#     install -d ${D}${sysconfdir}/init.d/
#     install -m 0755 ${S}/uartserver-start-stop ${D}${sysconfdir}/init.d/
# }
# TODO: Remove for adjusted version above
do_install () {
    install -d ${D}${bindir}
    install -m 0755 ${S}/uartserver ${D}${bindir}/
}

FILES_${PN} += " ${bindir}/uartserver"
