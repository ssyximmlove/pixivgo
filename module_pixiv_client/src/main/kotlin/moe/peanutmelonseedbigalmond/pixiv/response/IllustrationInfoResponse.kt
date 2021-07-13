package moe.peanutmelonseedbigalmond.pixiv.response

import com.google.gson.annotations.SerializedName

class IllustrationInfoResponse {
    var isError = false
    var message: String? = null
    var body: BodyBean? = null

    class BodyBean {
        var illustId: String? = null
        var illustTitle: String? = null
        var illustComment: String? = null
        var id: String? = null
        var title: String? = null
        var description: String? = null
        var illustType = 0
        var createDate: String? = null
        var uploadDate: String? = null
        var restrict = 0
        var xRestrict = 0
        var sl = 0
        var urls: UrlsBean? = null
        var tags: TagsBean? = null
        var userId: String? = null
        var userName: String? = null
        var userAccount: String? = null
        var isLikeData = false
        var width = 0
        var height = 0
        var pageCount = 0
        var bookmarkCount = 0
        var likeCount = 0
        var commentCount = 0
        var responseCount = 0
        var viewCount = 0

        class UrlsBean {
            var mini: String? = null
            var thumb: String? = null
            var small: String? = null
            var regular: String? = null
            var original: String? = null
        }

        class TagsBean {
            @SerializedName("tags")
            var innerTags: List<InnerTagsBean>? = null

            class InnerTagsBean {
                var tag: String? = null
                var isLocked = false
                var isDeletable = false
                var userId: String? = null
                var translation: TranslationBean? = null
                var userName: String? = null

                class TranslationBean {
                    var en: String? = null
                }
            }
        }
    }
}