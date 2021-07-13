package moe.peanutmelonseedbigalmond.pixiv.net

import javax.net.ssl.HostnameVerifier
import javax.net.ssl.SSLSession

object MyHostnameVerifier : HostnameVerifier {
    override fun verify(hostname: String?, session: SSLSession?): Boolean = true
}