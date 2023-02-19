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
            Wall.set(index,post)
            result = true
        } else result = false
        return result
    }
}