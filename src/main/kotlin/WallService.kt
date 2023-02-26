class WallService {

    var Wall: Array<Post> = emptyArray()

    fun add(post: Post): Post {
        post.id = System.currentTimeMillis().toInt()
        Wall = Wall.plus(post)
        println(Wall.size)
        return post
    }

    fun update(post: Post): Boolean {
        val updatePost = Wall.find { it.id == post.id }
        var result: Boolean
        if (updatePost != null) {
            val index = Wall.indexOf(updatePost)
            Wall.set(index, post)
            result = true
        } else result = false
        return result
    }

    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comments>()

    fun createComment(postId: Int, comments: Comments): Comments {
        var a = 0
        while (a < posts.size) {
            if (posts[a].id == postId) {
                posts[a].comments = comments
                return comments
            } else {
                a++
            }
        }
        throw PostNotFoundException("Не найден пост с таким id")
    }}

