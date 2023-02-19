import org.junit.jupiter.api.Assertions.*

class WallServiceTest {

    @org.junit.jupiter.api.Test
    fun add() {
        val comments = Comments(1, true, true, true, true)
        val likes = Likes(1, true, true, true)
        val post = Post(
            0, ownerId = 1, 1, 1, 1, "Текст тестового поста", 1, 1, true, comments, likes, true
        )

        val wall = WallService()
        wall.add(post)
        assertTrue(wall.Wall[0].id != 0)
    }

    @org.junit.jupiter.api.Test
    fun updateFalse() {
        val comments = Comments(1, true, true, true, true)
        val likes = Likes(1, true, true, true)
        val post = Post(
            0, ownerId = 1, 1, 1, 1, "Текст тестового поста", 1, 1, true, comments, likes, true
        )

        val wall = WallService()
        assertFalse(wall.update(post))
    }
    @org.junit.jupiter.api.Test
    fun updateTrue() {
        val comments = Comments(1, true, true, true, true)
        val likes = Likes(1, true, true, true)
        val post = Post(
            0, ownerId = 1, 1, 1, 1, "Текст тестового поста", 1, 1, true, comments, likes, true
        )
        val wall = WallService()
        wall.add(post)
        post.canPost = false
        assertTrue(wall.update(post))
    }
}