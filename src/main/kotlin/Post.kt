data class Post(
    var id:Int = 0,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text:String,
    val replyOwnerId:Int,
    val replyPostId: Int,
    val friendOnly: Boolean = true,
    val comments :Comments,
    val likes: Likes,
    var canPost:Boolean
)