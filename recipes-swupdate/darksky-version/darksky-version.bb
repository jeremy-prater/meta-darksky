LICENSE="CLOSED"

SRC_URI += "file://hwrevision"
SRC_URI += "file://sw-versions"

do_install() {
    install -d ${D}/etc
    install -m 0644 ${WORKDIR}/hwrevision ${D}/etc
    install -m 0644 ${WORKDIR}/sw-versions ${D}/etc
}

FILES_${PN} += "/etc/hwrevision"
FILES_${PN} += "/etc/sw-versions"
