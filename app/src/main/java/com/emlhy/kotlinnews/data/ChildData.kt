package com.emlhy.kotlinnews.data


import com.google.gson.annotations.SerializedName

data class ChildData(
    @SerializedName("all_awardings")
    val allAwardings: List<Any>,
    @SerializedName("allow_live_comments")
    val allowLiveComments: Boolean,
    @SerializedName("approved_at_utc")
    val approvedAtUtc: Any,
    @SerializedName("approved_by")
    val approvedBy: Any,
    val archived: Boolean,
    val author: String,
    @SerializedName("author_flair_background_color")
    val authorFlairBackgroundColor: Any,
    @SerializedName("author_flair_css_class")
    val authorFlairCssClass: String,
    @SerializedName("author_flair_richtext")
    val authorFlairRichtext: List<Any>,
    @SerializedName("author_flair_template_id")
    val authorFlairTemplateId: String,
    @SerializedName("author_flair_text")
    val authorFlairText: String,
    @SerializedName("author_flair_text_color")
    val authorFlairTextColor: String,
    @SerializedName("author_flair_type")
    val authorFlairType: String,
    @SerializedName("author_fullname")
    val authorFullname: String,
    @SerializedName("author_patreon_flair")
    val authorPatreonFlair: Boolean,
    val awarders: List<Any>,
    @SerializedName("banned_at_utc")
    val bannedAtUtc: Any,
    @SerializedName("banned_by")
    val bannedBy: Any,
    @SerializedName("can_gild")
    val canGild: Boolean,
    @SerializedName("can_mod_post")
    val canModPost: Boolean,
    val category: Any,
    val clicked: Boolean,
    @SerializedName("content_categories")
    val contentCategories: Any,
    @SerializedName("contest_mode")
    val contestMode: Boolean,
    val created: Double,
    @SerializedName("created_utc")
    val createdUtc: Double,
    @SerializedName("discussion_type")
    val discussionType: Any,
    val distinguished: Any,
    val domain: String,
    val downs: Int,
    val edited: Any,
    val gilded: Int,
    val gildings: Gildings,
    val hidden: Boolean,
    @SerializedName("hide_score")
    val hideScore: Boolean,
    val id: String,
    @SerializedName("is_crosspostable")
    val isCrosspostable: Boolean,
    @SerializedName("is_meta")
    val isMeta: Boolean,
    @SerializedName("is_original_content")
    val isOriginalContent: Boolean,
    @SerializedName("is_reddit_media_domain")
    val isRedditMediaDomain: Boolean,
    @SerializedName("is_robot_indexable")
    val isRobotIndexable: Boolean,
    @SerializedName("is_self")
    val isSelf: Boolean,
    @SerializedName("is_video")
    val isVideo: Boolean,
    val likes: Any,
    @SerializedName("link_flair_background_color")
    val linkFlairBackgroundColor: String,
    @SerializedName("link_flair_css_class")
    val linkFlairCssClass: Any,
    @SerializedName("link_flair_richtext")
    val linkFlairRichtext: List<Any>,
    @SerializedName("link_flair_text")
    val linkFlairText: Any,
    @SerializedName("link_flair_text_color")
    val linkFlairTextColor: String,
    @SerializedName("link_flair_type")
    val linkFlairType: String,
    val locked: Boolean,
    val media: Any,
    @SerializedName("media_embed")
    val mediaEmbed: MediaEmbed,
    @SerializedName("media_only")
    val mediaOnly: Boolean,
    @SerializedName("mod_note")
    val modNote: Any,
    @SerializedName("mod_reason_by")
    val modReasonBy: Any,
    @SerializedName("mod_reason_title")
    val modReasonTitle: Any,
    @SerializedName("mod_reports")
    val modReports: List<Any>,
    val name: String,
    @SerializedName("no_follow")
    val noFollow: Boolean,
    @SerializedName("num_comments")
    val numComments: Int,
    @SerializedName("num_crossposts")
    val numCrossposts: Int,
    @SerializedName("num_reports")
    val numReports: Any,
    @SerializedName("over_18")
    val over18: Boolean,
    @SerializedName("parent_whitelist_status")
    val parentWhitelistStatus: String,
    val permalink: String,
    val pinned: Boolean,
    @SerializedName("post_hint")
    val postHint: String,
    val preview: Preview,
    val pwls: Int,
    val quarantine: Boolean,
    @SerializedName("removal_reason")
    val removalReason: Any,
    @SerializedName("report_reasons")
    val reportReasons: Any,
    val saved: Boolean,
    val score: Int,
    @SerializedName("secure_media")
    val secureMedia: Any,
    @SerializedName("secure_media_embed")
    val secureMediaEmbed: SecureMediaEmbed,
    val selftext: String,
    @SerializedName("selftext_html")
    val selftextHtml: String,
    @SerializedName("send_replies")
    val sendReplies: Boolean,
    val spoiler: Boolean,
    @SerializedName("steward_reports")
    val stewardReports: List<Any>,
    val stickied: Boolean,
    val subreddit: String,
    @SerializedName("subreddit_id")
    val subredditId: String,
    @SerializedName("subreddit_name_prefixed")
    val subredditNamePrefixed: String,
    @SerializedName("subreddit_subscribers")
    val subredditSubscribers: Int,
    @SerializedName("subreddit_type")
    val subredditType: String,
    @SerializedName("suggested_sort")
    val suggestedSort: Any,
    val thumbnail: String,
    @SerializedName("thumbnail_height")
    val thumbnailHeight: Int,
    @SerializedName("thumbnail_width")
    val thumbnailWidth: Int,
    val title: String,
    @SerializedName("total_awards_received")
    val totalAwardsReceived: Int,
    val ups: Int,
    val url: String,
    @SerializedName("user_reports")
    val userReports: List<Any>,
    @SerializedName("view_count")
    val viewCount: Any,
    val visited: Boolean,
    @SerializedName("whitelist_status")
    val whitelistStatus: String,
    val wls: Int
)