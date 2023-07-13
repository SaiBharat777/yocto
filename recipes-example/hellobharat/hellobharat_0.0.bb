DESCRIPTION = "Simple hello application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://hellobharat.c"

S = "${WORKDIR}"

DEPENDS = "mystatic"

do_compile() {
	${CC} hellobharat.c ${LDFLAGS} -o hellobharat -larp
}	

do_install() {
	install -d ${D}${bindir}
	install -m 0755 hellobharat ${D}${bindir}
}
