package moe.peanutmelonseedbigalmond.pixiv.net

import java.security.SecureRandom
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLSocketFactory

object MySslSocketFactory {
    val getSSLSocketFactory: SSLSocketFactory
        get() {
            val sslContext=SSLContext.getInstance("SSL").also {
                it.init(null, arrayOf(MyTrustManager), SecureRandom())
            }
            return sslContext.socketFactory
        }
}