package moe.peanutmelonseedbigalmond.pixiv.response

class ImagesInfoResponse {
    var isError = false
    var message: String? = null
    var body: List<BodyBean>? = null

    class BodyBean {
        var urls: UrlsBean? = null
        var width = 0
        var height = 0

        class UrlsBean {
            var thumb_mini: String? = null
            var small: String? = null
            var regular: String? = null
            var original: String? = null
        }
    }
}