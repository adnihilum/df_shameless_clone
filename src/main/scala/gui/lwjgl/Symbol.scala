package gui.lwjgl

import org.lwjgl.opengl.GL11._

case class Symbol(textureId: Int, texX: Double, texY: Double, texWidth: Double, texHeight: Double) {
  def render(x: Int, y: Int, width: Int, height: Int) = {
    //println(s"printed symbol pos: ($x, $y) x ($texX, $texY) x ($texWidth, $texHeight)")
    glEnable(GL_TEXTURE_2D)
    //glDisable(GL_TEXTURE_2D)
    //glPolygonMode(GL_FRONT_AND_BACK, GL_LINE)
    glColor3f(0.0f, 0.0f, 0.0f)

    glBegin(GL_QUADS)
    glTexCoord2d(texX, texY)
    glVertex2d(x, y)
    glTexCoord2d(texWidth + texX, texY)
    glVertex2f(width + x, y)
    glTexCoord2d(texWidth + texX, texHeight + texY)
    glVertex2f(width + x, height + y)
    glTexCoord2d(texX, texHeight + texY)
    glVertex2f(x, height + y)
    glEnd()
  }
}
