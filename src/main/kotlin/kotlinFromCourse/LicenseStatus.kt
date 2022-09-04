package kotlinFromCourse

/**
 * 密封类
 */
sealed class LicenseStatus {
    object UN : LicenseStatus()

    object LE : LicenseStatus()

    class QU(val licenseId: String) : LicenseStatus()
}

class Driver(var status: LicenseStatus) {
    fun checkLicense(): String {
        return when (status) {
            is LicenseStatus.UN -> "NO"
            is LicenseStatus.LE -> "Learning"
            is LicenseStatus.QU -> "Yes,Your Id : ${(status as LicenseStatus.QU).licenseId}"
        }
    }
}

fun main() {
    val driver = Driver(LicenseStatus.QU("100"))
    println(driver.checkLicense())
}